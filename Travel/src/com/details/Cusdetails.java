package com.details;

public class Cusdetails {
	private String name;
	private String mobileNumber;
	private int day;
	private int age;
	private String destination;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Cusdetails [name=" + name + ", mobileNumber=" + mobileNumber + ", day=" + day + ", age=" + age + ",destination=" + destination+"]";
	}
	
	
	
	

	
}
