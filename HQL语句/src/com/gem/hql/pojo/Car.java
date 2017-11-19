package com.gem.hql.pojo;

public class Car {
	private int id;
	private String cname;
	private int price;
	private User user;
	
	public Car(){}
	
	
	public Car(String cname, int price, User user) {
		super();
		this.cname = cname;
		this.price = price;
		this.user = user;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", cname=" + cname + ", price=" + price + "]";
	}
	
	
}
