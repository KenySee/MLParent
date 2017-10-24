package com.zallhy.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

//开启配置中心
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringBootConfigApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootConfigApplication.class).run(args);
    }
}
