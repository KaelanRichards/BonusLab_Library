package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<>();
		
		int userInt = 0;
		
		bookList.add(new Book("ISBN", "Author", "title", 00.00));
		bookList.add(new Book("ISBN", "Author", "title", 00.00));
		bookList.add(new Book("ISBN", "Author", "title", 00.00));
		bookList.add(new UsedBook("ISBN", "Author", "title", 00.00, "contition"));
		bookList.add(new UsedBook("ISBN", "Author", "title", 00.00, "contition"));
		bookList.add(new UsedBook("ISBN", "Author", "title", 00.00, "contition"));
		
		userInt = Validator.getInt(scan, "How many books would you like to creat");
		
		for (int i = 0; i < userInt; i++) {
			Book userBook = new Book();
			userBook.setiSBN(Validator.getString(scan, "Please enter the ISBN number: "));
			userBook.setAuthor(Validator.getString(scan, "Please enter the Author name: "));
			userBook.setTitle(Validator.getString(scan, "Please enter the title name: "));
			userBook.setPrice(Validator.getDouble(scan, "Please enter the price: "));
			
			bookList.add(userBook);
		}
		String cont = "y";
		
		do {	
		
		int j = 1;
		for(Book b : bookList) {
			System.out.println(j + ":    " + b);
			j++;
		}
		
		
		int userChoice = Validator.getInt(scan, "Chose which book you would like");
		bookList.remove(userChoice-1);
		j=1;
		for(Book b : bookList) {
			System.out.println(j + ":    " + b);
			j++;
		}
		cont = Validator.getString(scan, "Would you like to continue(y/n)");
		} while(cont.equalsIgnoreCase("y"));
	
		
		
	}
}