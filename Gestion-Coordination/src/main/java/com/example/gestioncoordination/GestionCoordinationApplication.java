package com.example.gestioncoordination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@SpringBootApplication
public class GestionCoordinationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionCoordinationApplication.class, args);
    }

}
