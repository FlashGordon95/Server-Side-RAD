package com.lab4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args){
		/*
		 * ApplicationContext context allows us to specify the location of our beans XML file and perform operations
		 * 
		 * using .getBean we can acquire the person object from the XML
		 * We will acquire the addressBean first as the person bean encapsulates an addressBean.
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab4/beans/beans.xml");
		Student s1 = (Student) context.getBean("ryan");
		Student s2 = (Student) context.getBean("gerry");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
