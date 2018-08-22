package com.web.application.config.aop;

import com.web.application.domain.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午5:25 2018/8/20
 * Description：服务层切面
 */
@Aspect
@Configuration
public class ServiceLogConfig {
    /**
     * 定义一个切入点
     */
    @Pointcut("execution(* com.web.application.service.UserService.*(..))")
    public void ServiceLogConfig() {
    }

    @Before("execution(* select*(..)) &&" + "args(id,..)")
    public void twiceAsOld1(Integer id) {
        System.err.println("切面Before执行了...id==" + id);

    }

    @Around("ServiceLogConfig()")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint) {
        System.err.println("切面执行了....");
        try {
            User user = (User) thisJoinPoint.proceed();
            user.setUsername(user.getUsername() + "=========");
            return thisJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

}
