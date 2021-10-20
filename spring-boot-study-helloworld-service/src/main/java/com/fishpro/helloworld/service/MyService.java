package com.fishpro.helloworld.service;

import org.springframework.stereotype.Service;

/**
 * 我的服务
 *
 * @author guoheng
 * @date 2021/10/20
 */
@Service
public class MyService {
    public String message(){
        return "This is a message from another module called 'Spring-boot-helloWorld-service'";
    }
}
