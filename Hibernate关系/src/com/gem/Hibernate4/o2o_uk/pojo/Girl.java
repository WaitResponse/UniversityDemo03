package com.gem.Hibernate4.o2o_uk.pojo;

public class Girl {
	private int gid;
	private String gname;
	private Boy boy;
	public Girl(){}

	public Girl(String gname, Boy boy) {
		super();
		this.gname = gname;
		this.boy = boy;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public Boy getBoy() {
		return boy;
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}
	
}
