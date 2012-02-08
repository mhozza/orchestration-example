package com.orchestrationexample.employeelistservice;

import javax.jws.WebService;

@WebService
public interface EmployeeListService
{
	Employee getInformation(int id) throws NoSuchEmployeeException;
}
