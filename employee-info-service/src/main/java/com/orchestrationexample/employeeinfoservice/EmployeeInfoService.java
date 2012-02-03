package com.orchestrationexample.employeeinfoservice;

import javax.jws.WebService;

@WebService
public interface EmployeeInfoService
{
	Employee getInformation(String id) throws NoSuchEmployeeException;
}
