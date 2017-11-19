package com.gem.Hibernate4.o2o_uk.pojo;

public class Boy {
	private int bid;
	private String bname;
	private Girl girl;
	
	public Boy(){}

	public Boy(String bname) {
		super();
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
}
