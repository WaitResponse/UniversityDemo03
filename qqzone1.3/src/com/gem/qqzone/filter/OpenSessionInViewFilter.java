package com.gem.qqzone.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gem.qqzone.dao.factory.HibernateSessionFactory;

public class OpenSessionInViewFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Session session = HibernateSessionFactory.newInstance().getSession();
		Transaction trans = session.beginTransaction();
		try {
			chain.doFilter(request, response);
			trans.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			trans.rollback();
		} finally {
			HibernateSessionFactory.newInstance().closeSession();
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
