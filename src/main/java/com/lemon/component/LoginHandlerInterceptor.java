package com.lemon.component;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanjiawen
 * @date 2019/6/20 18:53
 * 登录检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
//    //目标方法执行之前
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object user = request.getSession().getAttribute("loginUser");
//        if(user == null){
//            //未登陆，返回登陆页面
//            request.setAttribute("msg","没有权限请先注册会员");
//            response.sendRedirect("/user/login");
//            return false;
//        }else{
//            //已登陆，放行请求
//            return true;
//        }
//
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
}
