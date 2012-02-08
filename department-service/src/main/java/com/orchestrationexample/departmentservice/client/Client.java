package com.orchestrationexample.departmentservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orchestrationexample.departmentservice.DepartmentService;


public final class Client
{
    public static void main(String args[]) throws Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client-context.xml");

        DepartmentService client = context.getBean("client", DepartmentService.class);


        int dept = 0;
        client.getListFromDeptId(dept);

        System.exit(0);
    }
}
