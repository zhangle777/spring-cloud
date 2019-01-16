package com.zhangle.eureka_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author byron
 * @date 2019/1/16 11:34
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

  @GetMapping(value = "/info")
  public Object info(){
    return "ddds";
  }

}
