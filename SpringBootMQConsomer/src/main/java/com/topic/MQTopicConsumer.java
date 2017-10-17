package com.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.entity.User;
@Component
public class MQTopicConsumer {
	@SuppressWarnings("static-access")
	@JmsListener(destination="${topic}")
	public void receive(String msg){
		System.out.println(msg);
		JSONObject jsonObject= new JSONObject();
		User receiveAndConvert = jsonObject.parseObject(msg, User.class);
		System.out.println("name:"+receiveAndConvert.getName()+"- age:"+receiveAndConvert.getAge()+"- id:"+receiveAndConvert.getId());
	}
}
