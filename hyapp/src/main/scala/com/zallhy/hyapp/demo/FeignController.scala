package com.zallhy.hyapp.demo

import javax.annotation.Resource

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(Array("feign"))
class FeignController {

  @Resource
  private var calculatorService : CalculatorService = _

  @RequestMapping(Array("toadd"))
  def toadd(a: Int, b: Int): Any = {
    calculatorService.myadd(a, b)
  }
}
