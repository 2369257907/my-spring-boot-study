package com.fishpro.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 86171
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("hello", "hello freemarker");
        return "index";
    }
}
