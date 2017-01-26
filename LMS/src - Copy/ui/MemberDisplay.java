package ui;

import java.io.Serializable;

public class MemberDisplay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String fname;
	String lname;

	MemberDisplay(String f, String l) {
		this.fname = f;
		this.lname = l;
	}

	public String getfname() {
		return this.fname;
	}

	public String getlname() {
		return this.lname;
	}
}
