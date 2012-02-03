package com.orchestrationexample.employeeinfoservice;

public class NoSuchEmployeeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	public NoSuchEmployeeException(String id)
	{
		super("Cannot find a customer with id = " + id);
		this.id = id;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
		
}
