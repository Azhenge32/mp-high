package com.mp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OptTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void updateById() {
        int version = 1;

        User user = new User();
        user.setEmail("ly2@baomidou.com");
        user.setId(1088248166370832385L);
        user.setVersion(version);
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }

    @Test
    public void updateByWrapper() {
        int version = 2;

        User user = new User();
        user.setEmail("ly3@baomidou.com");
        user.setId(1088248166370832385L);
        user.setVersion(version);
        QueryWrapper<User> query = Wrappers.<User>query();
        query.eq("name", "李玉");
        int rows = userMapper.update(user, query);
        System.out.println(rows);


        int version2 = 3;
        User user2 = new User();
        user2.setEmail("ly3@baomidou.com");
        user2.setVersion(version2);
        query.eq("age", 25);
        rows = userMapper.update(user, query);
        System.out.println(rows);

    }

}
