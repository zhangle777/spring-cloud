package com.zhangle.service_ribbon.service.serviceImpl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhangle.service_ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDao implements UserService {
  
  @Autowired
  RestTemplate restTemplate;
  
  /**
   * 开启熔断器机制，如果请求失败异常时，调用error方法。
   * @param name
   * @return
   */
  @HystrixCommand(fallbackMethod = "error")
  @Override
  public String test(String name) {
    return restTemplate.getForObject("http://eureka-client/user/find?name="+name,String.class);
  }
  
  public String error(String name){
    return "sorry error"+"==="+name;
  }
  
}
