package com.liu.realmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.liu.realmall.product.dao")
@ComponentScan(basePackages = "com.liu.*")
public class RealmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealmallProductApplication.class, args);
    }

}
