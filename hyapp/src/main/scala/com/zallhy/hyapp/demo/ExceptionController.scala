package com.zallhy.hyapp.demo

import java.util

import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(value = Array("exception"))
class ExceptionController {

  @RequestMapping(value = Array("e2/{id}"), method = Array(RequestMethod.GET))
  def testExceptionHandle2(@PathVariable(value = "id") id: Integer): Any = {
    val list = List("a", "b", "c", "d")
    list(id - 1)
  }
}
