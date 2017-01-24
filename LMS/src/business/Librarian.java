package business;

public class Librarian extends User{
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
