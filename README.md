####RabbitMq 生产者搭建过程

#### 交换机的主要作用是接收相应的消息并且绑定到指定的队列.交换机有四种类型,分别为Direct,topic,headers,Fanout.
   
#### 采用Direct 

1. pom引入左边， 在application.properties中,去编辑和RabbitMQ相关的配置信息,
        spring.application.name=mq-client
        spring.rabbitmq.host=127.0.0.1
        spring.rabbitmq.port=5672
        spring.rabbitmq.username=guest
        spring.rabbitmq.password=guest
    
2.  配置Queue(消息队列).那注意由于采用的是Direct模式,需要在配置Queue的时候,指定一个键,使其和交换机绑定.  
       
     return new Queue("test-queue");

3.  发送消息到交换机中

        @Autowired
        private AmqpTemplate template;
    
        public void send() {
            template.convertAndSend("test-queue", "hello,rabbit~");
        }
       
4.  编写测试类

        @Autowired
        private HelloSender helloSender;
    
        @Test
        public void testRabbit() {
            helloSender.send();
        }                
5.  编写接受端   
    
        mq-client      
     

    

