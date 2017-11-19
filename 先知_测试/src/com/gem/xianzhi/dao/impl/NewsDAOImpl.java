package com.gem.xianzhi.dao.impl;

import java.util.List;
import java.util.Set;

import com.gem.xianzhi.dao.NewsDAO;
import com.gem.xianzhi.dao.base.impl.BaseDAO;
import com.gem.xianzhi.pojo.Classify;
import com.gem.xianzhi.pojo.News;
import com.gem.xianzhi.pojo.User;
import com.gem.xianzhi.util.StringUtil;

import ognl.SetPropertyAccessor;

public class NewsDAOImpl extends BaseDAO<News> implements NewsDAO {

	@Override
	public Set<News>getCollectNews(int userId) {
		User user = getHibernateTemplate().load(User.class, userId);
		return user.getCollectNews();
	}

	@Override
	public Set<News> getReNews(int userId) {
		User user = getHibernateTemplate().load(User.class, userId);
		return user.getNews();
	}

	@Override
	public Set<News> getNewsByClassify(int classifyId) {
		Classify classify = getHibernateTemplate().load(Classify.class, classifyId);
		return classify.getNews();
	}

	@Override
	public List<News> getNewsList(String keyword, int pageSize, int classifyId, int pageNum) {
		if(classifyId==0){//分类为全部		
			String hql ="from News n where n.title like ? order by n.date desc";	
			return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql)
													.setParameter(0, "%"+keyword+"%")
													.setFirstResult((pageNum-1)*pageSize )
													.setMaxResults(pageSize).list();
		}else{
			String hql = "from News n where n.classify.id=? and n.title like ? order by n.date desc";
			return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql)
																	.setParameter(0, classifyId)
																	.setParameter(1, "%"+keyword+"%")
																	.setFirstResult((pageNum-1)*pageSize )
																	.setMaxResults(pageSize).list();
		}
		
	}

	@Override
	public int getNewsCount(String keyword, int pageSize, int classifyId) {
		if(classifyId==0){
			String hql="select count(*) from News n where n.title like ? ";
			int count = ((Long)getHibernateTemplate().find(hql,"%"+keyword+"%").get(0)).intValue();
			return (count+pageSize-1)/pageSize;
		}else{
			String hql = "select count(*) from News n where n.title like ? and n.classify.id =? ";
			int count = ((Long)getHibernateTemplate().find(hql,"%"+keyword+"%",classifyId).get(0)).intValue();
			return (count+pageSize-1)/pageSize;
		}
	}

	@Override
	public List<News> getNewsListAsc(String keyword, int pageSize, int classifyId, int pageNum) {
		if(classifyId==0){//分类为全部
			String hql ="from News n where n.title like ? order by n.date asc";
			return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql)
													.setParameter(0, "%"+keyword+"%")
													.setFirstResult((pageNum-1)*pageSize )
													.setMaxResults(pageSize).list();
		}else{
			String hql = "from News n where n.classify.id=? and n.title like ? order by n.date asc";
			return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql)
																	.setParameter(0, classifyId)
																	.setParameter(1, "%"+keyword+"%")
																	.setFirstResult((pageNum-1)*pageSize )
																	.setMaxResults(pageSize).list();
		}
	}




}
