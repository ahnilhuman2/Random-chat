package com.example.randomchat.config;

import com.example.randomchat.Base;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackageClasses = Base.class)
public class JpaConfig {
}
