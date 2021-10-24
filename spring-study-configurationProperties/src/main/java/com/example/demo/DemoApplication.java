package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 功能：一个简单的通过applicationProperties.yml文件配置对象属性的练习
 * 包含几个类型的数据:int,String[],map,list,引用数据类型Pet
 * 需要引入lombok、spring-boot-configuration-processor及spring web依赖
 *
 * @author guoheng
 * @date 2021/10/23
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
