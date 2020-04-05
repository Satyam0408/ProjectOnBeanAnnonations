package com.practice.configuration;

import com.practice.entities.Addition;
import com.practice.entities.Subtraction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfiguration {

    @Bean("prototype")
    public Addition getAdditionBean() {
        return new Addition("Addition operation performed");
    }

    @Scope("prototype")
    @Bean
    public Subtraction getSubtractionBean() {
        return new Subtraction("Subtraction operation performed");
    }
}