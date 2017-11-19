package com.gem.xianzhi.pojo;

import java.util.Date;
import java.util.Set;

public class News {
	private int id;
	private String title;
	private String content;
	private Date date;
	
	private Classify classify;//新闻分类
	private User author;
	private Video video;//新闻视频
	private Set<Discuss>discuss;//评论
	private Set<Picture>picture;//新闻图片
	private FocusPicture focusPicture;//焦点图
	

	
	public News(){}

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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Classify getClassify() {
		return classify;
	}

	public void setClassify(Classify classify) {
		this.classify = classify;
	}

	public Set<Discuss> getDiscuss() {
		return discuss;
	}

	public void setDiscuss(Set<Discuss> discuss) {
		this.discuss = discuss;
	}

	public Set<Picture> getPicture() {
		return picture;
	}

	public void setPicture(Set<Picture> picture) {
		this.picture = picture;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public FocusPicture getFocusPicture() {
		return focusPicture;
	}

	public void setFocusPicture(FocusPicture focusPicture) {
		this.focusPicture = focusPicture;
	}


}
