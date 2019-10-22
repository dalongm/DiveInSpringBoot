package com.imooc.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DiveInSpringBootApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DiveInSpringBootApplication.class)
                .run(args);
        // SpringApplication.run(DiveInSpringBootApplication.class, args);
    }

}
