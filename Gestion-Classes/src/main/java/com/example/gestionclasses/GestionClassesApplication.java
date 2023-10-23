package com.example.gestionclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@Configuration
@EnableDiscoveryClient
@SpringBootApplication
public class GestionClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionClassesApplication.class, args);
    }

}
