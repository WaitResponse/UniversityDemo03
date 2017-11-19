package com.gem.xianzhi.dao.impl;

import java.util.List;

import com.gem.xianzhi.dao.UserDAO;
import com.gem.xianzhi.dao.base.impl.BaseDAO;
import com.gem.xianzhi.pojo.User;
import com.gem.xianzhi.util.StringUtil;

public class UserDAOImpl extends BaseDAO<User> implements UserDAO {

	@Override
	public User login(String loginId, String pwd) {
		String hql="from User u where u.loginId=? and u.pwd=? ";
		List<User> userList =(List<User>) getHibernateTemplate().find(hql, loginId , pwd);
		if(userList!=null&userList.size()>0){
			User user=userList.get(0);
			return user;
		}
		return null;
	}

	@Override
	public int getUserCount(String keyword) {
		String hql = "select count(*) from User u where u.nickName like ? or u.type like ? ";
		return ((Long)getHibernateTemplate().find(hql,"%"+keyword+"%","%"+keyword+"%").get(0)).intValue() ;
	}

	@Override
	public List<User> getUserList(String keyword, int pageSize, int pageNum) {
		if(StringUtil.isEmpty(keyword)){
			keyword="";
		}
		String hql = "from User u where u.nickName like ? or u.type like ?" ; 
		return getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createQuery(hql).setParameter(0, "%"+keyword+"%")
								.setParameter(1, "%"+keyword+"%")
								.setFirstResult((pageNum-1)*pageSize )
								.setMaxResults(pageSize).list();														
	}

	@Override
	public int getUserCount() {
		String hql="select count(*) from User u ";
		return ((Long)getHibernateTemplate().find(hql).get(0)).intValue();
	}

	@Override
	public List<User> getUserByType(String keyword,int pageSize, int pageNum) {
		if(StringUtil.isEmpty(keyword)){
			keyword="";
		}
		String hql = "from User u where u.type like ?" ; 
		return getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createQuery(hql).setParameter(0, "%"+keyword+"%")
								.setFirstResult((pageNum-1)*pageSize )
								.setMaxResults(pageSize).list();
	}

	@Override
	public int getUserCountByType(String keyword) {
		String hql = "select count(*) from User u where u.type like ? ";
		return ((Long)getHibernateTemplate().find(hql,"%"+keyword+"%").get(0)).intValue() ;
	}



}
