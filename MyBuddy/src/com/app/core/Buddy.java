package com.app.core;

import java.time.LocalDate;

public class Buddy {

	private String emailID;
	private String name;
	private String phoneNo;
	private LocalDate dob;
	private String city;

	public Buddy(String emailID, String name, String phoneNo, LocalDate dob, String city) {
		super();
		this.emailID = emailID;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.city = city;
	}

	@Override
	public String toString() {
		return " EmailID --->> " + emailID + " Name --->> " + name + " PhoneNo --->> " + phoneNo + " DOB --->> " + dob + " City --->>" + city;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
