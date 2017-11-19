package com.gem.qqzone.dao.impl;

import java.util.Set;

import com.gem.qqzone.dao.ReplyDAO;
import com.gem.qqzone.dao.factory.HibernateSessionFactory;
import com.gem.qqzone.pojo.Reply;
import com.gem.qqzone.pojo.Topic;

public class ReplyDAOImpl implements ReplyDAO {

	@Override
	public Set<Reply> getReplies(int topicId) {
		Set<Reply>replies = HibernateSessionFactory.newInstance().getSession().load(Topic.class, topicId).getReplies();
		return replies;
	}

}
