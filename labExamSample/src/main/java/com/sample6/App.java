package com.sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String args[]){
		
	System.out.println("In the com.sample6 main");
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sample6/beans/beans.xml");
	Student s1 = (Student) context.getBean("student");
	System.out.println(s1.toString());
	}
}
