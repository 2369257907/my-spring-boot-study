package com.security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**

 * @author guoheng
 * @date 2021/11/10
 */

@Controller
public class HomeController {

    @ResponseBody
    @GetMapping(value = {"/","/home"})
    public String home(){
        return "Hello Spring Security !";
    }

}

