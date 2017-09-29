package com.struts2.ex1;

import java.util.Date;

public class Customer 
{
	private int custId;
	private String custName;
	private Date dob;
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, Date dob) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
	}
	
	
}
