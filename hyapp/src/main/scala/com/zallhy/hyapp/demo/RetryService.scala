package com.zallhy.hyapp.demo

import org.springframework.remoting.RemoteAccessException
import org.springframework.retry.annotation.{Backoff, Recover, Retryable}
import org.springframework.stereotype.Service

/**
  * Created by hadoop on 2017/9/6.
  */
@Service
class RetryService {

  @Retryable(value = Array(classOf[RemoteAccessException]), maxAttempts = 5, backoff = new Backoff(delay = 5000l, multiplier = 1))
  def retryTest(): Unit = {
    System.out.println("do something...")
    throw new RemoteAccessException("RemoteAccessException....")
  }

  @Recover def recover(e: RemoteAccessException): Unit = {
    System.out.println(e.getMessage)
    System.out.println("recover....")
  }
}
