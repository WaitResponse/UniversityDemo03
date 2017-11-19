package com.gem.xianzhi.dao;

import java.util.Set;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.Discuss;

public interface DiscussDAO extends IBaseDAO<Discuss> {
	
	//1.根据新闻id加载所有的评论
	Set<Discuss>getDiscuss(int newsId);
}
