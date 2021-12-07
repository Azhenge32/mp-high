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
public class LogicDeleteTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void deleteByIdLogic() {
        int rows = userMapper.deleteById(1094592041087729666L);
        System.out.println(rows);
    }

    @Test
    public void select() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
    
    @Test
    public void updateById() {
        User user = new User();
        user.setAge(26);
        user.setId(1088248166370832385L);
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }

    @Test
    public void selectAll() {
        List<User> list = userMapper.selectAll(Wrappers.<User>lambdaQuery()
        .gt(User::getAge, 25));
        list.forEach(System.out::println);
    }
}
