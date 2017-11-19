package com.gem.Hibernate4.o2o.pojo;

public class Card {
	private String pid;
	private String cardNo;
	private Person person ;

	public Card() {
	}

	public Card(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	public Card(String cardNo, Person person) {
		super();
		this.cardNo = cardNo;
		this.person = person;
	}

	public Card(String pid, String cardNo) {
		super();
		this.pid = pid;
		this.cardNo = cardNo;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Card [pid=" + pid + ", cardNo=" + cardNo + "]";
	}
	
}
