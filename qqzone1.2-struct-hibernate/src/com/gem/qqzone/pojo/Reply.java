package com.gem.qqzone.pojo;

import java.util.Date;

public class Reply {
	private int id;
	private String content;
	private Date replyDate;
	private User author;
	private Topic topic;//回复是针对哪一篇日志
	private HostReply hostReply;
	
	public Reply(){}

	
	
	public Reply(int id, String content, Date replyDate, User author, HostReply hostReply) {
		super();
		this.id = id;
		this.content = content;
		this.replyDate = replyDate;
		this.author = author;
		this.hostReply = hostReply;
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

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public HostReply getHostReply() {
		return hostReply;
	}

	public void setHostReply(HostReply hostReply) {
		this.hostReply = hostReply;
	}
			
	
	
}
