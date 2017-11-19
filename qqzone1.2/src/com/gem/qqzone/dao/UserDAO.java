package com.gem.qqzone.dao;

import java.util.Set;

import com.gem.qqzone.pojo.User;

public interface UserDAO {
	User getUser(String loginId , String pwd );
	User addUser(User user);
	User getUser(int id);
	boolean updateUser(User user);
	//获取指定id用户的所有好友
	Set<User> getUsers(int id);
}
