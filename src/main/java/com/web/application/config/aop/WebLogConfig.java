package com.web.application.config.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Author     ：漆庆林
 * Date       ：Created in 上午4:54 2018/8/22
 * Description：Web层切面
 */
@Aspect
@Configuration
public class WebLogConfig {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(WebLogConfig.class);

    /**
     * 定义一个切入点
     */
    @Pointcut(value = "execution(public * com.web.application.controller.*.*(..))")
    public void WebLogConfig() {
    }

    /**
     * 通过连接点切入
     */
    @Before(value = "WebLogConfig()")
    public void doBefore(JoinPoint joinPoint) {
        System.err.println("进入Before切面");
        logger.info("前置通知：");
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "WebLogConfig()")
    public void doAfterReturning(Object ret) {

        /* 处理完请求，返回内容*/
        logger.info("后置通知：");
        logger.info("RESPONSE : " + ret);
    }

}
