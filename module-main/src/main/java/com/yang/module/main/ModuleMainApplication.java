package com.yang.module.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.yang.module.main.dao")
public class ModuleMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleMainApplication.class, args);
    }

}
