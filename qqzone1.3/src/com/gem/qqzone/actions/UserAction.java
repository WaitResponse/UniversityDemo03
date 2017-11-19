package com.gem.qqzone.actions;

import org.hibernate.Hibernate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.pojo.User;
import com.opensymphony.xwork2.ActionContext;


public class UserAction{
	
	private User user ;
	private UserBiz userBiz = (UserBiz)new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userBiz");
	
	public String login(){
		
		User currUser = userBiz.login(user.getLoginId(), user.getPwd());
		if(currUser!=null){
			currUser = userBiz.getUser(currUser.getId());//此时currUser是持久态
			Hibernate.initialize(currUser.getFriends());
			Hibernate.initialize(currUser.getTopics());//强制加载和currUser关联的好友和日志
		//	currUser.getFriends().size();
		//	currUser.getTopics().size();
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
