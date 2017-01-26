package business;

import java.io.Serializable;

public class AllAdmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 789L;
	private Librarian librarian;
	private Administrator administrator;
	
	public Librarian getLibrarian() {
		return librarian;
	}
	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	
}
