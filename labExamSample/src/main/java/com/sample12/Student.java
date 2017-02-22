package com.sample12;

public class Student {
	
	private String firstName;
	private String surname;
	private int age;
	
	
	public Student() {
		System.out.println("Student 1");
	}
	
	

	public Student(String firstName, String surname) {
		System.out.println("Student 2");
	}



	public Student(String firstName, String surname, int age) {
		System.out.println("Student 3");
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
