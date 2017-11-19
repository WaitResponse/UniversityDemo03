package com.gem.Hibernate4.o2m.pojo;

public class Student {
	private String sid;
	private String sname;
	private ClassBean cb;
	
	public Student(){}

	public Student(String sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public String getSid() {
		return sid;
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
