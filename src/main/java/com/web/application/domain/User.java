package com.web.application.domain;

import com.web.application.util.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Entity {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
}