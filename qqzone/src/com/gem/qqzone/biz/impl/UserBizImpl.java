package com.gem.qqzone.biz.impl;

import java.util.Set;

import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.dao.UserDAO;
import com.gem.qqzone.pojo.User;

public class UserBizImpl implements UserBiz {
	
	private UserDAO userDAO = null;

	public User login(String loginId  , String pwd) {
		User user = userDAO.getUser(loginId, pwd);
		return user;
	}

	public Set<User> getFriends(User user) {
		return userDAO.getUsers(user.getId());
	}

	public User getUser(int id) {
		return userDAO.getUser(id);
	}
	public UserDAO getUserDAO(){
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}

}
