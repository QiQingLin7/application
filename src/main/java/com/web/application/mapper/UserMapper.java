package com.web.application.mapper;

import com.web.application.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录
    User selectUserNameAndPassword(User user);

    List<User> selAll();

    int deleteByPrimaryKey(Integer id);

}
