package adm.meetudy;

import adm.meetudy.property.AdmJwtProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(AdmJwtProperty.class)
public class MeetudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetudyApplication.class, args);
	}

}
