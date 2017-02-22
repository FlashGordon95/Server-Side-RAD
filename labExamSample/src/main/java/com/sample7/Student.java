package com.sample7;

public class Student {
	
	private String firstName;
	private Address address;
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.firstName="Fred";
		this.address = address;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", address=" + address + "]";
	}

}
