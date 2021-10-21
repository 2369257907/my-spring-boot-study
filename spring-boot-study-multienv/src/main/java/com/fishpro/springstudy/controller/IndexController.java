package com.fishpro.springstudy.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author 86171
 */
@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    MultienvConfig multienvConfig;
    @RequestMapping("/")
    String index(){
        logger.info(multienvConfig.getDemoname());
        return "index" ;
    }
}
