package com.zhangle.eureka_client.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author byron
 * @date 2019/1/16 11:34
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {
  private final static Logger logging = LoggerFactory.getLogger(UserController.class);

  @Value("${server.port}")
  String port;
//
//
//  @GetMapping(value = "/info")
//  public String info(@RequestParam String name){
//
//    return "hi " + name + " ,i am from port:" + port;
//  }
  
  @GetMapping(value = "/find")
  public String find(@RequestParam String name){
    return "hi " + name + " ,i am from port:" + port;
  }

}
