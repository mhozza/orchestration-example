/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.orchestrationexample.registerinfoservice.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orchestrationexample.registerinfoservice.RegisterInfoService;

public final class Client {

    public static void main(String args[]) throws Exception 
    {
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext("client-context.xml");
        RegisterInfoService register = (RegisterInfoService)context.getBean("registerInfoService");
        
        System.out.println("Test (user exists) Aaa sss: result = " + register.checkPerson("ass","sss"));
        System.out.println("Test (user exists) Jozko Mrkvicka: result = " + register.checkPerson("Jozko","Mrkvicka"));

        System.exit(0);
    }
}
