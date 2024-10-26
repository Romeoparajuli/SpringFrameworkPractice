package com.anotaions;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("1212")
	int pincode;
	@Value("tilotama")
	String cityString;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityString=" + cityString + "]";
	}
	
	

}
