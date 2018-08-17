package com.web.application.service;

import com.web.application.domain.User;

import java.util.List;

public interface UserService {
    User selectUserNameAndPassword(User user);

    List<User> selAll();

    int deleteByPrimaryKey(Integer id);
}
