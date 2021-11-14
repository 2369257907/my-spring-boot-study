package com.example.demo.dao;


import com.example.demo.domain.Discuss;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author guoheng
 */
public interface CommentDao extends JpaRepository<Discuss, Integer> {

}