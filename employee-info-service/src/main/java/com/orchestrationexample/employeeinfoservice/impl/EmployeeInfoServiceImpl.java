package com.orchestrationexample.employeeinfoservice.impl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.orchestrationexample.employeeinfoservice.Employee;
import com.orchestrationexample.employeeinfoservice.EmployeeInfoService;
import com.orchestrationexample.employeeinfoservice.NoSuchEmployeeException;
import com.orchestrationexample.employeeinfoservice.Pair;

@WebService(endpointInterface = "com.orchestrationexample.employeeinfoservice.EmployeeInfoService")
public class EmployeeInfoServiceImpl implements EmployeeInfoService
{
	private Map<Pair<String,String>,Employee> customers;
	
	public EmployeeInfoServiceImpl()
	{
		customers = new HashMap<Pair<String,String>,Employee>();

		Employee c = new Employee();
		c.setId(1);
		c.setName("Jozko");
		c.setSurname("Mrkvicka");
		c.setIdDep(1);
		
		customers.put(new Pair<String, String>(c.getName(), c.getSurname()), c);
	}
	
	@Override
	public Employee getInformation(String name, String surname) throws NoSuchEmployeeException
	{
		System.out.println("getInformation called for a employee:" + name + " " + surname);
		Employee c = customers.get(new Pair<String, String>(name, surname));
		
		if (c == null)
			throw new NoSuchEmployeeException(name,surname);
		else
			return c;
	}
}

