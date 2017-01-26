package business;

import java.io.Serializable;

public class PublicationCopy implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3031L;
	private Publication publication;
	private int copyId;
	private boolean isAvailable;
	
	public PublicationCopy(Publication publication, int copyId, boolean isAvailable) {
		this.publication = publication;
		this.copyId = copyId;
		this.isAvailable = isAvailable;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	public int getCopyId() {
		return copyId;
	}
	public void setCopyId(int copyId) {
		this.copyId = copyId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
