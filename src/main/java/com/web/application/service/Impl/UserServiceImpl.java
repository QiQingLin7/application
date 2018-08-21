package com.web.application.service.Impl;

import com.web.application.domain.User;
import com.web.application.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author ：漆庆林
 * Date ：Created in 上午4:23 2018/8/22
 * Description：用户接口的实现
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User selectByNameAndPassword(User user) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }
}
