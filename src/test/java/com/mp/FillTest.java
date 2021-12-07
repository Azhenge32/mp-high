package com.mp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FillTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("刘明淘");
        user.setAge(31);
        user.setEmail("world@qq.com");
        user.setManagerId(1087982257332887553L);

        int rows = userMapper.insert(user);
        System.out.println(rows);
    }

    
    @Test
    public void updateById() {
        User user = new User();
        user.setAge(32);
        user.setId(1088248166370832385L);
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }

}
