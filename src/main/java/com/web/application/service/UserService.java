package com.web.application.service;

import com.web.application.domain.User;

/***
 * 用户接口
 */
public interface UserService {

    User selectByNameAndPassword(User user);

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    User selectAll();
}
