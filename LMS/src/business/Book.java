package business;

public class Book extends Publication{
	private int ISBN;
	private int bookType;
	
	enum BookType {
		Standard, Special
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getBookType() {
		return bookType;
	}

	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	
	
}
