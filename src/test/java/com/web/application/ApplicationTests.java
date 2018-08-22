package com.web.application;

import com.web.application.domain.User;
import com.web.application.mapper.UserMapper;
import com.web.application.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    User user = new User();
    @Autowired
    private UserService service;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selById() {
        userMapper.selectByPrimaryKey(1);
    }

    @Test
    public void Login() {
        user.setUsername("毛老师");
        user.setPassword("1001010");
        userMapper.selectByNameAndPassword(user);
    }

    @Test
    public void AopTest() {
        user.setUsername("毛老师");
        user.setPassword("1001010");
        service.selectByPrimaryKey(1);
        service.selectByNameAndPassword(user);
    }

}
