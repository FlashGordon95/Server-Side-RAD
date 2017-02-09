package com.lab4;

import java.util.List;

public class Student {
	
	private String name;
	private List<Module> modules;
	
	
	
	//constructor 
	public Student(String name, List<Module> modules) {
		super();
		this.name = name;
		this.modules = modules;
	}
	
	//getters and setters
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the modules
	 */
	public List<Module> getModules() {
		return modules;
	}



	/**
	 * @param modules the modules to set
	 */
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", modules=" + modules + "]";
	}

}
