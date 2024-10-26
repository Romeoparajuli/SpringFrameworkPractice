package com.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowareConfig.xml");
		User user =(User) context.getBean("userauto");
		System.out.println(user);
	}
	

}
