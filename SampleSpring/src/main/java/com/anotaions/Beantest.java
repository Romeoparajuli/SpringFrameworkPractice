package com.anotaions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Beantest {
	@Bean (name="user")
	public User getUser() {
		User user = new User();
		user.setId(1222);
		user.setNameString("Suman Fucker !!!!");
		
		
		return user;
		}
	 @Bean(name = "address")
	 public Address getAddress() {
		 Address address = new Address();
		 return address;
		 
	 }
	

}
