package com.gem.hql.pojo;

import java.util.Set;

public class User {
	private int id;
	private String uname;
	private int age;
	private int height;
	private String address;
	private Set<Car>cars;
	
	public User(){}
	
	
	public User(String uname, int age, int height, String address) {
		super();
		this.uname = uname;
		this.age = age;
		this.height = height;
		this.address = address;
	}


	public Set<Car> getCars() {
		return cars;
	}


	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", age=" + age + ", height=" + height + ", address=" + address
				+ ", cars=" + cars + "]";
	}
	
	
}
