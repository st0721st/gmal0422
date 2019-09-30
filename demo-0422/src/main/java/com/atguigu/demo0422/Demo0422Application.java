package com.atguigu.demo0422;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.atguigu.demo0422.mapper")
public class Demo0422Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0422Application.class, args);
    }

}
