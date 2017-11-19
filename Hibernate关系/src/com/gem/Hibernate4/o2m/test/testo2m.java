package com.gem.Hibernate4.o2m.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gem.Hibernate4.o2m.pojo.ClassBean;
import com.gem.Hibernate4.o2m.pojo.Student;

public class testo2m {
	private Session session;
	
	@Before
	public void setUp(){ 
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
	}
	@Test
	public void test01(){
		ClassBean cb=new ClassBean("c01","java01");
		Student s01=new Student("s01","海涛");
		Student s02=new Student("s02","管强");
		Student s03=new Student("s03","小P");
		Set<Student>students=new HashSet<Student>();
		s01.setCb(cb);
		s02.setCb(cb);
		s03.setCb(cb);
		students.add(s01);
		students.add(s02);
		students.add(s03);
		cb.setStudents(students);
		session.save(cb);
		
	}
	@Test
	public void test02(){
		Student s04=new Student("s04","东哥");
		//ClassBean cb=new ClassBean("c02","java02");
		ClassBean cb=session.load(ClassBean.class, "c01");
		s04.setCb(cb);//保存s04的时候cb还是自由状态，所以会报错
		session.save(s04);
	}
	@Test
	public void test03(){
		ClassBean cb=session.load(ClassBean.class,"c01");
		System.out.println(cb.getCname());
		Set<Student>students=cb.getStudents();
		for(Student student:students){
			System.out.println(student.getSname());
		}
	}
	
	
	@After
	public void tearDown(){
		session.beginTransaction().commit();
		session.close();
	}
	
}
