package com.sample1;

public class Student {
	
	private String name;
	private int age;
	public Student() {
		this.name = "none";
		this.age = 0;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
