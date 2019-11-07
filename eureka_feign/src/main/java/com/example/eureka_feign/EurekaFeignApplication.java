package com.example.eureka_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(EurekaFeignApplication.class, args);
  }
  
}
