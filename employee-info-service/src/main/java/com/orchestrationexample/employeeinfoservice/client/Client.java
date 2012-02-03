package com.orchestrationexample.employeeinfoservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orchestrationexample.employeeinfoservice.Employee;
import com.orchestrationexample.employeeinfoservice.EmployeeInfoService;



public final class Client
{
	public static void main(String args[]) throws Exception
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client-context.xml");

		EmployeeInfoService client = context.getBean("client", EmployeeInfoService.class);

		System.out.println("Trying to find a customer with an id of 1...");
		Employee response = client.getInformation(1);
		System.out.println("- response: " + response);

		try
		{
			System.out.println();
			System.out.println("Trying to find a customer with a (non-existing) id of 9999...");
			Employee response2 = client.getInformation(9999);
			System.out.println("- response: " + response2);
		}
		catch(Exception e)
		{
			System.out.println("- got an exception: " + e);
		}

		System.exit(0);
	}
}
