package com.gem.xianzhi.dao;


import java.util.List;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.User;

public interface UserDAO extends IBaseDAO<User> {
	
	//1.用户登录
	User login(String loginId,String pwd);
	
	//获取总记录条数
	int getUserCount();
	
	//2.根据关键字获取总记录条数
	int getUserCount(String keyword);
	
	//3.根据关键字查询，每页显示pageSize条记录，当前显示pageNum页
	List<User>getUserList(String keyword ,int pageSize , int pageNum);
	
	//4.根据用户类型查询记录
	List<User>getUserByType(String keyword,int pageSize, int pageNum);
	
	//5.根据用户类型查询记录条数
	int getUserCountByType(String keyword);
}
	
	
