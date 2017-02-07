package com.lab2;

public class Main {
		
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.toString());
		
		Person person2 = new Person("John", "Smith");
		System.out.println(person2.toString());
	}

}
