package com.demo;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class MQProducter {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";
	private static final String BROKERURL = "tcp://127.0.0.1:61616";
	private static final String QUEUENAME = "firstQueue";
	
	public static void main(String[] args) throws JMSException {
		start();
	}
	static public void start() throws JMSException{
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKERURL);
		Connection conn = factory.createConnection();
		conn.start();
		Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);//如何过true，发送完消息则需�? session.commit();
		Queue queue = session.createQueue(QUEUENAME);
		MessageProducer createProducer = session.createProducer(queue);
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
