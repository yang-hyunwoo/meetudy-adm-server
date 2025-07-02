package adm.meetudy.annotation;


import adm.meetudy.constant.error.ValidationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static adm.meetudy.constant.error.ValidationType.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidationMode {
    ValidationType value() default SINGLE;
}

