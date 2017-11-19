package com.gem.qqzone.biz;

import java.util.Set;

import com.gem.qqzone.pojo.User;

public interface UserBiz {
	//登录
	public User login(String loginId  , String pwd );
	
	public User getUser(int id);
	
	//获取特定用户的所有好友信息
	public Set<User> getFriends(User user);
}
