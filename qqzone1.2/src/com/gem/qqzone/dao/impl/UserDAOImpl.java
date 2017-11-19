package com.gem.qqzone.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import com.gem.qqzone.dao.UserDAO;
import com.gem.qqzone.dao.factory.HibernateSessionFactory;
import com.gem.qqzone.pojo.User;

public class UserDAOImpl implements UserDAO {
	
	public User getUser(String loginId, String pwd) {
		String hql = "from User u where u.loginId=? and u.pwd = ? " ;
		Session session = HibernateSessionFactory.newInstance().getSession();
		List<User> userList = session.createQuery(hql, User.class).setParameter(0, loginId).setParameter(1, pwd).list();
		if(userList!=null && userList.size()>0){
			User user = userList.get(0);
			return user ;
		}
		return null;
	}

	public User addUser(User user) {
		Session session = HibernateSessionFactory.newInstance().getSession();
		int id = (Integer) session.save(user);
		session.beginTransaction().commit();
		user.setId(id);
		return user;
	}

	public User getUser(int id) {
		User user = HibernateSessionFactory.newInstance().getSession().load(User.class, id);
		return user ;
	}

	public boolean updateUser(User user) {
		HibernateSessionFactory.newInstance().getSession().update(user);
		return true ;
	}

	public Set<User> getUsers(int id) {
		Set<User> users = getUser(id).getFriends();
		return users ;
	}

}
