package com.sample11;

public class Student {
	
	private String firstName;
	private Address personAddress;
	
	
	public Student() {
		super();
	}
	public Student(Address personAddress) {
		super();
		this.firstName = "Jim";
		this.personAddress = personAddress;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.personAddress = address;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", personAddress=" + personAddress + "]";
	}

	

}
