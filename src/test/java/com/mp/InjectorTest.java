package com.mp;

import com.mp.configuration.MybatisPlusConfig;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InjectorTest {

    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void deleteAll() {
        userMapper.deleteAll();
    }

    @Test
    public void insertBatch() {
        User user1 = new User();
        user1.setName("李兴华");
        user1.setAge(34);
        user1.setManagerId(1088248166370832385L);

        User user2 = new User();
        user2.setName("杨红");
        user2.setAge(34);
        user2.setManagerId(1088248166370832385L);

        List<User> asList = Arrays.asList(user1, user2);
        int rows = userMapper.insertBatchSomeColumn(asList);
        System.out.println(rows);
    }

    @Test
    public void deleteByIdWithFill() {
        User user = new User();
        user.setId(1469668747055779841L);
        user.setAge(35);

        int rows = userMapper.deleteByIdWithFill(user);
        System.out.println(rows);
    }

    @Test
    public void alwaysUpdateSomeColumnById() {
        User user = new User();
        user.setId(1094590409767661570L);
        user.setAge(35);
        user.setName("改名");

        int rows = userMapper.alwaysUpdateSomeColumnById(user);
        System.out.println(rows);
    }
}
