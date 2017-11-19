package com.gem.qqzone.dao.impl;

import java.util.Set;

import com.gem.qqzone.dao.TopicDAO;
import com.gem.qqzone.dao.factory.HibernateSessionFactory;
import com.gem.qqzone.pojo.Topic;
import com.gem.qqzone.pojo.User;

public class TopicDAOImpl implements TopicDAO {

	@Override
	public Set<Topic> getTopics(int userId) {
		Set<Topic>topics=HibernateSessionFactory.newInstance().getSession().load(User.class, userId).getTopics();
		return topics;
	}

	@Override
	public Topic getTopic(int id) {
		Topic  topic =HibernateSessionFactory.newInstance().getSession().load(Topic.class, id);
		return topic;
	}

}
