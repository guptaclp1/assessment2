package com.example.demo.beans;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address1;
	private String address2;
	private String state;
	private String district;
	private int zip;
	private String OfficialPhoneNo;
	private String residencePhoneNo;

	public Address() {

	}

	public Address(String address1, String address2, String state, String district, int zip, String officialPhoneNo,
			String residencePhoneNo) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.district = district;
		this.zip = zip;
		OfficialPhoneNo = officialPhoneNo;
		this.residencePhoneNo = residencePhoneNo;

	}

	public String getOfficialPhoneNo() {
		return OfficialPhoneNo;
	}

	public void setOfficialPhoneNo(String officialPhoneNo) {
		OfficialPhoneNo = officialPhoneNo;
	}

	public String getResidencePhoneNo() {
		return residencePhoneNo;
	}

	public void setResidencePhoneNo(String residencePhoneNo) {
		this.residencePhoneNo = residencePhoneNo;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
