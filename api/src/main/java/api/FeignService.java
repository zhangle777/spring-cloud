package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public interface FeignService {
  
  @RequestMapping(value = "/user/info",method = RequestMethod.GET)
  String findUser(@RequestParam(value = "name") String name);
  
}
