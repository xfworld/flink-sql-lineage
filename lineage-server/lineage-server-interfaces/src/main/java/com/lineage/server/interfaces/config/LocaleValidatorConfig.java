package com.lineage.server.interfaces.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

/**
 * @description: LocaleValidatorConfig
 * @author: HamaWhite
 * @version: 1.0.0
 * @date: 2023/2/8 10:39 PM
 */
@Configuration
public class LocaleValidatorConfig {
    @Bean
    LocaleResolver localeResolver() {
        // force english for spring-boot-starter-validation error messages
        return new FixedLocaleResolver(Locale.ENGLISH);
    }
}