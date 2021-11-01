package com.fishpro.diyerrpage.exceptionHandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 对由@Controller以及@RestController注解的类发生的异常进行处理，这是因为RestController类属于Controller类
 *
 * @author guoheng
 * @date 2021/10/26
 */
@ControllerAdvice(annotations = Controller.class)
public class controllerAdvice {

    @ExceptionHandler(Exception.class)
    public final ModelAndView handleAllExceptions(Exception ex, HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", ex);
        mv.addObject("url", request.getRequestURI());
        mv.setViewName("index");
        return mv;
    }

}
