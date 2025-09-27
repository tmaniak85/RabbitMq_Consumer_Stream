package com.course.rabbitmq.consumer.stream.consumer;

import com.course.rabbitmq.consumer.stream.config.RabbitmqStreamConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NumberConsumerDefault {

    private static final Logger LOG = LoggerFactory.getLogger(NumberConsumerDefault.class);

//    @RabbitListener(queues = RabbitmqStreamConfig.STREAM_NUMBER)
    public void listenNumberOne(String message) {
        LOG.info("default listen string : {}", message);
    }

//    @RabbitListener(queues = RabbitmqStreamConfig.STREAM_NUMBER)
    public void listenNumberTwo(Message message) {
        LOG.info("default listen message : {}", message);
    }

}
