package com.struts.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.demo.dao.RegisterDao;

public class RegistrationAction extends ActionSupport {

	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String gender;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String execute() {
		  
		 int i = RegisterDao.save(this);
		 System.out.println("########################################################################");
		 System.out.println(i);
		 System.out.println("########################################################################");
		 if(i>0) { 
			 return "success";
		 }
		 else {
			 return "error";
		 }
	}
}
