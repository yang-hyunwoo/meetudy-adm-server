package adm.meetudy.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class AdmJwtProperty {

    private  String secretKey;

    private int expirationTime;

    private String tokenPrefix;

    private String header;

    private boolean useCookie; // true: 쿠키 사용 / false: 헤더 사용

    private int refreshTokenExpireDays;

}
