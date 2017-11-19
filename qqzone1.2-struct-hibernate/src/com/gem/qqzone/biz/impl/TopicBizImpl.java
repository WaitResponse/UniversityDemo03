package com.gem.qqzone.biz.impl;

import java.util.Set;

import com.gem.qqzone.biz.TopicBiz;
import com.gem.qqzone.dao.ReplyDAO;
import com.gem.qqzone.dao.TopicDAO;
import com.gem.qqzone.dao.impl.ReplyDAOImpl;
import com.gem.qqzone.dao.impl.TopicDAOImpl;
import com.gem.qqzone.pojo.Reply;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;

public class TopicBizImpl implements TopicBiz {
	private TopicDAO topicDAO=new TopicDAOImpl();
	private ReplyDAO replyDAO = new ReplyDAOImpl();
	@Override
	public Set<Topic> getTopics(User user) {
		Set<Topic> topics=topicDAO.getTopics(user.getId());
		return topics;
	}

	@Override
	public Topic getTopic(int id) {
		//1.获取日志本身详情
		Topic topic =topicDAO.getTopic(id);
		//2.获取日志的回复
		Set<Reply>replies=replyDAO.getReplies(topic.getId());
		
		topic.setReplies(replies);
		
		return topic;
	}

}
