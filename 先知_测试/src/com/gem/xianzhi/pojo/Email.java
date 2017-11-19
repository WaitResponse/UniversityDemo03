package com.gem.xianzhi.pojo;

import java.util.Date;

public class Email {
	private int id;
	private String content;
	private Date date;
	private User receiveUser;//收件人
	private User sendUser;//寄件人
	
	public Email(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(User receiveUser) {
		this.receiveUser = receiveUser;
	}

	public User getSendUser() {
		return sendUser;
	}

	public void setSendUser(User sendUser) {
		this.sendUser = sendUser;
	}
	
	
}
