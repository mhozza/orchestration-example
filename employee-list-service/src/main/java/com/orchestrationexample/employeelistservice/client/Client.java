package com.orchestrationexample.employeelistservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orchestrationexample.employeelistservice.Employee;
import com.orchestrationexample.employeelistservice.EmployeeListService;



public final class Client
{
	public static void main(String args[]) throws Exception
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client-context.xml");

		EmployeeListService client = context.getBean("client", EmployeeListService.class);

		System.out.println("Trying to find a employee with id 1...");
		Employee response = client.getInformation(1);
		System.out.println("- response: " + response);

		try
		{
			System.out.println();
			System.out.println("Trying to find a non-existing employee...");
			Employee response2 = client.getInformation(47);
			System.out.println("- response: " + response2);
		}
		catch(Exception e)
		{
			System.out.println("- got an exception: " + e);
		}

		System.exit(0);
	}
}
