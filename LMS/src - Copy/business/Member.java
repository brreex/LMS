package business;
import java.io.Serializable;

import dataaccess.DataAccessFacade;
public class Member extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2122L;
	
	
	String memberID;
	private CheckoutRecord checkoutRecord;
	
	
	public Member() {
	}

	public Member(String memberID,String fname, String lname,Address address) {
		super(fname,lname,address);
		this.memberID = memberID;
	}
	
	public String getMemberID() {
		return this.memberID;
	}
	
	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
	public void addMember(Member mem) throws Exception{
		DataAccessFacade dataaccess = new DataAccessFacade();
		
		Boolean alreadyExists = dataaccess.memberExists(mem.memberID);
		if(alreadyExists){
			throw new Exception("Member already exists !!");
		}
		else{
			dataaccess.saveMember(mem);
		}
		
	}
}
