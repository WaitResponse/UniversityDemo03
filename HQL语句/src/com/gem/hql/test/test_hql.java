package com.gem.hql.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gem.hql.pojo.Car;
import com.gem.hql.pojo.User;

public class test_hql {
	private Session session;
	private Transaction transaction;
	
	@Before
	public void setUp(){
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
		transaction=session.beginTransaction();
	}
	
	
	
	@Test
	public void test00(){//�������
		User u01=new User("����",20,156,"ӡ��");
		User u02=new User("��ǿ",20,157,"̩��");
		User u03=new User("СP",15,150,"�ж���");
		
		Set<Car> cars1=new HashSet<Car>();
		Car c1=new Car("�ھ��",250,u01);
		Car c2=new Car("������",1500000,u01);
		cars1.add(c1);
		cars1.add(c2);
		u01.setCars(cars1);
		
		Set<Car>cars2=new HashSet<Car>();
		Car c3=new Car("ҡ����",5,u03);
		cars2.add(c3);
		u03.setCars(cars2);
		
		session.save(u01);
		session.save(u02);
		session.save(u03);
		
	}
	@Test
	public void test01(){//ʵ���ѯ
		String hql="from User";
		Query<User>query=session.createQuery(hql,User.class);
		List<User>list=query.list();
		
		for(User user:list){
			System.out.println(user);
		}
	}
	
	@Test
	public void test02(){//������ȡ����
		String hql="select user from User user";
		List<User>list=session.createQuery(hql,User.class).list();
		for(User user:list){
			System.out.println(user);
		}		
	}
	@Test
	public void test03(){//���Բ�ѯ
		String hql="select u.uname,u.age,u.address from User u";
		List<Object[]>list = session.createQuery(hql).list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]);
		}
	}
	@Test
	public void test04(){//���Բ�ѯnew������(����User�Ĺ��췽��)
		String hql="select new User(u.uname,u.age,u.height,u.address) from User u";
		List<User>list=session.createQuery(hql).list();
		for(User user:list){
			System.out.println(user);
		}
	}
	
	@Test
	public void test05(){//��ѯ����
		String hql="from java.lang.Object";
		List list=session.createQuery(hql).list();
		for(Object obj:list){
			System.out.println(obj);
		}
	}
	@Test
	public void test06(){
		String hql="from User where age>? and height<?";
		Query query=session.createQuery(hql);
		query.setParameter(0, 16);
		query.setParameter(1, 157);
		List<User>list=query.list();
		for(User user:list){
			System.out.println(user);
		}
		
	}
	@Test
	public void test07(){//where�Ӿ�_����ռλ��
		String hql="from User u where age>:age and height<:height";
		Query query=session.createQuery(hql);
		query.setParameter("age", 16);
		query.setParameter("height",157);
		List<User> list = query.list();
		for(User user:list){
			System.out.println(user);
		}	
	}
	@Test
	public void test08(){//ͳ�ƺ���
		String hql="select count(*),max(age),avg(height),min(height) from User u";
		Query query=session.createQuery(hql);
		List<Object[]> list=query.list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]+"\t"+arr[3]);
		}
		
	}
	@Test
	public void test09(){//ͳ�ƺ�������ȷ������ֵֻ��һ�е�ʱ����uniqueResult
		Object obj=session.createQuery("select count(*) from User u").uniqueResult();
		System.out.println(obj);
	}
	@Test
	//��hql���ִ���޸ĺ�ɾ��Ҫ�ȴ�������
	public void test10(){//hqlִ�и���(�����޸���hql��䣬һ����session�����޸�)
		String hql="update User u set u.uname=? , u.age=? where u.id=?";
		int count=session.createQuery(hql).setParameter(0, "BB��")
											.setParameter(1, 18)
											.setParameter(2, 1)
											.executeUpdate();
		System.out.println(count > 0 ? "�޸ĳɹ�" : "�޸�ʧ��");
			
	}
	@Test
	public void teat11(){//����ᵼ��ɾ��ʧ�ܣ��������:1.cascade 2.��ɾ�����Ӧ���ֶ�
		String hql="delete from User u where u.id=?";
		int count = session.createQuery(hql).setParameter(0, 3).executeUpdate();
		System.out.println(count);
		System.out.println(count > 0 ? "ɾ���ɹ�" : "ɾ��ʧ��");
	}
	
	@Test
	public void test12(){//hqlִ������
		String hql="from User u order by u.age desc ,height asc";
		Query query=session.createQuery(hql);
		List<User>list=query.list();
		for(User user:list){
			System.out.println(user);
		}

	}
	
	@Test
	public void test13(){//hqlִ�з���
		String hql="select c.user.id ,max(c.price) from Car c group by c.user.id";
		List<Object[]> list=session.createQuery(hql).list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]);
		}
	}
	@Test
	public void test14(){//hqlִ�����ò�ѯ
		Query query=session.createNamedQuery("getUsers");
		List<User> list=query.list();
		for(User user:list){
			System.out.println(user);
		}
		
	}
	
	
	
	@After
	public void tearDown(){
		transaction.commit();
		session.close();
	}
	
	
}
