package com.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		
	public static void main(String[] args) {
		/*
		 * ApplicationContext context allows us to specify the location of our beans XML file and perform operations
		 * 
		 * using .getBean we can acquire the person object from the XML
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab2/beans/beans.xml");
		Person person = (Person) context.getBean("personBean");
		System.out.println(person.toString());
	}
}
