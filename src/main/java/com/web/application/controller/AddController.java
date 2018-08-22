package com.web.application.controller;

import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PutMapping("/Add/")
    public String AddUser() {
        return null;
    }
}
