package com.fgq.mqserver.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Package: com.fgq.mqserver.send
 * @ClassName: HelloSender
 * @Author: fgq
 * @Description: 发送消息
 * @Date: 2019/11/9 9:56
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("test-queue", "hello,rabbit~send message");
    }
}
