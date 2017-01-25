package business;

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
	
}
