package business;

import java.util.List;

public class Administrator extends User{
	private List<Member> member;
	private List<Publication> publication;
	
	
	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	public List<Publication> getPublication() {
		return publication;
	}

	public void setPublication(Publication pub) {
		this.publication.add(pub);
	}

	public void addPublication(){
		
	}
	
	public void addMember(){
		
	}
	
	public void editMember(){
		
	}
	
	public void addCopy(){
		
	}
}
