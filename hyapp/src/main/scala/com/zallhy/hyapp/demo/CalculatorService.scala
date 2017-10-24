package com.zallhy.hyapp.demo

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RequestParam}

//绑定該接口到CalculatorServer服务，并通知Feign组件对该接口进行代理（不需要编写接口实现）
//@FeignClient(value="CalculatorServer", fallback=CalculatorService.HystrixCalculatorService.class)
@FeignClient(value = "zall-zuul-service", fallback = classOf[CallObject.HystrixCalculatorService])
trait CalculatorService { //通过SpringMVC的注解来配置所綁定的服务下的具体实现
  @RequestMapping(value = Array("/spark/demo/add"), method = Array(RequestMethod.GET))
  def myadd(@RequestParam("a") a: Int, @RequestParam("b") b: Int): Int
}

object CallObject {
  /**
    * 这里采用和SpringCloud官方文档相同的做法，把fallback类作为内部类放入Feign接口中
    * http://cloud.spring.io/spring-cloud-static/Camden.SR6/#spring-cloud-feign-hystrix
    * （也可以外面独立定义该类，个人觉得没必要，这种东西写成内部类最合适）
    */
  @Component
  class HystrixCalculatorService extends CalculatorService {
    override def myadd(@RequestParam("a") a: Int, @RequestParam("b") b: Int): Int = -999
  }

}


