package adm.meetudy.constant.join;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.CONFLICT;

@AllArgsConstructor
@Getter
public enum JoinErrorCode {

    JI_DUPLICATION_EMAIL(CONFLICT, "중복된 이메일 입니다."),
    ;

    private final HttpStatus status;
    private final String message;

    }
