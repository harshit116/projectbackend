package com.flyaway.utils;



import javax.sql.DataSource;

import com.flyaway.model.CustomerPersonalDetails;

public class CustomerDetails {

	private DataSource datasource;

	public CustomerDetails(DataSource datasource) {

		this.datasource = datasource;
	}

	public CustomerPersonalDetails getPersonalDetails(String name, String age, String aadharNo, String contactNo,String person) {
		
		CustomerPersonalDetails cpd=new CustomerPersonalDetails(name,age,aadharNo,contactNo,person);
		return cpd;
		
	}
	
	
}
