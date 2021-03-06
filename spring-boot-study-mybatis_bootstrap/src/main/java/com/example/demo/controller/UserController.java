package com.example.demo.controller;



import com.example.demo.Mapper.UserMapper;
import com.example.demo.Util.GetMD5;
import com.example.demo.pojo.User;
import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/student")
    public List<User> queryUserList(){
        List<User> userList = new ArrayList<>();
        userList = userMapper.findAllUser();
        return userList;
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request){
        System.out.println(request.getParameter("id"));
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id是"+id);
        userMapper.deleteById(id);
        return "/user.html";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        String name = request.getParameter("name");
        String pwd  = GetMD5.MakeMd5(request.getParameter("pwd"));

        String realPwd = userMapper.login(name);
        System.out.println("name:"+name);
        System.out.println("pwd:"+pwd);
        if (pwd.equals(realPwd)){
            return "登陆成功";
        }else{
            return "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request){

        String name = request.getParameter("name");
        String pwd  = GetMD5.MakeMd5(request.getParameter("pwd"));

        System.out.println("name:"+name);
        System.out.println("pwd:"+pwd);

        userMapper.register(name,pwd);
        return "已经提交注册";
    }

    @RequestMapping("/deleteByIds")
    public String deleteByIds(HttpServletRequest request){

        String s = request.getParameter("ids");
        System.out.println(s);
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            userMapper.deleteById(Integer.valueOf(matcher.group(0)));
            System.out.println(matcher.group(0));
        }
        return "/user.html";
    }





}
