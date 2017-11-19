package com.gem.qqzone.biz;

import java.util.Set;

import com.gem.qqzone.pojo.User;

public interface  UserBiz {
	public User login(String loginId,String pwd);
	
	public Set<User>getFriends(User user);
	
	public User getUser(int id);
}
