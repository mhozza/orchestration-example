package com.orchestrationexample.departmentservice;


import javax.jws.WebService;

@WebService
public interface DepartmentService
{
	int[] getListFromDeptId(int deptId);
}
