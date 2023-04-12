package com.example.onedatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.onedatasource.mapper")
public class OneDataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneDataSourceApplication.class, args);
    }

}
