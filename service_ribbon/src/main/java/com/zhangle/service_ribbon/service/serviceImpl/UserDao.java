package com.zhangle.service_ribbon.service.serviceImpl;

import com.zhangle.service_ribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDao implements UserService {
  
  @Autowired
  RestTemplate restTemplate;
  
  @Override
  public String test(String name) {
    return restTemplate.getForObject("http://eureka-client/user/info?name="+name,String.class);
  }
}
