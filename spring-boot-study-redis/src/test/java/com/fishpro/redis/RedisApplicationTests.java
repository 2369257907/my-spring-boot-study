package com.fishpro.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate  redisTemplate;


    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("mykey","change");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

}
