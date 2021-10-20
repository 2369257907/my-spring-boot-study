package com.fishpro.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resonsecontroller {
    @GetMapping("/say")
    public String say(){
        return "你成功了！";
    }
}
