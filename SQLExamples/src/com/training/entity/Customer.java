package com.training.entity;

public class Customer {
	
	private int custId;
	private String CustName;
	private int mobile;
	private String email;
	private String dob;
	private String place;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int custId, String custName, int mobile, String email, String dob, String place) {
		super();
		this.custId = custId;
		CustName = custName;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.place = place;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return CustName;
	}


	public void setCustName(String custName) {
		CustName = custName;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", CustName=" + CustName + ", mobile=" + mobile + ", email=" + email
				+ ", dob=" + dob + ", place=" + place + "]";
	}

	
}
