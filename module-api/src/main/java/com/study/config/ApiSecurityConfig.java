package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

/**
 * Created by minkyukim
 * Created on 2025. 2. 4.
 * Description:
 **/


@Configuration
public class ApiSecurityConfig {

    /**
     * API 권한 설정
     */
    @Bean
    public Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> authorizeHttpRequestsCustomizer() {
        return http -> http.requestMatchers("/api/v1/**").hasRole("USER").anyRequest().permitAll();
    }
}