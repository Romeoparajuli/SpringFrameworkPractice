package com.anotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("anotationconfig.xml");
		User user = context.getBean("user", User.class);
		Address address = (Address) context.getBean("address");
		

		System.out.println(user);
		System.out.println(address);

	}

}
