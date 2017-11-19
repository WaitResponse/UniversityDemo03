package com.gem.Hibernate4.o2m.pojo;

import java.util.Set;

public class ClassBean {
	private String cid;
	private String cname;
	private Set<Student>students;
	
	public ClassBean(){}

	
	public ClassBean(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
