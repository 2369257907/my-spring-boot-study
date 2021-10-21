package com.fishpro.thymeleaf.controller;

import com.fishpro.thymeleaf.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 86171
 */
@Controller
public class IndexController {

    /**
     * 作用：模拟一组数据，返回给/index/sample
     *
     * @param model
     * @return {@link String}
     * "/sample"位置填写的是访问网址
     * "/index/sample"是模板网页的地址
     */

    @RequestMapping("/sample")
    public String sample(Model model){
        model.addAttribute("user",getUserDTOData());
        List<UserDTO> users=new ArrayList<>();
        users.add(new UserDTO("zhangsan","男",new Date()));
        users.add(new UserDTO("wangjingjing","女",new Date()));
        users.add(new UserDTO("limeimei","女",new Date()));
        users.add(new UserDTO("lisi","男",new Date()));
        model.addAttribute("users",users);

        return "/index/sample";
    }

    /**
     * 构造一个user对象
     * */
    private UserDTO getUserDTOData(){
        UserDTO userDTO=new UserDTO();
        userDTO.setUsername("fishpro");
        userDTO.setSex("男");
        userDTO.setBirthday(new Date());
        return  userDTO;
    }
}
