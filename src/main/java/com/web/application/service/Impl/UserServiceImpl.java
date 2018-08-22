package com.web.application.service.Impl;

import com.web.application.domain.User;
import com.web.application.mapper.UserMapper;
import com.web.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author ：漆庆林
 * Date ：Created in 上午4:23 2018/8/22
 * Description：用户接口的实现
 */
@Service("user")
@Transactional
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public User selectByNameAndPassword(User user) {
        return mapper.selectByNameAndPassword(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return mapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return mapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User selectAll() {
        return mapper.selectAll();
    }
}
