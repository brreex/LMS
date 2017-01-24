package business;

public class Person {
	private String fname;
	private String lname;
	Address address;
	public Person() {
	}
	public Person(String fname, String lname, String street,
			String city,String state,int zip,String phone,String email) {
		this.fname = fname;
		this.lname = lname;
		Address add = new Address(street, city, state, zip, phone, email);
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
