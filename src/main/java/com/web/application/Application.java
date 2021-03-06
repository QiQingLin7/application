package com.web.application;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static java.lang.System.*;
import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        run(Application.class, args);
        out.println("启动完成");
    }
}
