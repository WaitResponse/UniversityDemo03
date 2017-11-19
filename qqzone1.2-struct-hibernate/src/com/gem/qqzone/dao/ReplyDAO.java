package com.gem.qqzone.dao;

import java.util.Set;

import com.gem.qqzone.pojo.Reply;

public interface  ReplyDAO {
	
	Set<Reply>getReplies(int topicId);
}
