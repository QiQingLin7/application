package com.web.application.controller;

import com.google.gson.Gson;
import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author     ：漆庆林
 * Date       ：Created in 下午7:59 2018/8/21
 * Description：查询
 */
@RestController
public class ListAllAndPage {

    private final UserService service;

    @Autowired
    public ListAllAndPage(UserService service) {
        this.service = service;
    }

    @PostMapping(value = "/List")
    public String List() {
        User user = service.selectAll();
        Gson gson = new Gson();
        return gson.toJson(user);
    }
}
