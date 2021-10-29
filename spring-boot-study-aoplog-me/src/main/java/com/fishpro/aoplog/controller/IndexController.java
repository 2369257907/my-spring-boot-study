package com.fishpro.aoplog.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author guoheng
 * @date 2021/10/29
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index(String name) throws InterruptedException {

        return "change";
    }
}
