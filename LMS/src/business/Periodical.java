package business;

import java.time.LocalDate;

public class Periodical extends Publication {
	private LocalDate dateOfPublication;
	private String type;
	private int periodical;
	
	public int getPeriodical() {
		return periodical;
	}
	public void setPeriodical(int periodical) {
		this.periodical = periodical;
	}
	public LocalDate getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(LocalDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
