package com.mycode.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 * @author 尔康
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 预处理，Controller方法执行前执行
     * @param request
     * @param response
     * @param handler
     * @return true就放行，执行下一个拦截器，如果没有就执行controller中的方法；
     * @return false不放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor拦截器执行了");
        return true;
    }

    /**
     * 后处理方法,在Controller执行之后，success执行之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle执行了...");
    }

    /**
     * success.jsp页面执行后，该方法执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion最后执行了...");

    }
}
