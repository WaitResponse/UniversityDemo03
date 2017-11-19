package com.gem.qqzone.dao;

import java.util.Set;

import com.gem.qqzone.pojo.Topic;

public interface TopicDAO {
	//获取特定用户的所有日志
	Set<Topic> getTopics(int userId);
	
	Topic getTopic(int id);
}
