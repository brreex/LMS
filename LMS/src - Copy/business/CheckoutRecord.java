package business;

import java.io.Serializable;
import java.util.List;

public class CheckoutRecord implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1718L;
	private List<CheckoutEntry> checkoutEntries;
	private Member member;
	
	public void addCheckoutRecord(){
		
	}
	public List<CheckoutEntry> getCheckoutEntries() {
		return checkoutEntries;
	}
	public void setCheckoutEntries(List<CheckoutEntry> checkoutEntries) {
		this.checkoutEntries = checkoutEntries;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
}
