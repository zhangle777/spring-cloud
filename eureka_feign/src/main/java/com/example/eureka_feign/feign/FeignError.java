package com.example.eureka_feign.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignError implements UserFeignService {
  
  @Override
  public String findUser(String name) {
    return "sorry "+name;
  }
}
