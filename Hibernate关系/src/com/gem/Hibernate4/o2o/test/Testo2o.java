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
		Person person = new Person("p01","����","USA");
		Card card = new Card("362425199710113215");
		person.setCard(card);
		card.setPerson(person);	//��仰����Ҫ�ӣ�����card��֪��������һ��person��������ô����û�а취ȷ����������ֵ
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
		Person person = session.get(Person.class, "p01");//��Person����û���ӳټ���Card�����Ǽ�ʱ����
		session.delete(person);
	}
	
	@Test
	public void test04(){
		Card card = session.get(Card.class, "p01");		//�����ء��ӳټ���
//		System.out.println(card.getPerson().getPid());//ʹ��pid������Ҫ�����ݿ�
		System.out.println(card.getPerson().getPname());//pname���ò�ȥ�����ݿ���
		System.out.println(card);
	}
	
	@After
	public void teardown(){
		session.beginTransaction().commit();
	}
	
	
}
