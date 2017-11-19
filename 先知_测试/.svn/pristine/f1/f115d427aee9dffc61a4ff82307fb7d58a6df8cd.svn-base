package com.gem.xianzhi.dao;

import java.util.Set;

import com.gem.xianzhi.dao.base.IBaseDAO;
import com.gem.xianzhi.pojo.Email;

public interface EmailDAO extends IBaseDAO<Email>{
	
	//1.根据用户id加载用户收到的邮件
	Set<Email>getRecdiveEmails(int userId);
	
	//2.根据用户id加载用户发送的邮件
	Set<Email>getSendEmails(int userId);
		
}
