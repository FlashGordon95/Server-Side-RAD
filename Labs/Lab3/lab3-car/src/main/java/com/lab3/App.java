package com.lab3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	public static void main(String args[]){
		
		/*
		 * ApplicationContext context allows us to specify the location of our beans XML file and perform operations
		 * 
		 * using .getBean we can acquire the person object from the XML
		 * We will acquire the addressBean first as the person bean encapsulates an addressBean.
		 * 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab3/beans/beans.xml");
		Engine engine12 = (Engine) context.getBean("engineBean1.2");
		Engine engine16 = (Engine) context.getBean("engineBean1.6");
		Car car1 = (Car) context.getBean("carBean1");
		Car car2 = (Car) context.getBean("carBean2");
		Car car3 = (Car) context.getBean("carBean3");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		
	}

}
