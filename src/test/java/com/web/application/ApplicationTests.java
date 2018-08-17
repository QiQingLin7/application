package com.web.application;

import com.web.application.domain.TStadia;
import com.web.application.domain.User;
import com.web.application.mapper.TStadiaMapper;
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
    TStadiaMapper mapper;

    @Autowired
    UserMapper mapper2;

    @Test
    public void setMapper() {
        mapper.selectByPrimaryKey(1);
        TStadia tStadia = new TStadia();
        tStadia.setName("你爹");
        tStadia.setAddress("北京湖南");
        tStadia.setDescn("kkkk");
        mapper.insert(tStadia);

    }

    @Test
    public void Login() {
        User user = new User();
        user.setUsername("漆庆林");
        user.setPassword("1928");
        mapper2.selectUserNameAndPassword(user);
    }

}
