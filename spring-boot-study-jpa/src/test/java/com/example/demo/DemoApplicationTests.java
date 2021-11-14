package com.example.demo;

import com.example.demo.dao.CommentDao;
import com.example.demo.domain.Discuss;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private CommentDao commentDao;

    /**
     * 测试添加评论
     */
    @Test
    @Order(1)
    void TestAdd() {
        Discuss discuss1 = new Discuss(1, "很全、很详细", "狂奔的蜗牛", 1);
        Discuss discuss2 = new Discuss(2, "赞一个", "tom", 1);
        Discuss discuss3 = new Discuss(3, "很详细", "kitty", 1);
        Discuss discuss4 = new Discuss(4, "很好，非常详细", "张三", 2);
        Discuss discuss5 = new Discuss(5, "很不错", "张杨", 2);

        commentDao.save(discuss1);
        commentDao.save(discuss2);
        commentDao.save(discuss3);
        commentDao.save(discuss4);
        commentDao.save(discuss5);

    }

    /**
     * 测试查找所有评论
     */
    @Test
    @Order(2)
    void TestfindAll() {
        List<Discuss> discussList = commentDao.findAll();
        for (Discuss discuss : discussList
        ) {
            System.out.println(discuss);
        }
    }

    /**
     * 测试更改评论，实际上和新增评论的操作是一致的
     */
    @Test
    @Order(3)
    public void TestUpgradeComment() {
        Discuss discuss1 = new Discuss(1, "666", "666", 1);
        commentDao.save(discuss1);
    }

    /**
     * 测试通过id查找一条评论
     */
    @Test
    @Order(4)
    public void TestfindOneCommentById() {
        Optional<Discuss> byId = commentDao.findById(1);
        System.out.println(byId.get());
    }


    /**
     * 测试通过id删除评论
     */
    @Test
    @Order(5)
    public void TestDeleteCommentById() {
        commentDao.deleteAllById(Collections.singleton(1));
    }

    /**
     * 测试删除所有评论
     */
    @Test
    @Order(6)
    public void TestDeleteAll() {
        commentDao.deleteAll();
    }
}
