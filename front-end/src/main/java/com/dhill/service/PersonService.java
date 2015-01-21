package com.dhill.service;

import java.util.List;

import com.dhill.model.Person;

public interface PersonService {
	
	Person getPersonbyID(String id);
	
	List<Person> getAllPersons();
	
	void createPerson(String data);
	
	void updatePerson();

}
