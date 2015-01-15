package com.dhill.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dhill.model.Person;

@Service("personsrv")
public class PersonServiceImpl implements PersonService {
	
	private final String URL  = "http://localhost:8080/rest/person";
	
	public Person getPersonbyID(String id) {
		RestTemplate template = new RestTemplate();
		String url = URL + "/{id}";
		Person person = template.getForObject(url, Person.class, id);
		return person;
	}

}
