package com.web.application.mapper;

import com.web.application.domain.User;
import org.apache.ibatis.annotations.Mapper;

/***
 * Mapper接口
 */
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    User selectByNameAndPassword(User user);

    User selectAll();
}