package com.gem.xianzhi.dao.base.impl;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.gem.xianzhi.dao.base.IBaseDAO;

public class BaseDAO<T> extends HibernateDaoSupport implements IBaseDAO<T> {
	
	private Class<T>entityClass;
	
	public BaseDAO(){
		Type genericType = getClass().getGenericSuperclass();
		Type[] actualTypeArr = ((ParameterizedType)genericType).getActualTypeArguments();
		entityClass = (Class<T>)actualTypeArr[0];
	}
	
	@Override
	public T get(Serializable id) {
		return super.getHibernateTemplate().load(entityClass, id);
	}

	@Override
	public Serializable add(T t) {//·µ»ØÖ÷¼ü
		return super.getHibernateTemplate().save(t);
	}

	@Override
	public void update(T t) {
		super.getHibernateTemplate().update(t);
	}

	@Override
	public void del(T t) {
		getHibernateTemplate().delete(t);
	}

	@Override
	public void del(Serializable id) {
		T t = get(id);
		if(t!=null){
			del(t);
		}

	}

	@Override
	public List<T> loadAll() {
		return getHibernateTemplate().loadAll(entityClass);
	}



}
