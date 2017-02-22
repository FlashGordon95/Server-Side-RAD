package com.sample3;

public class Student {
	
	private String firstName;
	private String lastName;
	
	public Student() {
		this.firstName = "none";
		this.lastName = "none";
	}
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}//end Student 
