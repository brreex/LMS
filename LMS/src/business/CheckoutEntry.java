package business;

import java.time.LocalDate;

public class CheckoutEntry {
	private PublicationCopy pubCopy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LocalDate returnDate;
	private double fine;
	public PublicationCopy getPubCopy() {
		return pubCopy;
	}
	public void setPubCopy(PublicationCopy pubCopy) {
		this.pubCopy = pubCopy;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public double getFine() {
		return fine;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}
	
}

