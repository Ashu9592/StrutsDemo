package com.struts2.ex1;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven
{
  private Customer customer = new Customer();
	@Override
	public Object getModel() 
	{
		 System.out.println("get model called..");
		return customer;
	}

	public String execute()
	{
		System.out.println("execute called..");
		return "success"; 
		
	}
	
}
