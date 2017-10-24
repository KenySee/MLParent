package com.zallhy.hyapp.web

import java.util

import com.zallhy.hyapp.response.ResponseView
import com.zallhy.hyapp.utils.IdGen
import com.zallhy.hyapp.vo.UserBehaviorLog
import org.apache.hadoop.hbase.{HBaseConfiguration, TableName}
import org.apache.hadoop.hbase.client.{ConnectionFactory, Put}
import org.apache.hadoop.hbase.util.Bytes
import org.springframework.web.bind.annotation.{RequestBody, RequestMapping, RequestMethod, RestController}

import scala.collection.JavaConverters._
import scala.collection.mutable
/***
  * 记录用户行为日志
  */
//@RestController
//@RequestMapping(value = Array("logs"))
//class BehaviorLogController {
//
//  val configuration = HBaseConfiguration.create
//
//  @RequestMapping(value = Array("put"), method = Array(RequestMethod.POST))
//  def put(@RequestBody logList: util.List[UserBehaviorLog]): ResponseView = {
//    val connection = ConnectionFactory.createConnection(configuration)
//    val table = connection.getTable(TableName.valueOf("userLog"))
//    var logs:mutable.Buffer[UserBehaviorLog] = logList.asScala
//    var puts = logs.filter((log)=>{log.sourceId!=null && log.targetId!=null && log.eventType!=null && log.eventTime!=null}).map((log)=>{
//      val rowPut = new Put(Bytes.toBytes(IdGen.next().toString))
//      rowPut.addColumn(Bytes.toBytes("log"),Bytes.toBytes("sourceId"),Bytes.toBytes(log.sourceId))
//      rowPut.addColumn(Bytes.toBytes("log"),Bytes.toBytes("targetId"),Bytes.toBytes(log.targetId))
//      rowPut.addColumn(Bytes.toBytes("log"),Bytes.toBytes("eventType"),Bytes.toBytes(log.eventType))
//      rowPut.addColumn(Bytes.toBytes("log"),Bytes.toBytes("eventTime"),Bytes.toBytes(log.eventTime))
//      rowPut
//    })
//    try {
//      table.put(puts.asJava)
//    }
//    finally {
//      table.close()
//      connection.close()
//    }
//    new ResponseView
//  }
//}
