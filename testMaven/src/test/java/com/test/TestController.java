package com.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import testMaven.com.qian.bean.user;
import testMaven.com.qian.dao.userMapper;
/**
 * 
 * @author shenyang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestController {
	
	private static Logger logger = Logger.getLogger(TestController.class);
	@Resource
	private userMapper usertMapper;
	@Test
	public void test1(){
		user user = new user();
		user.setAge(5);
		user.setId(11);
		usertMapper.insertSelective(user);
		
	}
}
