package com.library;

public class Book {
	private String iSBN;
	private String author;
	private String title;
	private double price;
 
	public Book() {
		
	}

	public Book(String iSBN, String author, String title, double price) {
		//super();
		this.iSBN = iSBN;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public String getiSBN() {
		return iSBN;
	}

	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book ISBN: " + iSBN + ", author: " + author + ", title: " + title + ", price: " + price;
	}
	
	
}
