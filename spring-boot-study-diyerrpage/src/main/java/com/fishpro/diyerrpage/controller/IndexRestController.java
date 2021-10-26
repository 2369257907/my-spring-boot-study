package com.fishpro.diyerrpage.controller;

import com.fishpro.diyerrpage.CustomException.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 *
 *  这里使用@RestController注解，返回的是是json类型的数据,
 *  这里将测试正常的返回以及在产生各种RunTimeException时，exceptionHandler包下的RestController对异常的处理
 * @author guoheng
 * @date 2021/10/26
 */
@RestController
@RequestMapping("api")
public class IndexRestController {
    /**
     * ArithmeticException异常
     */
    @RequestMapping("/matherr")
    public void matherr(){
        int i = 0;
        int j = 5/i;
    }

    /**
     * NullPointerException异常
     */
    @RequestMapping("nullpointer")
    public void nullpointer(){
        String s = null;
        System.out.println(s);
    }

    /**
     * MyException 自定义的异常
     */
    @RequestMapping("myexception")
    public void myexception(){
        throw new MyException(-1,"抛出了一个自定义的异常");
    }
}
