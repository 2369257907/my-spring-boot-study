package com.fishpro.redis.controller;


import com.fishpro.redis.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.redis.core.StringRedisTemplate;


/**
 * 复述,控制器
 *service
 * @author guoheng
 * @date 2021/11/01
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping ("/set")
    public String set() {
        redisTemplate.opsForValue().set("mykey","guo");
        return "guo";
    }

    @RequestMapping("/get")
    public String get(){
        System.out.println((String) redisTemplate.opsForValue().get("mykey"));
        return (String) redisTemplate.opsForValue().get("mykey");
    }

    @RequestMapping("/delete")
    public String delete(){
        String  value = (String) redisTemplate.opsForValue().get("mykey");
        redisTemplate.delete("mykey");
        return "你已经删除:mykey - "+ value;
    }
    //和新建键一样

    //    @RequestMapping("/update")
    //    public String update(){
    //
    //    }

}