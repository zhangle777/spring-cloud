package com.zhangle.service_zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * zuul实现请求过滤
 */
@Component
public class Filter extends ZuulFilter {
  public static final Logger log = LoggerFactory.getLogger(Filter.class);
  
  /**
   * filterType一共有4种类型
   * pre:可以在请求被路由之前调用，用在路由映射的阶段是寻找路由映射表的
   * routing:在路由请求时候被调用，具体的路由转发过滤器是在routing路由器具体的请求转发的时候会调用
   * error:处理请求时发生错误时被调用
   * post:当routing，error运行完后才会调用该过滤器，是在最后阶段的
   * @return
   */
  @Override
  public String filterType() {
    return "pre";
  }
  
  /**
   * 自定义过滤器顺序，值越大越靠后执行，越小越优先执行
   * @return
   */
  @Override
  public int filterOrder() {
    return 0;
  }
  
  /**
   * 是否开启过滤器功能，当为true时，会调用run方法。执行过滤器逻辑。为false则不执行
   * @return
   */
  @Override
  public boolean shouldFilter() {
    return true;
  }
  
  @Override
  public Object run() throws ZuulException {
    RequestContext requestContext = RequestContext.getCurrentContext();
    HttpServletRequest request = requestContext.getRequest();
    log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
    String token = request.getParameter("token");
    if(!StringUtils.hasText(token)){
      requestContext.setSendZuulResponse(false);
      requestContext.setResponseStatusCode(401);
      requestContext.set("error","路由失败");
      try{
        requestContext.getResponse().setContentType("text/html;charset=UTF-8");
        requestContext.getResponse().getWriter().print("路由失败");
      }catch (IOException e){
      
      }
     
    }
    return null;
  }
}
