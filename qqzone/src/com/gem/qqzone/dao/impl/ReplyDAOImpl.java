package com.gem.qqzone.dao.impl;

import java.util.Set;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gem.qqzone.dao.ReplyDAO;
import com.gem.qqzone.pojo.Reply;
import com.gem.qqzone.pojo.Topic;

public class ReplyDAOImpl extends HibernateDaoSupport  implements ReplyDAO {
	public Set<Reply> getReplies(int topicId) {
		Set<Reply> replies = getHibernateTemplate().load(Topic.class, topicId).getReplies();
		return replies ;
	}
}
