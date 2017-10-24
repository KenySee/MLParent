package com.zallhy.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//创建服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootEurekaApplication.class).run(args);
    }
}
