package com.producter;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
	@Value("${queue}")
	private String queueName;
	@Bean
	public Queue queue(){
		return new ActiveMQQueue(queueName);
	}
}
