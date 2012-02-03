package com.orchestrationexample.employeeinfoservice;

/*
 * Employee transfer object - carries basic data about a customer.
 */
public class Employee
{
	private String id;			// internal identification number of the customer
	private String name;		// e.g. Faculty of Mathematics, Physics and Informatics, Comenius University in Bratislava
	private Address address;	// contact address 
	private String phone;		// contact phone
	private String mail;		// contact mail
	private String type;		// CORP (corporate) or PERS (person)
	private String level;		// STANDARD, BRONZE, SILVER, GOLD, PLATINUM
	private String account;		// e.g. a-0001

	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public void setAddress(String street, String zip, String city, String country)
	{
		address = new Address();
		address.setStreet(street);
		address.setZip(zip);
		address.setCity(city);
		address.setCountry(country);
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getMail()
	{
		return mail;
	}
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String level)
	{
		this.level = level;
	}
	public String getAccount()
	{
		return account;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}

	public String toString()
	{
		return "Employee[id=" + id + ", account=" + account + ", name=" + name + ", address=" + address + "]";
	}
}
