package com.example.eureka_feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-client",configuration = FeignConfiguration.class)
public interface UserFeignService {
  
  @RequestMapping(value = "/user/info",method = RequestMethod.GET)
  String findUser(@RequestParam(value = "name") String name);
  
}
