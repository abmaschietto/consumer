package com.example.consumer.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.consumer.dto.MessageDto;
import com.example.consumer.services.ConsumerService;

@Component
public class AmqpConsumer implements IAmqpConsumer<MessageDto>{
	
	@Autowired
	private ConsumerService service;
	
	@Override
	@RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
	public void consume(MessageDto message) {
		service.action(message);
	}

}
