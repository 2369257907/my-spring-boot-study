package com.example.demo.Mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86171
 */

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT * FROM User ")
    ArrayList<User> findAllUser();

}


