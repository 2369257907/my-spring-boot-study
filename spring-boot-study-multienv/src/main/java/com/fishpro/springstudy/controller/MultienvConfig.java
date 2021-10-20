package com.fishpro.springstudy.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * multienv配置
 *
 * @author guoheng
 * @date 2021/10/20
 * 1、Compent标签是什么，prefix和ConfigurationProperties又有什么作用？
 * 2、
 */
@Component
@ConfigurationProperties(prefix = "springstudy")
public class MultienvConfig {
    private String demoname;

    public String getDemoname() {
        return demoname;
    }

    public void setDemoname(String demoname) {
        this.demoname = demoname;
    }
}