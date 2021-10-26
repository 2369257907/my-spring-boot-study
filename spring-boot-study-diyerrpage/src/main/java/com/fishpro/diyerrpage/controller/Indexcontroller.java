package com.fishpro.diyerrpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能:1、处理对index页面的访问
 *     2、通过抛出各种异常，实验@ControllerAdvice的全局拦截效果，对饮exception下的ControllerAdivice
 *     3、Controller和RestController的区别在于Controller返回的是视图，RestController返回的map、list等类型的数据
 *
 * @author guoheng
 * @date 2021/10/26
 */
@Controller
@RequestMapping("/index")
public class Indexcontroller {

    @RequestMapping("/matherr")
    public String matherr(){
        int i = 0;
        int j = i/0;
        return "index";
    }
}
