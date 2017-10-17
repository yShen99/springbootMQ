package com.topic;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

public class TOPMQConsumer {
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
		Session session = conn.createSession(false, Session.CLIENT_ACKNOWLEDGE);//如何过true，接收完消息则需�? session.commit();
		Topic createTopic = session.createTopic(TOPICNAME);
		MessageConsumer createConsumer = session.createConsumer(createTopic);
		while(true){
			Message receive = createConsumer.receive();
			TextMessage textMessage = (TextMessage)receive;
			if(textMessage!=null){
				System.out.println("我是消费�?3"+textMessage.getText());
				// session.commit();
				textMessage.acknowledge();//手动应答
			}
			else
				break;
		}
		session.close();
		conn.close();
	}
}
