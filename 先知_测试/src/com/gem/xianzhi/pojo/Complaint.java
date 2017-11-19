package com.gem.xianzhi.pojo;

import java.util.Date;
import java.util.Set;

public class Complaint {
	private int id;
	private Date date;//投诉日期
	private String reson;//投诉理由
	private String content;//投诉内容
	private User complaintUser;//投诉人
	private User byComplainant;//被投诉人
	private News news;//针对新闻的投诉
	private Discuss discuss;//针对评论的投诉
	private Reply reply;//针对回复的投诉
	private Set<ComplaintPicture> picture;//截图
	
	public Complaint(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReson() {
		return reson;
	}

	public void setReson(String reson) {
		this.reson = reson;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getComplaintUser() {
		return complaintUser;
	}

	public void setComplaintUser(User complaintUser) {
		this.complaintUser = complaintUser;
	}

	public User getByComplainant() {
		return byComplainant;
	}

	public void setByComplainant(User byComplainant) {
		this.byComplainant = byComplainant;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public Discuss getDiscuss() {
		return discuss;
	}

	public void setDiscuss(Discuss discuss) {
		this.discuss = discuss;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public Set<ComplaintPicture> getPicture() {
		return picture;
	}

	public void setPicture(Set<ComplaintPicture> picture) {
		this.picture = picture;
	}


	
	
}
