package com.gem.xianzhi.Biz.impl;

import java.util.List;

import com.gem.xianzhi.Biz.NewsBiz;
import com.gem.xianzhi.dao.NewsDAO;
import com.gem.xianzhi.pojo.News;
import com.gem.xianzhi.util.StringUtil;

public class NewsBizImpl implements NewsBiz {
	private NewsDAO newsDAO = null;
/*	private DiscussDAO discussDAO = null;
	private ReplyDAO replyDAO = null;*/

	@Override
	public News getNews(int newsId) {
		return  newsDAO.get(newsId);	
	}

	@Override
	public List<News> getNewsList(String keyword, int pageSize,int classifyId, int pageNum) {
		return newsDAO.getNewsList(keyword , pageSize , classifyId,pageNum);
	}

	@Override
	public int getNewsCount(String keyword, int pageSize, int classifyId) {
		return newsDAO.getNewsCount(keyword , pageSize,classifyId);
	}
	@Override
	public List<News> getNewsListAsc(String keyword, int pageSize, int classifyId, int pageNum) {
		return newsDAO.getNewsListAsc(keyword, pageSize, classifyId, pageNum);
	}

	
	public NewsDAO getNewsDAO() {
		return newsDAO;
	}

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public List<News> getNewsList(String keyword, int pageSize, int pageNum) {
		return null;
	}

	@Override
	public int getNewsCount(String keyword, int pageSize) {
		return 0;
	}

	@Override
	public void delNews(int newsId) {		
		newsDAO.del(newsId);
	}


	
}
