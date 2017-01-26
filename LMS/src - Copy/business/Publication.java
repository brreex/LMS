package business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Publication implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2728L;
	private String title;
	private List<PublicationCopy> pubCopy;
	private List<Author> author;
	private int numCopy;
	
	public Publication(String title, PublicationCopy pubCopy, List<Author> author, int numCopy) {
		this.title = title;		this.pubCopy = new ArrayList<PublicationCopy>();
		this.pubCopy.add(pubCopy);
		this.author = author;
		this.numCopy = numCopy;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PublicationCopy> getPubCopy() {
		return pubCopy;
	}
	public void setPubCopy(PublicationCopy pubCopy) {
		this.pubCopy.add(pubCopy);
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
