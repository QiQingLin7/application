package com.web.application.controller;

import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午7:54 2018/8/22
 * Description：登录
 */
@RestController
public class LoginController {
    private final UserService service;

    @Autowired
    public LoginController(UserService service) {
        this.service = service;
    }

    @PostMapping(value = "/login")
    public Boolean Login(User user, String username, String password, HttpSession session) {
        user.setUsername(username);
        user.setPassword(password);
        User userBody = service.selectByNameAndPassword(user);
        if (userBody == null) {
            return false;
        }
        session.setAttribute("user", userBody);
        return true;
    }
}