package com.producter;

import java.util.UUID;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.entity.User;

@Component
@EnableScheduling
public class MQProducter {
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	@Autowired
	private Queue queue;
	private int age = 20;
	@Scheduled(fixedDelay=5000)
	public void send(){
		age++;
		User user = new User(System.currentTimeMillis(),UUID.randomUUID().toString(),age);
		jmsMessagingTemplate.convertAndSend(queue, JSONObject.toJSONString(user).toString());
	}
}
