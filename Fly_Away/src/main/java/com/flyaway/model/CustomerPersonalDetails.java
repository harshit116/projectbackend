package com.flyaway.model;

public class CustomerPersonalDetails {
	private String name;
	private String age;
	private String aadharNo;
	private String contactNo;
	private String person;

	public CustomerPersonalDetails(String name, String age, String aadharNo, String contactNo, String person) {

		this.name = name;
		this.age = age;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

}
