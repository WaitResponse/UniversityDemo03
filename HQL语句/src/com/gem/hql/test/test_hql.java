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
	public void test00(){//添加数据
		User u01=new User("海涛",20,156,"印度");
		User u02=new User("管强",20,157,"泰国");
		User u03=new User("小P",15,150,"托儿所");
		
		Set<Car> cars1=new HashSet<Car>();
		Car c1=new Car("挖掘机",250,u01);
		Car c2=new Car("五菱宏光",1500000,u01);
		cars1.add(c1);
		cars1.add(c2);
		u01.setCars(cars1);
		
		Set<Car>cars2=new HashSet<Car>();
		Car c3=new Car("摇篮车",5,u03);
		cars2.add(c3);
		u03.setCars(cars2);
		
		session.save(u01);
		session.save(u02);
		session.save(u03);
		
	}
	@Test
	public void test01(){//实体查询
		String hql="from User";
		Query<User>query=session.createQuery(hql,User.class);
		List<User>list=query.list();
		
		for(User user:list){
			System.out.println(user);
		}
	}
	
	@Test
	public void test02(){//给属性取别名
		String hql="select user from User user";
		List<User>list=session.createQuery(hql,User.class).list();
		for(User user:list){
			System.out.println(user);
		}		
	}
	@Test
	public void test03(){//属性查询
		String hql="select u.uname,u.age,u.address from User u";
		List<Object[]>list = session.createQuery(hql).list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]);
		}
	}
	@Test
	public void test04(){//属性查询new出对象(调用User的构造方法)
		String hql="select new User(u.uname,u.age,u.height,u.address) from User u";
		List<User>list=session.createQuery(hql).list();
		for(User user:list){
			System.out.println(user);
		}
	}
	
	@Test
	public void test05(){//查询父类
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
	public void test07(){//where子句_名称占位符
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
	public void test08(){//统计函数
		String hql="select count(*),max(age),avg(height),min(height) from User u";
		Query query=session.createQuery(hql);
		List<Object[]> list=query.list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]+"\t"+arr[2]+"\t"+arr[3]);
		}
		
	}
	@Test
	public void test09(){//统计函数，当确定返回值只有一列的时候用uniqueResult
		Object obj=session.createQuery("select count(*) from User u").uniqueResult();
		System.out.println(obj);
	}
	@Test
	//用hql语句执行修改和删除要先创建事务
	public void test10(){//hql执行更新(批量修改用hql语句，一般用session进行修改)
		String hql="update User u set u.uname=? , u.age=? where u.id=?";
		int count=session.createQuery(hql).setParameter(0, "BB涛")
											.setParameter(1, 18)
											.setParameter(2, 1)
											.executeUpdate();
		System.out.println(count > 0 ? "修改成功" : "修改失败");
			
	}
	@Test
	public void teat11(){//外键会导致删除失败，解决方法:1.cascade 2.先删外键对应的字段
		String hql="delete from User u where u.id=?";
		int count = session.createQuery(hql).setParameter(0, 3).executeUpdate();
		System.out.println(count);
		System.out.println(count > 0 ? "删除成功" : "删除失败");
	}
	
	@Test
	public void test12(){//hql执行排序
		String hql="from User u order by u.age desc ,height asc";
		Query query=session.createQuery(hql);
		List<User>list=query.list();
		for(User user:list){
			System.out.println(user);
		}

	}
	
	@Test
	public void test13(){//hql执行分组
		String hql="select c.user.id ,max(c.price) from Car c group by c.user.id";
		List<Object[]> list=session.createQuery(hql).list();
		for(Object[] arr:list){
			System.out.println(arr[0]+"\t"+arr[1]);
		}
	}
	@Test
	public void test14(){//hql执行引用查询
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
