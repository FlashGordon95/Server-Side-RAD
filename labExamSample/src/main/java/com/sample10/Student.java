package com.sample10;

public class Student {
	
	private String firstName;
	private Address personAddress;
	
	public Student(Address personAddress) {
		super();
		this.firstName = "Jim";
		this.personAddress = personAddress;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.firstName="Fred";
		this.personAddress = address;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", personAddress=" + personAddress + "]";
	}

}
