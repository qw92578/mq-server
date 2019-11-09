package com.fgq.mqserver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Package: com.fgq.mqserver.config
 * @ClassName: SenderConfig
 * @Author: fgq
 * @Description:
 * @Date: 2019/11/9 9:50
 */
@Configuration
public class SenderConf {
    @Bean
    public Queue queue() {
        return new Queue("test-queue");
    }
}
