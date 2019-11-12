package com.example.eureka_feign.controller;

import com.example.eureka_feign.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
  /**
   * 当调用被@Feign的接口时，feign会通过动态代理创建一个代理对象。
   * 然后根据接口上的@RequestMapping、@Feign等注解来构造一个请求的服务器地址
   * 然后发送请求。解析响应
   */
  @Autowired
  UserFeignService userFeignService;
  
  @RequestMapping(value = "/test")
  public String test(String name){
    return userFeignService.findUser(name);
  }
  
  @GetMapping(value = "info")
  public String info(){
    return "哈哈哈哈哈哈";
  }
}
