package com.fgq.mqserver;

import com.fgq.mqserver.send.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Package: com.fgq.mqserver
 * @ClassName: TestRabbitMQ
 * @Author: fgq
 * @Description: 发送消息测试
 * @Date: 2019/11/9 9:58
 */
@SpringBootTest(classes=MqServerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        helloSender.send();
    }
}
