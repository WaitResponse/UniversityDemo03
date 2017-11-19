package com.gem.qqzone.dao.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static HibernateSessionFactory factory = new HibernateSessionFactory() ;
	private SessionFactory sessionFactory =null ;
	private ThreadLocal<Session> tl = new ThreadLocal<Session>();
	
	private HibernateSessionFactory(){
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static HibernateSessionFactory newInstance(){
		return factory;
	}
	
	public Session getSession(){
		Session session = tl.get();
		if(session==null){
			session = sessionFactory.openSession() ;
			tl.set(session);
		}
		return session;
	}
	
	public void closeSession(){
		Session session = tl.get();
		if(session!=null && session.isOpen()){
			session.close();
			tl.set(null);
		}
	}
	
}
