package adm.meetudy.constant.crypto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@AllArgsConstructor
@Getter
public enum CryptoErrorCode {

    ENCRYPTION_FAILED(INTERNAL_SERVER_ERROR, "암호화에 실패했습니다."),
    DECRYPTION_FAILED(BAD_REQUEST, "복호화에 실패했습니다.");

    private final HttpStatus httpStatus;
    private final String message;

}
