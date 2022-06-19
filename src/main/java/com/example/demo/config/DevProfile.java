package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class DevProfile {
    @Bean(name = "devBean")
    public Object devBean() {
        return "this is a devBean";
    }
}
