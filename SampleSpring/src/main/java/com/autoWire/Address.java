package com.autoWire;



public class Address {
	
	 int pincode ;
	 String city;
	 String roadString;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRoadString() {
		return roadString;
	}
	public void setRoadString(String roadString) {
		this.roadString = roadString;
	}
	 @Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", roadString=" + roadString +"]";

 
	}
	 

}
