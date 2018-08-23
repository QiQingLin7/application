package com.web.application.controller;

import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午8:03 2018/8/19
 * Description：删除
 */
@RestController
public class DeleteController {

    private final UserService service;

    @Autowired
    public DeleteController(UserService service) {
        this.service = service;
    }

    @DeleteMapping(value = "del/{id}")
    public Boolean Delete(@PathVariable("id") Integer id) {
        User user = service.selectByPrimaryKey(id);
        if (null == user) {
            System.out.println("用户不存在");
            return false;
        }
        service.deleteByPrimaryKey(id);
        System.out.println("删除成功");
        return true;

    }
}
