package business;

import java.util.List;

public class Author {
	private boolean credential;
	private String bio;
	private List<Publication> publication;
	
	public Author() {
	}

	public Author(boolean credential, String bio, List<Publication> publication) {
		this.credential = credential;
		this.bio = bio;
		this.publication = publication;
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
