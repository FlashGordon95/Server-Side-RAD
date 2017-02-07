package com.lab2;

public class Person {
	
	private String firstName;
	private String lastName;
	
	//Person has a firstName + lastName /w getter & setters
	
	public Person() {
		this.firstName = "No first Name";
		this.lastName = "No Surname";
	}
	
	

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/*
	 * Getters and setters
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

