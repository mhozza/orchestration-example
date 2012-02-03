package com.orchestrationexample.employeeinfoservice;

public class Address
{
	private String street, zip, city, country;

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getZip()
	{
		return zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String toString()
	{
		return "Address:[street=" + street + ", zip=" + zip + ", city=" + city + ", country=" + country + "]";
	}
}
