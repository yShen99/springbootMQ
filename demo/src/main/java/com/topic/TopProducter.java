package com.topic;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TopProducter {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";
	private static final String BROKERURL = "tcp://127.0.0.1:61616";
	private static final String TOPICNAME = "firstTopic";
	
	public static void main(String[] args) throws JMSException {
		start();
	}
	static public void start() throws JMSException{
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKERURL);
		Connection conn = factory.createConnection();
		conn.start();
		Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);//如何过true，发送完消息则需�? session.commit();
		Topic createTopic = session.createTopic(TOPICNAME);
		MessageProducer createProducer = session.createProducer(createTopic);
		TextMessage textMess = null;
		for (int i = 0; i < 5; i++) {
			textMess = session.createTextMessage("this is my first activeMQ---------:"+i);
			createProducer.send(textMess);
		}
		System.out.println("发�?�成�?");
		session.close();
		conn.close();
	}
}
