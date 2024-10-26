package com.autoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
	
	 int id;
	 String nameString;
	 @Autowired
	 @Qualifier ("address1")
	 Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	 
	 @Override
	public String toString() {
	
	return "User [id=" + id + ", name=" + nameString + ", adress=" + address + "]";
		}

}
