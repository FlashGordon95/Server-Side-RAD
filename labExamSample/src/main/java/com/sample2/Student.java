package com.sample2;

public class Student {
	
	private String firstName;
	private int age;
	
	public Student() {
		this.firstName = "none";
		this.age = 0;
	}
	public Student(String name, int age) {
		this.firstName = name;
		this.age = age;
	}
	
	public void setFirstName(String firstName){
		this.firstName= firstName;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + firstName + ", age=" + age + "]";
	}
}//end Student 
