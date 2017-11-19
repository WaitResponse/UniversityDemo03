package com.gem.qqzone.biz.impl;

import java.util.Set;

import com.gem.qqzone.biz.TopicBiz;
import com.gem.qqzone.dao.ReplyDAO;
import com.gem.qqzone.dao.TopicDAO;
import com.gem.qqzone.pojo.Reply;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;

public class TopicBizImpl implements TopicBiz {

	private TopicDAO topicDAO = null;
	private ReplyDAO replyDAO = null;
	
	public Set<Topic> getTopics(User user) {
		return topicDAO.getTopics(user.getId());
	}

	public Topic getTopic(int id) {
		//1.获取日志本身的详情
		Topic topic = topicDAO.getTopic(id);
		
		//2.获取日志的所有回复(如果这个回复有主人回复，则需要同时将主人回复加载)
		Set<Reply> replies = replyDAO.getReplies(topic.getId());
		
		topic.setReplies(replies);
		
		return topic;
	}

	public TopicDAO getTopicDAO() {
		return topicDAO;
	}

	public void setTopicDAO(TopicDAO topicDAO) {
		this.topicDAO = topicDAO;
	}

	public ReplyDAO getReplyDAO() {
		return replyDAO;
	}

	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}

}
