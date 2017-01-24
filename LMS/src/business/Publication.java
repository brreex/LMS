package business;

import java.util.List;

public class Publication {
	private String title;
	private List<PublicationCopy> pubCopy;
	private List<Author> author;
	private int numCopy;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PublicationCopy> getPubCopy() {
		return pubCopy;
	}
	public void setPubCopy(List<PublicationCopy> pubCopy) {
		this.pubCopy = pubCopy;
	}
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	public int getNumCopy() {
		return numCopy;
	}
	public void setNumCopy(int numCopy) {
		this.numCopy = numCopy;
	}
	public void search(){
		
	}
	public void displayMember(){
		
	}
	public boolean isOverdue(){
		return false;
	}
	
}
