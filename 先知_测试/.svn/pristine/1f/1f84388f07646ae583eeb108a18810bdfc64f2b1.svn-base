package com.gem.xianzhi.actions;

import java.util.List;

import com.gem.xianzhi.Biz.UserBiz;
import com.gem.xianzhi.pojo.User;
import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private User user;
	private int currPage;
	private String keyword;
	private UserBiz userBiz=null;
	
	//后台登录(同时加载所用户列表)
	public String backStageLogin(){
		User Administrator=userBiz.login(user.getLoginId(), user.getPwd());
		if(Administrator!=null&&Administrator.getType().equals("管理员")){
			ActionContext.getContext().getSession().put("Administrator", Administrator);
			if(currPage<=0){
				currPage=1;
			}
			if(keyword==null){
				keyword="";
			}
			int pageSize = 10;
			int pageCount = userBiz.getUserCount(keyword,pageSize);
			ActionContext.getContext().getSession().put("pageCount", pageCount);
			
			//如果当前页数大于总页数
			if(currPage>pageCount){
				currPage--;
			}
			ActionContext.getContext().getSession().put("currPage", currPage);
			List<User>userList = userBiz.getUserList(keyword, pageSize, currPage);
			ActionContext.getContext().getSession().put("userList", userList);
			return "bkLoginSuccess";
		}else{
			String msg="用户不存在或密码错误";
			ActionContext.getContext().getSession().put("msg", msg);
			return "fail";
		}	
	}
	
	//加载所有用户
	public String preIndex(){
		if(currPage<=0){
			currPage=1;
		}
		if(keyword==null){
			keyword="";
		}
		int pageSize = 10;
		int pageCount = userBiz.getUserCount(keyword,pageSize);
		ActionContext.getContext().getSession().put("pageCount", pageCount);
		
		//如果当前页数大于总页数
		if(currPage>pageCount){
			currPage--;
		}
		ActionContext.getContext().getSession().put("currPage", currPage);
		List<User>userList = userBiz.getUserList(keyword, pageSize, currPage);
		ActionContext.getContext().getSession().put("userList", userList);
			return "loadAllSuccess";
	}
	
	//前台登录
	public String login(){
		User currUser = userBiz.login(user.getLoginId(), user.getPwd());
		if(currUser!=null&&currUser.getState().equals("正常")){
			ActionContext.getContext().getSession().put("currUser", currUser);
			return "success";
		}
		if(currUser!=null&&currUser.getState().equals("封禁")){
			return "banned";
		}
		return "fail";
	}
	//用户封禁和解封
	public String bannedAndDeblock(){
		User newUser = userBiz.getUser(user.getId());
		if(newUser.getState().equals("封禁")){
			newUser.setState("正常");
		}else{
			newUser.setState("封禁");
		}	
		userBiz.update(newUser);
		return "bdSuccess";
	}
	
	public String userType(){
		if(currPage<=0){
			currPage=1;
		}
		if(keyword==null){
			keyword="";
		}
		int pageSize = 10;
		int pageCount = userBiz.getUserCountByType(keyword,pageSize);
		ActionContext.getContext().getSession().put("pageCount", pageCount);
		//如果当前页数大于总页数
		if(currPage>pageCount){
			currPage--;
		}
		ActionContext.getContext().getSession().put("currPage", currPage);
		List<User>userList = userBiz.getUserByType(keyword, pageSize, currPage);
		ActionContext.getContext().getSession().put("userList", userList);
			return "loadAllSuccess";
	}
	
	
	
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
