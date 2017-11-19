package com.gem.Hibernate4.m2o.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gem.Hibernate4.m2o.pojo.ClassBean;
import com.gem.Hibernate4.m2o.pojo.Student;

public class TestM2o {
	private Session session;
	
	@Before
	public void setUp(){
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
	}
	
	@Test
	public void test01(){
		ClassBean cb=new ClassBean();
		cb.setCid("c01");
		cb.setCname("java��");
		session.save(cb);
		
		Student s01=new Student("����",cb);
		Student s02=new Student("����",cb);
		Student s03=new Student("��ǿ",cb);
		Student s04=new Student("СP",cb);
		session.save(s01);
		session.save(s02);
		session.save(s03);
		session.save(s04);
	}

	@After
	public void tearDown(){
		session.beginTransaction().commit();
	}
	
	
}
