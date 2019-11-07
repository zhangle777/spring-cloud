package com.example.eureka_feign.controller;

import com.example.eureka_feign.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
  @Autowired
  UserFeignService userFeignService;
  
  @RequestMapping(value = "/test")
  public String test(String name){
    return userFeignService.findUser(name);
  }
}
