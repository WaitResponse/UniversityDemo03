package com.gem.xianzhi.dao;

import java.util.List;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.Classify;

public interface ClassifyDAO extends IBaseDAO<Classify>{
	
	List<Classify>getClassifyList();
}
