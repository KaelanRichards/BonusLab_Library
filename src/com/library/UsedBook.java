package com.library;

public class UsedBook extends Book {
	
	private String condition;
	
	public UsedBook() {
		//super();
	}


	public UsedBook(String iSBN, String author, String title, double price, String condition) {
		super(iSBN, author, title, price);
		this.condition = condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getCondition() {
		return condition;
	}
	
}
