package com.gem.Hibernate4.o2o.pojo;

public class Person {
	private String pid;
	private String pname;
	private String address;
	private Card card;
	
	public Person(){}
	
	public Person(String pid, String pname, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}

	public Card getCard() {
		return card;
	}

	
	public void setCard(Card card) {
		this.card = card;
	}

	

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address="
				+ address + ", card=" + card + "]";
	}

	
}
