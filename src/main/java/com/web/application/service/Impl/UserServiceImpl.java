package com.web.application.service.Impl;

import com.web.application.domain.User;
import com.web.application.mapper.UserMapper;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public User selectUserNameAndPassword(User user) {
        return mapper.selectUserNameAndPassword(user);
    }

    @Override
    public List<User> selAll() {
        return mapper.selAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
