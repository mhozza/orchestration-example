package com.orchestrationexample.employeeinfoservice.impl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.orchestrationexample.employeeinfoservice.Employee;
import com.orchestrationexample.employeeinfoservice.EmployeeInfoService;
import com.orchestrationexample.employeeinfoservice.NoSuchEmployeeException;

@WebService(endpointInterface = "com.orchestrationexample.employeeinfoservice.EmployeeInfoService")
public class CustomerServiceImpl implements EmployeeInfoService
{
	private Map<Integer,Employee> customers;
	
	public CustomerServiceImpl()
	{
		customers = new HashMap<Integer,Employee>();

		Employee c = new Employee();
		c.setId(1);
		c.setName("Jozko");
		c.setSurname("Mrkvicka");
		c.setIdDep(1);
		
		customers.put(c.getId(), c);
	}
	
	@Override
	public Employee getInformation(int id) throws NoSuchEmployeeException
	{
		System.out.println("getInformation called for a customer with id = " + id);
		Employee c = customers.get(id);
		
		if (c == null)
			throw new NoSuchEmployeeException(id);
		else
			return c;
	}
}

