package business;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 123L;
	private String fname;
	private String lname;
	Address address;
	public Person() {
	}
	public Person(String fname, String lname, Address add) {
		this.fname = fname;
		this.lname = lname;
		this.address = add;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
