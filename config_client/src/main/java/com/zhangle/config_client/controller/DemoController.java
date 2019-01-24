package com.zhangle.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author byron
 * @date 2019/1/23 10:41
 */
@RestController
@RefreshScope
public class DemoController {

  @Value("${hello}")
  public String properties;

  @GetMapping(value = "/test")
  public String get(){
    return "这是"+properties;
  }
}
