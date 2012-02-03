package com.orchestrationexample.employeeinfoservice;

public class NoSuchEmployeeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	public NoSuchEmployeeException(int id)
	{
		super("Cannot find a customer with id = " + id);
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
		
}
