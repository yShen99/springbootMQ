package com.topic;

import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class TopicConfig {
	@Value("${topic}")
	private String topicName;
	@Bean
	public Topic queue(){
		return new ActiveMQTopic(topicName);
	}
}
