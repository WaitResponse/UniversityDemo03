package com.gem.qqzone.pojo;

import java.util.Date;

public class Reply {
	private int id;
	private String content;
	private Date replyDate ;
	private User author;	//单向多对一
	private Topic topic;
	private HostReply hostReply ;//一对一唯一外键

	public Reply() {
	}

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

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

}
