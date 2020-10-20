package com.mm.service;

import java.util.Iterator;

import com.mm.model.BookStorage;
import com.mm.repoitory.Database;

public  class BookService implements Comparable<BookStorage>{
	
	Database db;
	
	public BookService() {
		super();
		db=new Database();
	}

	public void showAllBooks()
	{
		Iterator<BookStorage>itr=db.bookSet.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
	
	 public BookStorage searchByName(String name)
		{
			for(BookStorage bookSet:db.bookSet)
			{
				
					if(bookSet.book_title.equals(name))
					{
						return  bookSet ;
					}
				}
				return null;
		}
	 
	 public void updateBookData(int bookId,int price) 
	 {
	  
	 
	 	 	Iterator<BookStorage>itr=db.bookSet.iterator();
	 	 	while(itr.hasNext())
	 	 	{
	 	 		BookStorage bs=itr.next();
	 	 		if(bs.book_id==bookId)
	 	 		{
	 	 			String book_title=bs.book_title;
	 	 			String author=bs.author;
	 	 			Integer page_no=bs.page_no;
	 	 			itr.remove();
	 	 			BookStorage b=new BookStorage(bookId,book_title,price,author,page_no);
	 	 			db.bookSet.add(b);
	 	 			System.out.println("Details Updated Successfully");
				
	 	 			Iterator<BookStorage>itr1=db.bookSet.iterator();
	 	 			while(itr1.hasNext()) 
	 	 			{
						System.out.println(itr1.next());
	 	 			}
	 	 		}
			 
	 	 	}
	 }	
	
	 public void addNewBook(BookStorage bs1)
		{
			
			db.bookSet.add(bs1);
			System.out.println("Book inserted successfully");
			Iterator<BookStorage>itr1=db.bookSet.iterator();
			while(itr1.hasNext()) 
			{
				System.out.println(itr1.next());
			}
			
		}	
			
	 
	public void removeBook(int bookId)
	{
		
		boolean notFound=true;
		Iterator<BookStorage>itr=db.bookSet.iterator();
		while(itr.hasNext())
		{
			BookStorage bs=itr.next();
			if(bs.book_id==bookId)
			{
				notFound=false;
				itr.remove();
				System.out.println("Book has deleted successfully");
				break;
				
			}
		}
		if(notFound)
		{
			System.out.println("no such available");
		}
		Iterator<BookStorage>itr1=db.bookSet.iterator();
		while(itr1.hasNext()) 
		{
		System.out.println(itr1.next());
		}
	}
	

	@Override
	public int compareTo(BookStorage o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
