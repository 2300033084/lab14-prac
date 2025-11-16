package com.klef.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendJenkinsApplication {

    
    public static void main(String[] args) {
        SpringApplication.run(BackendJenkinsApplication.class, args);
        System.out.println("Backend Jenkins Application is Running...");
    }
}