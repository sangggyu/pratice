package org.example.mvc;

import org.example.mvc.view.ModleAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HandlerAdapter {
    boolean supports(Object handler);

    ModleAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception;

}
