package adm.meetudy.util.aop;

import adm.meetudy.annotation.DefaultValidationOrder;
import adm.meetudy.annotation.ValidationMode;
import adm.meetudy.constant.error.ValidationType;
import adm.meetudy.annotation.customannotation.ValidationSequence;
import adm.meetudy.annotation.SequentialValidator;
import jakarta.validation.groups.Default;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Aspect
@Component
@RequiredArgsConstructor
public class ValidationGroupAspect {

    private final SequentialValidator validator;

//    @Around("execution(* *..*Controller.*(..)) && !within(front.meetudy.controller.chat.ChatController)")
    @Around("execution(* *..*Controller.*(..))")
    public Object validateHttpControllersOnly(ProceedingJoinPoint joinPoint) throws Throwable {
        for (Object arg : joinPoint.getArgs()) {
            if (arg == null) continue;

            Class<?>[] groupOrder = getValidationOrder(arg.getClass());
            if (groupOrder != null) {
                ValidationType type = getValidationType(arg.getClass());
                if (type == ValidationType.ALL) {
                    validator.validateAll(arg, groupOrder);
                } else {
                    validator.validate(arg, groupOrder);
                }
            }
        }
        return joinPoint.proceed();
    }

    private Class<?>[] getValidationOrder(Class<?> clazz) {
        if (!clazz.getSimpleName().endsWith("ReqDto")) return null;
        if (!hasValidationGroups(clazz)) return null;

        ValidationSequence sequence = clazz.getAnnotation(ValidationSequence.class);
        return (sequence != null) ? sequence.value() : DefaultValidationOrder.ORDER;
    }

    private boolean hasValidationGroups(Class<?> clazz) {
        for (Field field : clazz.getDeclaredFields()) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                try {
                    Object groups = annotation.annotationType().getMethod("groups").invoke(annotation);
                    if (groups instanceof Class<?>[] g && g.length > 0 && !g[0].equals(Default.class)) {
                        return true;
                    }
                } catch (NoSuchMethodException ignored) {
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }

    private ValidationType getValidationType(Class<?> clazz) {
        ValidationMode mode = clazz.getAnnotation(ValidationMode.class);
        return (mode != null) ? mode.value() : ValidationType.SINGLE;
    }

}
