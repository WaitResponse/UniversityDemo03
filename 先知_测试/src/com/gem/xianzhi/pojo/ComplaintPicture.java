package com.gem.xianzhi.pojo;

public class ComplaintPicture {
	private int id;
	private String imgsrc;
	private Complaint complaint;
	
	public ComplaintPicture(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getImgsrc() {
		return imgsrc;
	}

	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}

	public Complaint getComplaint() {
		return complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}


	
}
