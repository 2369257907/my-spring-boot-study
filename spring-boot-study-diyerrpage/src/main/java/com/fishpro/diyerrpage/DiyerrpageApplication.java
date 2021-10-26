package com.fishpro.diyerrpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * diyerrpage应用程序
 *功能：1、实现出现404时跳转到自定义的404页面
 *     2、发生500错误时跳转到500页面
 */
@SpringBootApplication
public class DiyerrpageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiyerrpageApplication.class, args);
    }

}
