package com.course.rabbitmq.consumer.stream.consumer;

import com.course.rabbitmq.consumer.stream.config.RabbitmqStreamConfig;
import com.rabbitmq.stream.Message;
import com.rabbitmq.stream.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NumberConsumerLast {

    private static final Logger LOG = LoggerFactory.getLogger(NumberConsumerLast.class);

    @RabbitListener(queues = RabbitmqStreamConfig.STREAM_NUMBER, containerFactory = "lastContainerFactoryOne")
    public void lastOne(Message message, MessageHandler.Context context) {
        LOG.info("last 1 : {}, on offset {}", message.getBody(), context.offset());
    }
}
