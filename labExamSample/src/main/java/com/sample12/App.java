package com.sample12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String args[]){
		
	System.out.println("In the com.sample12 main");
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sample12/beans/beans.xml");
	Student s1 = (Student) context.getBean("student");
	}
}
