package com.gem.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gem.spring.pojo.Person;

public class spring_test {
	private BeanFactory factory;
	@Before
	public void setUp(){
		factory=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void test01(){
		Person person01=(Person)factory.getBean("p01");
		Person person02=(Person)factory.getBean("p01");
		System.out.println(person01);
		
	}
}
