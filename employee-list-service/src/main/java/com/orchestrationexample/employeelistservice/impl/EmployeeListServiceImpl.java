package com.orchestrationexample.employeelistservice.impl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.orchestrationexample.employeelistservice.Employee;
import com.orchestrationexample.employeelistservice.EmployeeListService;
import com.orchestrationexample.employeelistservice.NoSuchEmployeeException;

@WebService(endpointInterface = "com.orchestrationexample.employeelistservice.EmployeeListService")
public class EmployeeListServiceImpl implements EmployeeListService
{
	private Map<Integer,Employee> customers;
	
	public EmployeeListServiceImpl()
	{
		customers = new HashMap<Integer,Employee>();

		Employee c = new Employee();
		c.setId(1);
		c.setName("Jozko");
		c.setSurname("Mrkvicka");
		c.setIdDep(0);
		
		customers.put(c.getId(), c);
		
		c = new Employee();
		c.setId(2);
		c.setName("Ferko");
		c.setSurname("Mrkvicka");
		c.setIdDep(0);
		
		customers.put(c.getId(), c);
		
		c = new Employee();
		c.setId(3);
		c.setName("Gertruda");
		c.setSurname("Mrkvickova");
		c.setIdDep(0);
		
		customers.put(c.getId(), c);
	}
	
	@Override
	public Employee getInformation(int id) throws NoSuchEmployeeException
	{
		System.out.println("getInformation called for a employee with id:" + id);
		Employee c = customers.get(id);
		
		if (c == null)
			throw new NoSuchEmployeeException(id);
		else
			return c;
	}
}

