package com.anotaions;

import org.springframework.stereotype.Component;


public class User {
	 int id;
	 String nameString;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	 @Override
		public String toString() {
		
		return "User [id=" + id + ", name=" + nameString + "]";
			}
	 

}
