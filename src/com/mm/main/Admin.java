package com.mm.main;
import java.util.Scanner;

import com.mm.model.BookStorage;
import com.mm.service.BookService;

public class Admin {
	
	public static void main(String  args[]){
		
		Scanner sc=new Scanner(System.in);
		
		BookService bss=new BookService();
		
		do {
			
		System.out.println("Hello User...Welcome to this BookStorage");
		System.out.println("PRESS  1 FOR VIEW ALL BOOKS\n" 
				+"PRESS 2 FOR SEARCH A BOOK BY NAME \n" 
				+"PRESS 3 FOR UPDATING THE PRICE OF THE BOOK\n"
				+"PRESS 4 FOR INSERTION\n"
				+"PRESS 5 FOR DELETION\n"
				+"PRESS 6 FOR EXIT\n");
		
		System.out.println("enter the option of menu");
		int menu=sc.nextInt();
		System.out.println("you have choosen from the menu is" +menu);
		
		
		while(menu<1 || menu>6)
		{
			System.out.println("incorrect choice");
			
			System.out.println("select the correct option");
			System.out.println("press 1 for view all books\n" 
					+"press 2 for search a book by name\n" 
					+"press 3 for updating the price of the book\n"
					+"press 4 for insertion\n"
					+"press 5 for deletion\n");
			menu=sc.nextInt();
			System.out.println("you have choosed the option" +menu);
		}
	
		
		switch(menu)
		{
		case 1:
		{
			
			System.out.println("you want to view all books");
			bss.showAllBooks();
			break;
		}
		case 2:
		{
			System.out.println("you want to search a book by name");
			System.out.println("Enter the title of the book");
			String name=sc.next();
			
			BookStorage bs=bss.searchByName(name);
			if(bs!=null)
			{
				System.out.println(bs);
			}
			else
			{
				System.out.println("Try again ..There is no book available by this name");
			}
			
			
			break;
		}
		case 3:
		{
			System.out.println("you want to update the price of the book");
			System.out.println("Enter the id");
			int idu=sc.nextInt();
			System.out.println("Enter the price");
			int price=sc.nextInt();
			
			bss.updateBookData(idu, price);
			return;
		}
		case 4:
		{
			System.out.println("Insert ");
			
			 
			 System.out.println("enter the book id");
			 int book_id=sc.nextInt();
			 System.out.println("you entered the book id\n" +book_id);
			  
			  
			 System.out.println("enter the book title"); 
			 String book_title=sc.next();
			 System.out.println("you have entered\n" +book_title);
			  
			 System.out.println("enter the book price");
			 int price=sc.nextInt();
			 System.out.println("you have entered\n" +price);
			  
			 System.out.println("enter the author name");
			 String author=sc.next();
			 System.out.println("you have entered\n" +author);
			  
			 System.out.println("enter the page number"); 
			 int page_no=sc.nextInt();
			 System.out.println("you have entered\n" +page_no);
			 
			 BookStorage bs4=new BookStorage(book_id,book_title,price,author,page_no);
			 
			 bss.addNewBook(bs4);
			 break;
		}
		case 5:
		{
			System.out.println("Deletion");
			System.out.println("enter the bookid");
			int book_id=sc.nextInt(); 
			System.out.println("you want to delete:" +book_id);
			
			bss.removeBook(book_id);
			break;
		}
		case 6:
		{
			System.out.println("you want to exit...Thank you for visiting!!");
			//System.exit(menu);
			return;
		}
		default:
		{
			System.out.println("invalid option");
			System.exit(menu);
			return;
		}
	
		}
		
		
	
	}
		while(true);
	}

}




	
		
		
		

