package com.qspider.dao;

import java.util.ArrayList;
import java.util.List;

import com.qspider.dto.Author;
import com.qspider.dto.Books;

public class BookDao implements JpaSteps {
	
	public static void createBook(int bookId,String bookName,String title,int a_Id)
	{
		Books b=new Books();
		b.setId(bookId);
		b.setName(bookName);
		b.setTitle(title);
	
		
		Author a=manager.find(Author.class,a_Id);
		List<Books> book=a.getBooks();
		if(book != null)
		{
			book.add(b);
		}
		else
		{
			book=new ArrayList<Books>();
			book.add(b);
		}
		System.out.println(book);
		a.setBooks(book);
		tr.begin();
		manager.persist(b);
		tr.commit();
	}

}
