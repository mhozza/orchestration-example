package com.orchestrationexample.employeeinfoservice;

public class NoSuchEmployeeException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	private String name, surname;
	
	public NoSuchEmployeeException(String name, String surname)
	{
		super("Cannot find a employee: " + name + " " + surname);
		this.name = name;
		this.surname = surname;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}
		
}
