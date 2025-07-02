package adm.meetudy.config.chatinterceptor;

import adm.meetudy.config.jwt.JwtProcess;
import adm.meetudy.repository.member.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Configuration
public class WebSocketInterceptorConfig {

    @Bean
    public HandshakeInterceptor jwtHandshakeInterceptor(JwtProcess jwtProcess, MemberRepository memberRepository, StudyGroupAuthValidator authValidator) {
        return new JwtHandshakeInterceptor(jwtProcess, memberRepository, authValidator);
    }
}