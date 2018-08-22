package com.web.application.config;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
/***
 * 自定义登录权限注解
 */
public @interface Permission {
    String authorities() default "ADMIN";
}
