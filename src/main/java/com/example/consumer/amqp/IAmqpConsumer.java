package com.example.consumer.amqp;

public interface IAmqpConsumer<T>{

	void consume(T t);
}
