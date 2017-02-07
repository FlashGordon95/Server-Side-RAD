package com.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.*;

public class App {
	
	
	public static void main(String[] args){
		/*
		 * ApplicationContext context allows us to specify the location of our beans XML file and perform operations
		 * 
		 * using .getBean we can acquire the person object from the XML
		 * We will acquire the addressBean first as the person bean encapsulates an addressBean.
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab3/beans/beans.xml");
		Address address = (Address) context.getBean("addressBean");
		Person person = (Person) context.getBean("personBean");
		System.out.println(person.toString());
	}
}
