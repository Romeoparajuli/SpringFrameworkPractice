package com.spring.SampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conInjecetion.UserCon;
import com.spring.SampleSpring.model.Question;
import com.spring.SampleSpring.model.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student");
		Student student2 = (Student) context.getBean("student1");
		Student student3 = (Student) context.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		//student1.toString();
//		
//		Question q1 = (Question) context.getBean("q");
//		
//		q1.displayInfo();
//		Question q2= (Question) context.getBean("q1");
//		q2.displayInfo();

		
		UserCon userCon = (UserCon) context.getBean("userBean");

		userCon.show();
		
		
		
		
		
	}
}
