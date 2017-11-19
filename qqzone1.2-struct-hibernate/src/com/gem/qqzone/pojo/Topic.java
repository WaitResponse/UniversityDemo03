package com.gem.qqzone.pojo;

import java.util.Date;
import java.util.Set;

public class Topic {
	private int id;
	private String title,content;
	private Date topicDate;
	private User author;
	private Set<Reply>replies;
	
	public Topic(){}
	
	
	
	public Topic(int id, String title, String content, Date topicDate, User author) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.topicDate = topicDate;
		this.author = author;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTopicDate() {
		return topicDate;
	}

	public void setTopicDate(Date topicDate) {
		this.topicDate = topicDate;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Set<Reply> getReplies() {
		return replies;
	}

	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}
	
	
}
