package com.sample10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String args[]){
		
	System.out.println("In the com.sample10 main");
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sample10/beans/beans.xml");
	Student s1 = (Student) context.getBean("student");
	System.out.println(s1.toString());
	}
}
