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

		System.out.println("Trying to find a employee Jozko Mrkvicka...");
		Employee response = client.getInformation("Jozko","Mrkvicka");
		System.out.println("- response: " + response);

		try
		{
			System.out.println();
			System.out.println("Trying to find a non-existing employee...");
			Employee response2 = client.getInformation("Ferko","Neexistujuci");
			System.out.println("- response: " + response2);
		}
		catch(Exception e)
		{
			System.out.println("- got an exception: " + e);
		}

		System.exit(0);
	}
}
