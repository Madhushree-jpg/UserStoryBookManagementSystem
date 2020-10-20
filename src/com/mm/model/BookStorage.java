package com.mm.model;

public class BookStorage implements Comparable {
	
	public int book_id;
	public String book_title;
	//Date pub_date;
	double price;
	public String author;
	public int page_no;
	
	
	public BookStorage(int book_id, String book_title, double price, String author,int page_no) {
		
		this.book_id = book_id;
		this.book_title = book_title;
		//this.pub_date = ;
		this.price = price;
		this.author = author;
		this.page_no=page_no;
	}
	
	public void showDetails() {
		System.out.println("details of the books:" +book_id +book_title  +price +author +page_no);

	}

	@Override
	public String toString() {
		return "BookStorage [book_id=" + book_id + ", book_title=" + book_title + ", price=" + price + ", author="
				+ author + ", page_no=" + page_no + "]";
	}
	
	public int compareTo(Object arg0) {
		return (this.book_id - ((BookStorage)arg0).book_id);
		//return this.name.compareTo(((Employee)arg0).name);
	}


}
