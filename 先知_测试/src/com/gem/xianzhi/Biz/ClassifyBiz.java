package com.gem.xianzhi.Biz;

import java.util.List;

import com.gem.xianzhi.pojo.Classify;

public interface ClassifyBiz {
	
	//1.获取分类列表
	List<Classify>getClassifyList();
	
	//2.根据分类id获取分类
	Classify getClassify(int classifyId);
}
