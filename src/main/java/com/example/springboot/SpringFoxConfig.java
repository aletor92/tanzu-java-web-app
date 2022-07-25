package com.example.springboot;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.lang.annotation.Annotation;

@Configuration
public class SpringFoxConfig {                                    

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("demo-tap")
                .pathsToMatch("/**")
                .build();
    }
}
