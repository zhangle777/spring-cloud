package com.zhangle.eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient 表示这是一个服务客户端
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaClientApplication.class, args);
  }

}

