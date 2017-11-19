package com.gem.xianzhi.dao;

import java.util.Set;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.Reply;

public interface ReplyDAO extends IBaseDAO<Reply> {
	
	//1.根据评论id加载所有回复
	Set<Reply>getReplys(int discussId);
	
}
