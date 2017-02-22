package com.sample8;

public class Student {
	
	private String firstName;
	private String lastName;
	
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", lastName=" + lastName + "]";
	}

}
