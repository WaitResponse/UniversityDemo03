package com.gem.xianzhi.dao.base;

import java.io.Serializable;
import java.util.List;

public interface  IBaseDAO<T> {
	//1.根据主键id加载实体对象
	T get(Serializable id);
	
	//2.保存实体对象
	Serializable add(T t);
	
	//3.修改实体对象
	void update(T t);
	
	//4.删除实体对象
	void del(T t);
	
	//5.根据ID删除实体对象
	void del(Serializable id);
	
	//6.加载所有
	List<T> loadAll();

}
