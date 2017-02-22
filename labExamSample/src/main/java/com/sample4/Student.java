package com.sample4;

public class Student {
	
	private String firstName;
	private int age;
	
	public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", age=" + age + "]";
	}

}
