package com.zallhy.hyapp.demo

import org.springframework.context.annotation.{AnnotationConfigApplicationContext, Bean, Configuration, EnableAspectJAutoProxy}
import org.springframework.retry.annotation.EnableRetry

/**
  * Created by hadoop on 2017/9/6.
  */
@Configuration
@EnableRetry
@EnableAspectJAutoProxy(proxyTargetClass = true)
class RetryServiceMain {
  @Bean def retryService = new RetryService
}
object RetryServiceMain extends App {
  val applicationContext = new AnnotationConfigApplicationContext(classOf[RetryServiceMain])
  val retryService = applicationContext.getBean(classOf[RetryService])
  retryService.retryTest()
}
