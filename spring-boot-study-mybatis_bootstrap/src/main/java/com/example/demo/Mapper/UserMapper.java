package com.example.demo.Mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author 86171
 */

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT * FROM User ")
    public ArrayList<User> findAllUser();

    @Delete("DELETE FROM User WHERE id = #{id}")
    public int deleteById (int id );

    @Select("SELECT pwd FROM User where name=#{name}")
    public String login(String name);

    @Insert("insert into User(name,pwd) values(#{name},#{pwd})")
    public void register(String name,String pwd);
}
