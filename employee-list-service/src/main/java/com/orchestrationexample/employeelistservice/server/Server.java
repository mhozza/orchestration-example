package com.orchestrationexample.employeelistservice.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server
{
	public static void main(String args[]) throws Exception
	{
		new ClassPathXmlApplicationContext("server-context.xml");
		System.in.read();
	}
}
