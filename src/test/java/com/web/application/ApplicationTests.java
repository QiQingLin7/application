package com.web.application;

import com.web.application.domain.User;
import com.web.application.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selById() {
        userMapper.selectByPrimaryKey(1);
    }

    @Test
    public void Login() {
        User user = new User();
        user.setUsername("毛老师");
        user.setPassword("1001010");
        userMapper.selectByNameAndPassword(user);
    }

}
