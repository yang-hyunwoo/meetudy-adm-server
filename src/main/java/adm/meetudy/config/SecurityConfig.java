package adm.meetudy.config;

import adm.meetudy.config.jwt.JwtProcess;
import adm.meetudy.config.jwt.filter.JwtAuthorizationFilter;
import adm.meetudy.property.AdmJwtProperty;
import adm.meetudy.repository.member.MemberRepository;
import adm.meetudy.security.handler.CustomLogOutHandler;
import adm.meetudy.service.redis.RedisService;
import adm.meetudy.util.CustomAccessDeniedHandler;
import adm.meetudy.util.CustomAuthenticationEntryPoint;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig {

    private final CorsConfig corsConfig;
    private final MemberRepository memberRepository;
    private final JwtProcess jwtProcess;
    private final AdmJwtProperty admJwtProperty;
    private final RedisService redisService;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public JwtAuthorizationFilter jwtAuthorizationFilter(AuthenticationManager authenticationManager) {
        return new JwtAuthorizationFilter(authenticationManager, memberRepository, jwtProcess, admJwtProperty,redisService);
    }

    /**
     * 운영 환경
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    @Profile("prod")
    public SecurityFilterChain securityFilterChainProd(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = authenticationManager(http.getSharedObject(AuthenticationConfiguration.class));
        return buildSecurityFilterChain(http, authenticationManager, false);
    }

    /**
     * 로컬 환경
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    @Profile("local")
    public SecurityFilterChain securityFilterChainDev(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = authenticationManager(http.getSharedObject(AuthenticationConfiguration.class));
        return buildSecurityFilterChain(http, authenticationManager, true);
    }

    /**
     * 로컬 환경
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    @Profile("test")
    public SecurityFilterChain securityFilterChainTest(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = authenticationManager(http.getSharedObject(AuthenticationConfiguration.class));
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(cors -> cors.configurationSource(corsConfig.configurationSource()))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable)

                .addFilterBefore(jwtAuthorizationFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling(handler -> handler.authenticationEntryPoint(new CustomAuthenticationEntryPoint(admJwtProperty)))
                .exceptionHandling(handler -> handler.accessDeniedHandler(new CustomAccessDeniedHandler()))
                .logout(logout-> logout.logoutUrl("/api/logout").logoutSuccessHandler(new CustomLogOutHandler(jwtProcess,redisService)))
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/api/private/**","/api/user/**").authenticated()
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/swagger-resources/**",
                                "/webjars/**",
                                "/api/login"
                        ).permitAll()
                        .requestMatchers("/api/**").permitAll()
                        .anyRequest().permitAll()
                );
            http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));
        return http.build();
    }

    private SecurityFilterChain buildSecurityFilterChain(HttpSecurity http, AuthenticationManager authenticationManager, boolean isDev) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .cors(cors -> cors.configurationSource(corsConfig.configurationSource()))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable)
                .addFilterBefore(jwtAuthorizationFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling(handler -> handler.authenticationEntryPoint(new CustomAuthenticationEntryPoint(admJwtProperty)))
                .exceptionHandling(handler -> handler.accessDeniedHandler(new CustomAccessDeniedHandler()))
                .logout(logout-> logout.logoutUrl("/api/logout").logoutSuccessHandler(new CustomLogOutHandler(jwtProcess,redisService)))
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/swagger-resources/**",
                                "/webjars/**",
                                "/api/login"
                        ).permitAll()
                        .requestMatchers("/api/private/**","/api/user/**").authenticated()
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                        .anyRequest().permitAll()

                );

        if (isDev) {
            http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));
        } else {
            http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::deny));
        }

        return http.build();
    }
}
