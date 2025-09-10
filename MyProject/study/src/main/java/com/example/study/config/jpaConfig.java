package com.example.study.config;

import com.example.study.component.LoginUserAuditorAware;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configurable
@EnableJpaAuditing
public class jpaConfig {
    @Bean
    public AuditorAware<String> auditorProvider() {
        return new LoginUserAuditorAware();
    }
}
