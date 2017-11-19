package com.gem.qqzone.actions;

import org.hibernate.Hibernate;

import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.biz.impl.UserBizImpl;
import com.gem.qqzone.pojo.User;
import com.opensymphony.xwork2.ActionContext;

public class UserAciton {
	private User user;
	private UserBiz userBiz=new UserBizImpl();
	public String login(){
		User currUser =userBiz.login(user.getLoginid(),user.getPwd());
		if(currUser!=null){
			currUser =userBiz.getUser(currUser.getId());//此时currUser处于持久状态
			Hibernate.initialize(currUser.getFriends());//强制加载
			Hibernate.initialize(currUser.getTopics());
			currUser.getFriends().size();
			currUser.getTopics().size();
			ActionContext.getContext().getSession().put("currUser", currUser);
			ActionContext.getContext().getSession().put("currFriend", currUser);
			return "success";
		}
		return "fail";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
