package com.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String args[]){
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sample2/beans/beans.xml");
	Student s1 = (Student) context.getBean("student");
	System.out.println(s1.toString());
	}
}
