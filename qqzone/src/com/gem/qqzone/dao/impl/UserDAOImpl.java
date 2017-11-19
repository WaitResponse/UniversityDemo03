package com.gem.qqzone.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gem.qqzone.dao.UserDAO;
import com.gem.qqzone.pojo.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	
	public User getUser(String loginId, String pwd) {
		String hql = "from User u where u.loginId=? and u.pwd = ? " ;
		//Session session = HibernateSessionFactory.newInstance().getSession();
		//List<User> userList = session.createQuery(hql, User.class).setParameter(0, loginId).setParameter(1, pwd).list();
		List<User> userList =(List<User>) getHibernateTemplate().find(hql,loginId,pwd);
		if(userList!=null && userList.size()>0){
			User user = userList.get(0);
			return user ;
		}
		return null;
	}

	public User addUser(User user) {
	//	Session session = HibernateSessionFactory.newInstance().getSession();
	//	int id = (Integer) session.save(user);
	//	session.beginTransaction().commit();
		int id=(Integer)getHibernateTemplate().save(user);
		user.setId(id);
		return user;
	}

	public User getUser(int id) {
		return getHibernateTemplate().load(User.class, id);
		
	}

	public boolean updateUser(User user) {	
		getHibernateTemplate().update(user);
		return true ;
	}

	public Set<User> getUsers(int id) {//ªÒ»°∫√”—
		return getUser(id).getFriends();		
	}

}
