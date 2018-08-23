package com.web.application.controller;

import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午8:11 2018/8/22
 * Description：添加
 */
@RestController
public class AddController {
    private final UserService service;

    @Autowired
    public AddController(UserService service) {
        this.service = service;
    }

    @PutMapping(value = "/add/")
    public User AddUser(User user, @RequestParam("id") Integer id,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password) {

        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);


        return null;
    }
}
