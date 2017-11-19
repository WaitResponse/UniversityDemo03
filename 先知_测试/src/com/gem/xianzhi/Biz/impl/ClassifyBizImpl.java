package com.gem.xianzhi.Biz.impl;

import java.util.List;

import com.gem.xianzhi.Biz.ClassifyBiz;
import com.gem.xianzhi.dao.ClassifyDAO;
import com.gem.xianzhi.pojo.Classify;

public class ClassifyBizImpl implements ClassifyBiz {
	private ClassifyDAO classifyDAO=null;

	@Override
	public List<Classify> getClassifyList() {
		return classifyDAO.loadAll();
	}

	public ClassifyDAO getClassifyDAO() {
		return classifyDAO;
	}

	public void setClassifyDAO(ClassifyDAO classifyDAO) {
		this.classifyDAO = classifyDAO;
	}

	@Override
	public Classify getClassify(int classifyId) {
		return classifyDAO.get(classifyId);
	}
	
	
	
	
}
