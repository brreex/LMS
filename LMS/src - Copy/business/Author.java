package business;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1112L;
	private boolean credential;
	private String bio;
	private List<Publication> publication;
	
	public Author() {
	}

	public Author(String firstname, String lastname, String phoneno, boolean credential, String bio, Publication publication, Address adr) {
		super(firstname,lastname,adr);
		this.credential = credential;
		this.bio = bio;
		this.publication = new ArrayList<>();
		this.publication.add(publication);
	}

	public boolean isCredential() {
		return credential;
	}

	public void setCredential(boolean credential) {
		this.credential = credential;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Publication> getPublication() {
		return publication;
	}

	public void setPublication(Publication pub) {
		publication.add(pub);
	}
	
	
}
