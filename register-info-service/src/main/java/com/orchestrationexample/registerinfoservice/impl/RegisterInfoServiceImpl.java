package com.orchestrationexample.registerinfoservice.impl;

import java.util.HashSet;
import java.util.Set;


import com.orchestrationexample.registerinfoservice.impl.Pair;
import com.orchestrationexample.registerinfoservice.RegisterInfoService;

public class RegisterInfoServiceImpl implements RegisterInfoService
{
	
	private Set<Pair<String,String>> registeredPersons;
	
	public RegisterInfoServiceImpl()
	{
		registeredPersons = new HashSet<Pair<String,String>>();
		registeredPersons.add(new Pair<String, String>("Jozko","Mrkvicka"));

	}

    @Override
    public boolean checkPerson(String name, String surname) {
        return registeredPersons.contains(new Pair<String, String>(name,surname));
    }

}
