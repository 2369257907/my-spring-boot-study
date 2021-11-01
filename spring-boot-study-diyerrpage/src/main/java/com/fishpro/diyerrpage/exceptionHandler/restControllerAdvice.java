package com.fishpro.diyerrpage.exceptionHandler;

import com.fishpro.diyerrpage.CustomException.MyException;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：对IndexRestController抛出的异常进行处理
 *
 * @author guoheng
 * @date 2021/10/26
 */
@RestControllerAdvice(annotations = RestController.class)
public class restControllerAdvice {

    @ExceptionHandler(Exception.class)
    public Map HandleAllException(Exception ex, HttpRequest request) {

        HashMap map = new HashMap(3);
        map.put("status", 0);
        map.put("msg", ex);
        map.put("url", request.getURI());

        return map;
    }

    @ExceptionHandler(MyException.class)
    public Map HandleMyException(Exception ex) {
        HashMap map = new HashMap(2);
        map.put("status", -1);
        map.put("msg", ex.toString());

        return map;
    }
}
