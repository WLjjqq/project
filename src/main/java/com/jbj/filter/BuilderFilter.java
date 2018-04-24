package com.jbj.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuilderFilter extends OncePerRequestFilter {
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("测试filter");
        ParameterRequestWrapper requestWrapper = new ParameterRequestWrapper(httpServletRequest);
        filterChain.doFilter(requestWrapper, httpServletResponse);
                System.out.println("############TestFilter1 doFilter after############");
    }
}
