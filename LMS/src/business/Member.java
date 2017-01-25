package business;

import java.io.Serializable;

import dataaccess.DataAccessFacade;

public class Member extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String memberID;
	private CheckoutRecord checkoutRecord;
	
	
	public Member() {
	}

	public Member(String memberID,String fname, String lname,Address address) {
		super(fname,lname,address);
		this.memberID = memberID;
	}

	/*public Member(String fname, String lname, String street, String city, String state, int zip, String phone,
			String email) {
		super(fname, lname, street, city, state, zip, phone, email);
	}*/
	
	public String getMemberID() {
		return this.memberID;
	}
	
	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
	
	/**
	 * @param mem
	 * @throws Exception
	 */
	public void addMember(Member mem) throws Exception{
		DataAccessFacade dataaccess = new DataAccessFacade();
		/*Boolean alreadyExists =dataaccess.memberExists(mem.memberID);
		if(alreadyExists){
			throw new Exception("Member already exists !!");
		}
		else{*/
			dataaccess.saveMember(this);
		//}
		
	}
}
