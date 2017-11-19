package com.gem.Hibernate4.o2o.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gem.Hibernate4.o2o.pojo.Card;
import com.gem.Hibernate4.o2o.pojo.Person;

public class Testo2o {
	private Session session ;
	@Before
	public void setup(){
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
	}
	
	@Test
	public void test00(){
		
	}
	
	@Test
	public void test01(){
		Person person = new Person("p01","东文","USA");
		Card card = new Card("362425199710113215");
		person.setCard(card);
		card.setPerson(person);	//这句话必须要加，否则card不知道它和哪一个person关联，那么它就没有办法确定它的主键值
		session.save(person);
		session.beginTransaction().commit();
	}
	
	@Test
	public void test02(){
		Person person =  session.get(Person.class, "p01");
		System.out.println(person);
	}
	
	@Test
	public void test03(){
		Person person = session.get(Person.class, "p01");//在Person方，没有延迟加载Card，而是即时加载
		session.delete(person);
	}
	
	@Test
	public void test04(){
		Card card = session.get(Card.class, "p01");		//懒加载、延迟加载
//		System.out.println(card.getPerson().getPid());//使用pid，不需要查数据库
		System.out.println(card.getPerson().getPname());//pname不得不去查数据库了
		System.out.println(card);
	}
	
	@After
	public void teardown(){
		session.beginTransaction().commit();
	}
	
	
}
