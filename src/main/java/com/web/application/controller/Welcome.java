package com.web.application.controller;


import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class Welcome {

    private final UserService service;

    @Autowired
    public Welcome(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }

    @ResponseBody
    @PostMapping("/list")
    public List<User> list() {
        //        Gson gson = new Gson();
        return service.selAll();
    }

    @ResponseBody
    @PostMapping("/login")
    public boolean login(User user, HttpSession session, String username, String password) {
        user.setUsername(username);
        user.setPassword(password);
        User selectUserNameAndPassword = service.selectUserNameAndPassword(user);
        if (null != selectUserNameAndPassword) {
            session.setAttribute("user", selectUserNameAndPassword);
            return true;
        } else {
            return false;
        }
    }

    @ResponseBody
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.deleteByPrimaryKey(id);
    }
}
