package com.gem.xianzhi.test;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Before;
import org.junit.Test;

import com.gem.xianzhi.pojo.News;


public class TestXZ {
	
	
	private Session session;
	@Before
	public void setUp(){
		Configuration cfg=new Configuration().configure();
		SessionFactory factory= cfg.buildSessionFactory();
		 session=factory.openSession();
	
	}
	
	@Test
	public void test01(){
		/*String hql="from News";
		Query<News>query = session.createQuery(hql,News.class);
		List<News> newsList = query.list();
		News news = newsList.get(0);
		System.out.println(news.getContent());*/
	}
	
}
