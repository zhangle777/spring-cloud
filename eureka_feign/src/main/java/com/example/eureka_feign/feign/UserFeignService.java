package com.example.eureka_feign.feign;

import api.FeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
@Service
@FeignClient(value = "eureka-client",configuration = FeignConfiguration.class)
public interface UserFeignService extends FeignService {
}
