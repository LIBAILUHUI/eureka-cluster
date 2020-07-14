package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/14
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer2 {

    public static void main(String[] args) {
        System.out.println("注册中心2启动了");
        SpringApplication.run(StartEurekaServer2.class);
    }

}
