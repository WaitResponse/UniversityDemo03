package com.gem.xianzhi.dao;

import java.util.List;
import java.util.Set;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.News;

public interface NewsDAO extends IBaseDAO<News> {
	
	//1.获取指定id用户收藏的新闻
	Set<News>getCollectNews(int userId);
	
	//2.获取指定用户发布的新闻
	Set<News>getReNews(int userId);
	
	//3.根据分类id获取该分类下的所有新闻
	Set<News>getNewsByClassify(int classifyId);
	
	//4.根据关键字获取新闻(desc)
	List<News>getNewsList(String keyword , int pageSize ,int classifyId, int pageNum);
	
	//5.获取新闻总页数
	int getNewsCount(String keyword , int pageSize,int classifyId);
	
	//6...(asc)
	List<News>getNewsListAsc(String keyword , int pageSize ,int classifyId, int pageNum);
}
