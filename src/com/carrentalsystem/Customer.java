package com.carrentalsystem;

public class Customer 
{
	private String customerId;
	private String name;
	
	public Customer(String customerId,String name)
	{
		this.name=name;
		this.customerId=customerId; 
	}
	
	public String getCustomerId()
	{
		return customerId;
	}

	public String getName()
	{
		return name;
		
	}
	
	
}
