package com.zallhy.hyapp;

import org.jooq.DSLContext;
import org.jooq.conf.Settings;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.filter.CharacterEncodingFilter;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableRetry
@EnableScheduling//启用任务调度.
public class SpringBootHyAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHyAppApplication.class, args);
    }

    @Bean
    public CharacterEncodingFilter Filter() {
        CharacterEncodingFilter characterEncodingFilter =new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }
    @Bean
    public Settings settings() {
        Settings settings = new Settings();
        return settings.withRenderSchema(false);
    }

    @Scheduled(cron = "0 0 */3 * * ?")
    public void proccess(){

    }
}
