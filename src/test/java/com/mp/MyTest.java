package com.mp;

import com.mp.configuration.MybatisPlusConfig;
import com.mp.dao.UserMapper;
import com.mp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void selectById() {
        User user = userMapper.selectById(1088248166370832385L);
        System.out.println(user);
    }

    @Test
    public void selectFromDynamicTableName() {
        MybatisPlusConfig.myTableName.set("user_2021");
        userMapper.selectList(null);
        //System.out.println(user);
    }
}
