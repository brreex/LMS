package business;

import java.io.Serializable;

public class Librarian extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1920L;
	CheckoutRecord checkoutRecord;
	
	public Librarian() {
	}
	
	public Librarian(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}

	public Librarian(String userName, String password, String role, Person person) {
		super(userName, password, role, person);
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
}
