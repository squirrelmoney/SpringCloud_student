package com.lnsf;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lnsf"})
@MapperScan(basePackages={"com.lnsf.mapper"})
public class starter {
    public static void main(String[] args) {
        SpringApplication.run(starter.class,args);
    }
}
