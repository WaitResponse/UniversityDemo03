package com.gem.Hibernate4.o2ouk.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gem.Hibernate4.o2o_uk.pojo.Boy;
import com.gem.Hibernate4.o2o_uk.pojo.Girl;

public class Testo2o_uk {
	private Session session;
	@Before
	public void setUp(){
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
	}
	@Test
	public void test00(){
		
	}
	
	@Test
	public void test01(){
		Boy boy=new Boy("º£ÌÎ");
		Girl girl=new Girl("¹ÜÇ¿",boy);
		boy.setGirl(girl);
		session.save(boy);
		
	}
	@Test
	public void test(){
		Girl girl=session.load(Girl.class, 1);
		System.out.println(girl.getGname());
		System.out.println(girl.getBoy().getBname());
	}
	@After
	public void tearDown(){
		session.beginTransaction().commit();
	}
	
	
	
}
