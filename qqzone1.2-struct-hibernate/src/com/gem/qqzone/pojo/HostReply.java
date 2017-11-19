package com.gem.qqzone.pojo;

import java.util.Date;

public class HostReply {
	private int id;
	private String content;
	private Date hostReplyDate;
	private Reply reply;
	
	public HostReply(){}
	
	
	public HostReply(int id, String content, Date hostReplyDate) {
		super();
		this.id = id;
		this.content = content;
		this.hostReplyDate = hostReplyDate;
	}



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

	public Date getHostReplyDate() {
		return hostReplyDate;
	}

	public void setHostReplyDate(Date hostReplyDate) {
		this.hostReplyDate = hostReplyDate;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}
	
	
}
