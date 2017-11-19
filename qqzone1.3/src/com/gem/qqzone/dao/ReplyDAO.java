package com.gem.qqzone.dao;

import java.util.Set;
import com.gem.qqzone.pojo.Reply;

public interface ReplyDAO {
	//根据topicID获取所有的回复
	Set<Reply> getReplies(int topicId);
}
