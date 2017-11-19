package com.gem.qqzone.actions;

import java.util.Set;

import com.gem.qqzone.biz.TopicBiz;
import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.biz.impl.TopicBizImpl;
import com.gem.qqzone.biz.impl.UserBizImpl;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;
import com.opensymphony.xwork2.ActionContext;

public class TopicAction {
	private TopicBiz topicBiz = new TopicBizImpl();
	private UserBiz userBiz=new UserBizImpl();
	private int uid;
	private int id;
	
	public String topics(){
		if(uid!=0){
			User user=userBiz.getUser(uid);
			Set<Topic>topics=topicBiz.getTopics(user);
			user.setTopics(topics);
			ActionContext.getContext().getSession().put("currFriend", user);
			return "success";
		}
		return "login";
	}
	public String detail(){
		Topic topic=topicBiz.getTopic(id);
		ActionContext.getContext().getSession().put("topic", topic);
		return "detail";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	
	
		
}
