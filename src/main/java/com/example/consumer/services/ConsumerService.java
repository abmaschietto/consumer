package com.example.consumer.services;

import org.springframework.stereotype.Service;

import com.example.consumer.dto.MessageDto;

@Service
public class ConsumerService implements IConsumerService {

	@Override
	public void action(MessageDto message) {
		System.out.println(message.getMessage());
	}

}
