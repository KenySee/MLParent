package com.zallhy.hyapp.web;

import com.zallhy.hyapp.demo.Cosine;
import com.zallhy.hyapp.response.ResponseView;
import com.zallhy.hyapp.tables.AppEventLog;
import com.zallhy.hyapp.tables.AppItemSimilar;
import com.zallhy.hyapp.tables.Product;
import com.zallhy.hyapp.tables.records.AppEventLogRecord;
import com.zallhy.hyapp.tables.records.AppItemSimilarRecord;
import com.zallhy.hyapp.tables.records.ProductRecord;
import com.zallhy.hyapp.utils.HtmlRegexpUtil;
import com.zallhy.hyapp.utils.RecommendCalc;
import com.zallhy.hyapp.vo.UserBehaviorLog;
import org.jooq.DSLContext;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/***
 * 记录用户行为日志
 */
@RestController
@RequestMapping("logs")
@RabbitListener(queues="user")//启用Rabbit队列监听foo key.
public class UserLogController {

    @Autowired
    private DSLContext jooq;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    ExecutorService executorService = Executors.newCachedThreadPool();

    @Bean
    public Queue userQueue() {
        return new Queue("user");
    }

    @RabbitHandler
    public void onMessage(@Payload String userId){
        System.out.println(String.format(">>>>>>%s<<<<<",userId));
    }

    @RequestMapping(value = "put",method={RequestMethod.POST})
    public ResponseView put(@RequestBody List<UserBehaviorLog> logList){
        UserBehaviorLog user = logList.get(0);
        logList.forEach(log -> {
            AppEventLogRecord record = new AppEventLogRecord();
            record.setSourceid(log.sourceId);
            record.setTargetid(log.targetId);
            record.setEventtype(log.eventType);
            record.setEventtime(new java.sql.Timestamp(new Date().getTime()));
            jooq.insertInto(AppEventLog.APP_EVENT_LOG).set(record).execute();
        });
        executorService.execute(()->{
            RecommendCalc calc = new RecommendCalc();
            calc.run(jooq,user.sourceId);
            System.out.println(">>>>>SUCCESS<<<<<<<");
        });
        rabbitTemplate.convertAndSend("user",user.sourceId);
        return new ResponseView();
    }
}
