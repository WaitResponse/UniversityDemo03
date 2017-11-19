package com.gem.qqzone.pojo;

import java.util.Set;



public class User {
	private int id;
	private String loginid;
	private String pwd;
	private String nickName;
	private String headImg;
	private UserDetail userDetail;
	
	private Set<Topic>topics;
	private Set<User>friends;
	
	public User(){}

	public User(int id, String nickName, String headImg) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.headImg = headImg;
	}

	public User(int id, String loginid, String pwd, String nickName, String headImg) {
		super();
		this.id = id;
		this.loginid = loginid;
		this.pwd = pwd;
		this.nickName = nickName;
		this.headImg = headImg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}


	
}	
