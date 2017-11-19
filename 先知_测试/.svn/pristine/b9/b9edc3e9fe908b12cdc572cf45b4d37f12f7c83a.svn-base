package com.gem.xianzhi.Biz.impl;

import java.util.List;
import java.util.Set;

import com.gem.xianzhi.Biz.UserBiz;
import com.gem.xianzhi.dao.UserDAO;
import com.gem.xianzhi.pojo.User;
import com.gem.xianzhi.util.StringUtil;

public class UserBizImpl implements UserBiz{
	
	private UserDAO userDAO=null;
	@Override
	public User login(String loginId, String pwd) {
		User user=userDAO.login(loginId, pwd);
		return user;
	}

	@Override
	public User getUser(int id) {
		User user = userDAO.get(id);
		return user;
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}

	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> getUserList(String keyword, int pageSize, int pageNum) {
		return 	userDAO.getUserList(keyword, pageSize, pageNum);
	}
	//»ñÈ¡Ò³Êý
	@Override
	public int getUserCount(String keyword, int pageSize) {
		int count=StringUtil.isEmpty(keyword)?userDAO.getUserCount() : userDAO.getUserCount(keyword);
		return (count+pageSize-1)/pageSize;
	}

	@Override
	public List<User> getUserByType(String keyword,int pageSize, int pageNum) {
		return userDAO.getUserByType(keyword,pageSize,pageNum);
	}

	@Override
	public int getUserCountByType(String keyword, int pageSize) {
		int count=StringUtil.isEmpty(keyword)?userDAO.getUserCount() : userDAO.getUserCountByType(keyword);
		return (count+pageSize-1)/pageSize;
	}
	

}
