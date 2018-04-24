package com.jbj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("Interceptor你好");

        String bCity = httpServletRequest.getParameter("bCity");
        System.out.println("Interceptor得到bCity的值 "+bCity);
        bCity=bCity.trim();
        System.out.println("Interceptor修改后的值："+bCity);
        //Enumeration是一个枚举类。和Iterator差不多。也是判断有值没有。然后下一个。
   Enumeration<String> parameterNames = httpServletRequest.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String value=parameterNames.nextElement();
            System.out.println(value);
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        System.out.println("postHandler");
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        if(httpServletResponse.getStatus() == 400){
            
            System.out.println("helloworld");
        }
        System.out.println("afterCompletion");

    }
}
