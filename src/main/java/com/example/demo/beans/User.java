package com.example.demo.beans;

import java.io.Serializable;

/**
 * 
 * @author HP
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String mobileNo;
	
	public User(){
		
	}	
	
	public User(String firstName, String middleName, String lastName, Address address, String mobileNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
