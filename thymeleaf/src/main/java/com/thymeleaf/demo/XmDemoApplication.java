package com.thymeleaf.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.thymeleaf.demo.mapper")
public class XmDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(XmDemoApplication.class,args);


    }


}
