package com.gem.qqzone.biz;

import java.util.Set;

import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;

public interface TopicBiz {
	//获取特定用户的所有日志
	Set<Topic> getTopics(User user);
	
	//添加新日志
	void addToic(Topic topic);
	//删除日志(先删除所有回复)
	void delTopic(Topic topic);
	//获取特定日志信息
	Topic getTopic(int id);
}
