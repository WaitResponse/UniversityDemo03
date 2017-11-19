package com.gem.qqzone.biz;

import java.util.Set;

import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;

public interface TopicBiz {
	Set<Topic> getTopics(User user);
	
	Topic getTopic(int id);
}
