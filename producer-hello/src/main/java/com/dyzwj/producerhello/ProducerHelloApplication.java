package com.dyzwj.producerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerHelloApplication.class, args);
    }

}
