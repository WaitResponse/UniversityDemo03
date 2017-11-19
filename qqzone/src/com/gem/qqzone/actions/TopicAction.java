package com.gem.qqzone.actions;

import java.util.Date;
import java.util.Set;

import org.hibernate.Hibernate;

import com.gem.qqzone.biz.TopicBiz;
import com.gem.qqzone.biz.UserBiz;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;
import com.opensymphony.xwork2.ActionContext;

public class TopicAction {
	private TopicBiz topicBiz=null;
	private UserBiz userBiz=null;
	private int uid ;
	private int id ;
	private Topic topic;
	
	
	public String topics(){
		if(uid!=0){
			User user = userBiz.getUser(uid);	//这一步不能省，必须从数据库找到user

			//Set<Topic> topics = topicBiz.getTopics(user);
			Hibernate.initialize(user.getTopics());
		//	user.setTopics(topics);
		//	Hibernate.initialize(topics);
			ActionContext.getContext().getSession().put("currFriend", user);
			return "success";
		}
		return "login";
	}
	public String topicList(){
		User currUser=(User)ActionContext.getContext().getSession().get("currUser");
		int uid=currUser.getId();
		currUser=userBiz.getUser(uid);

		Hibernate.initialize(currUser.getTopics());
		ActionContext.getContext().getSession().put("currFriend",currUser);
		return "success";
	}
	public String detail(){
		Topic topic = topicBiz.getTopic(id);
		ActionContext.getContext().put("topic", topic);
		return "detail";
	}
	public String addTopic(){
		User currUser=(User)ActionContext.getContext().getSession().get("currUser");
		topic.setAuthor(currUser);
		topic.setTopicDate(new Date());
		topicBiz.addToic(topic);
		return "topicList";	
	}
	public String delTopic(){
		topicBiz.delTopic(topic);
		return "topicList";
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
	public TopicBiz getTopicBiz() {
		return topicBiz;
	}
	public void setTopicBiz(TopicBiz topicBiz) {
		this.topicBiz = topicBiz;
	}
	public UserBiz getUserBiz() {
		return userBiz;
	}
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
