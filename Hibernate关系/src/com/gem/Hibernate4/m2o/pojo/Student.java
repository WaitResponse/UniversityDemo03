package com.gem.Hibernate4.m2o.pojo;

public class Student {
	private String sid;
	private String sname;
	private ClassBean cb;
	
	public Student(){}

	public String getSid() {
		return sid;
	}

	public Student(String sname, ClassBean cb) {
		super();
		this.sname = sname;
		this.cb = cb;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public ClassBean getCb() {
		return cb;
	}

	public void setCb(ClassBean cb) {
		this.cb = cb;
	}
	
	
}
