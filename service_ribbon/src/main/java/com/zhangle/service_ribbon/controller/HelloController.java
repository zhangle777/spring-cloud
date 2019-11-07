package com.zhangle.service_ribbon.controller;

import com.zhangle.service_ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  @Autowired
  UserService userService;
  
  @GetMapping("/hello")
  public String test(String name){
    return userService.test(name);
  }
}
