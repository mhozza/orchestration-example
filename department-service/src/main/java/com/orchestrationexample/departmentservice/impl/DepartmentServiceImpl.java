package com.orchestrationexample.departmentservice.impl;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import com.orchestrationexample.departmentservice.DepartmentService;



@WebService(endpointInterface = "com.orchestrationexample.departmentservice.DepartmentService")
public class DepartmentServiceImpl implements DepartmentService
{
	private int[][] departments;

	public DepartmentServiceImpl () {
		departments = new int[1][3];
		departments[0][0] = 1;
		departments[0][1] = 2;
		departments[0][2] = 3;
	}
	
	
	@Override
	public int[] getListFromDeptId(int deptId) {
		
		System.out.println("getListFromDeptId called for a department:" + deptId);
		int empNum = departments[deptId].length;
		int[] result = new int[empNum];
		for (int i = 0; i<empNum; i++) {
			result[i] = departments[deptId][i];
		}
	
		return result;
	}

}

