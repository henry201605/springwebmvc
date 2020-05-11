package org.nci.henry.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
//        log.info("--LoginInterceptor--preHandle----------");
        // 获得请求路径的uri
        String uri = request.getRequestURI();

        log.info("LoginInterceptor--preHandle-->{}", uri);
        return true;

      /*  // 判断路径是登出还是登录验证，是这两者之一的话执行Controller中定义的方法
        if(uri.endsWith("/login/auth") || uri.endsWith("/login/out")) {
            return true;
        }

        // 进入登录页面，判断session中是否有key，有的话重定向到首页，否则进入登录界面
        if(uri.endsWith("/login/") || uri.endsWith("/login")) {
            if(request.getSession() != null && request.getSession().getAttribute("loginUser") != null) {
                response.sendRedirect(request.getContextPath() + "/index");
            } else {
                return true;
            }
        }

        // 其他情况判断session中是否有key，有的话继续用户的操作
        if(request.getSession() != null && request.getSession().getAttribute("loginUser") != null) {
            return true;
        }

        // 最后的情况就是进入登录页面
        response.sendRedirect(request.getContextPath() + "/login");
        return false;*/
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
//        log.info("--LoginInterceptor--postHandle----------");
        // 获得请求路径的uri
        String uri = request.getRequestURI();

        log.info("LoginInterceptor--postHandle-->{}", uri);

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
//        log.info("--LoginInterceptor--afterCompletion----------");
        // 获得请求路径的uri
        String uri = request.getRequestURI();

        log.info("LoginInterceptor--afterCompletion-->{}", uri);

    }
}