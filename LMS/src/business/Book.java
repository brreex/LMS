package business;

import java.util.HashMap;

import dataaccess.DataAccessFacade;

public class Book extends Publication{
	private String ISBN;
	private int bookType;
	
	
	
	enum BookType {
		Standard, Special
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getBookType() {
		return bookType;
	}

	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	
	public static HashMap<String, Book> getBooks() throws Exception{
		DataAccessFacade dataaccess = new DataAccessFacade();
		HashMap<String, Book> booksMap = dataaccess.readBooksMap();
		return booksMap;
	}
}
