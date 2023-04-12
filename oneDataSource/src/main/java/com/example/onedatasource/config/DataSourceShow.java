package com.example.onedatasource.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
public class DataSourceShow implements ApplicationContextAware {

    private ApplicationContext applicationContext = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        // Spring Boot 默认已经配置好了数据源，程序员可以直接 DI 注入然后使用即可
        DataSource dataSource = this.applicationContext.getBean(DataSource.class);
        System.out.println("--------------------------------");
        System.out.println(dataSource.getClass().getName());
        System.out.println("--------------------------------");
    }
}
