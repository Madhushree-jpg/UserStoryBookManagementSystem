package com.mm.repoitory;

import java.util.TreeSet;


import com.mm.model.BookStorage;

import java.util.Iterator;

public class Database
{
	public TreeSet<BookStorage> bookSet;
	
	public Database()
	{
		bookSet=new TreeSet<BookStorage>();
		
		BookStorage bs1=new BookStorage(1,"C",500,"lmr",100);
		BookStorage bs2=new BookStorage(2,"C++",500,"lmr",100);
		BookStorage bs3=new BookStorage(3,"JAVA",700,"cpy",90);
		BookStorage bs4=new BookStorage(4,"MySQL",700,"cpy",90);
		BookStorage bs5=new BookStorage(5,"ComputerNetwork",700,"cpy",90);

		bookSet.add(bs1);
		bookSet.add(bs2);
		bookSet.add(bs3);
		bookSet.add(bs4);
		bookSet.add(bs5);
		
	}
}
	
	

