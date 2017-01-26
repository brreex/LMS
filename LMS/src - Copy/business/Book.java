package business;

import java.io.Serializable;
import java.util.List;

import dataaccess.DataAccessFacade;

public class Book extends Publication implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1314L;
	private String ISBN;
	private int bookType;

	public Book(String title, String iSBN, int numCopy, PublicationCopy pubCopy, int maxCheck, List<Author> author,
			int bookType) {
		super(title, pubCopy, author, numCopy);
		ISBN = iSBN;
		this.bookType = bookType;
	}

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

	public void addBook(Book book) throws Exception {
		DataAccessFacade dataaccess = new DataAccessFacade();
		Boolean alreadyExists = dataaccess.bookExists(book.ISBN);
		if (alreadyExists) {
			throw new Exception("Member already exists !!");
		} else {
			dataaccess.saveBook(book);
		}

	}
}
