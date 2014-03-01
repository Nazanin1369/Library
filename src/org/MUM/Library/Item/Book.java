package org.MUM.Library.Item;

import java.util.ArrayList;
public class Book extends AItem
{
	
	private String isbn;
	private int limit;
	ArrayList<Author> authors = new ArrayList<Author>();
	
	//Constructor
	public Book(String title, String isbn, int limit) 
	{
		super(title);
		this.isbn = isbn;
		this.limit = limit;
		
	}
	

	//Methods
	public void addAnAuthor(Author author)
	{
		authors.add(author);
	}

	@Override
	public boolean checkAvailibility() {
		// TODO Auto-generated method stub
		return false;
	}

	
	//getters and setters
	
	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public ArrayList<Author> getAuthors() 
	{
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) 
	{
		this.authors = authors;
	}

	public int getLimit() 
	{
		return limit;
	}

	public void setLimit(int limit) 
	{
		this.limit = limit;
	}

	
	
	
	
	
	

}
