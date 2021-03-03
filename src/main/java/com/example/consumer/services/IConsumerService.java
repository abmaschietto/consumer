package com.example.consumer.services;

import com.example.consumer.dto.MessageDto;

public interface IConsumerService {
	
 void action(MessageDto message);
}
