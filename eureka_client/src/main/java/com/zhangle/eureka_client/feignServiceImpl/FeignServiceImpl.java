package com.zhangle.eureka_client.feignServiceImpl;

import api.FeignService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServiceImpl implements FeignService {
  
  @Value("${server.port}")
  String port;
  
  @Override
  public String findUser(String name) {
    Date now = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是"+"yyyy年MM月dd日 E kk点mm分" );
    String nowTime = simpleDateFormat.format( now );
    return "hello again " +port+"====="+name + ", " + nowTime;
  }
}
