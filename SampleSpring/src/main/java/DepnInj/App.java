package DepnInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("DepnIjn.xml");

        // Get the Employee bean
        Employee employee = (Employee) context.getBean("emp");
        
        // Print the employee details
        System.out.println(employee);
    }
}
