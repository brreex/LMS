package business;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Periodical extends Publication implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2324L;

	public Periodical(String title, PublicationCopy pubCopy, List<Author> author, int numCopy) {
		super(title, pubCopy, author, numCopy);
	}
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
