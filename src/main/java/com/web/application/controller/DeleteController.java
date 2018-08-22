package com.web.application.controller;

import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public void Delete(@PathVariable("id") Integer id) {
        int i = service.deleteByPrimaryKey(id);
        if (1 != i) {
            System.out.println("删除完成");
        } else {
            System.out.println("删除失败");
        }
    }
}
