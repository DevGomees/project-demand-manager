package com.example.demand.manager.flow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll() // libera o H2 Console
                        .anyRequest().permitAll() // opcional: libera tudo enquanto desenvolve
                )
                .csrf(csrf -> csrf.disable()) // necessário pro H2 funcionar
                .headers(headers -> headers.contentSecurityPolicy(csp -> csp.policyDirectives("frame-ancestors 'self'"))); // permite abrir o console em frame

        return http.build();
    }
}