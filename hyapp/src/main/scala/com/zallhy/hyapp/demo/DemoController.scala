package com.zallhy.hyapp.demo

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.TableName
import org.apache.hadoop.hbase.client.ConnectionFactory
import org.apache.hadoop.hbase.client.Put
import org.apache.hadoop.hbase.util.Bytes
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RefreshScope
@RestController class DemoController {
//  @Value("${host.ifs}")
  var ifsHost: String = _

  @RequestMapping(Array("getHost"))
  def list(@RequestParam("rowkey") rowkey: String, @RequestParam("colValue") column: String): Any = {
    val configuration = HBaseConfiguration.create
    val connection = ConnectionFactory.createConnection(configuration)
    val table = connection.getTable(TableName.valueOf("test"))
    val theput = new Put(Bytes.toBytes(rowkey))
    theput.addColumn(Bytes.toBytes("fc"), Bytes.toBytes("ls"), Bytes.toBytes(column))
    try
      table.put(theput)
    finally {
      table.close()
      connection.close()
    }
    List("13","23","349",ifsHost)
  }
}
