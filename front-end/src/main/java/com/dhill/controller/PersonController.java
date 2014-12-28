package com.dhill.controller;

import java.io.Serializable;

import org.springframework.web.client.RestTemplate;

import com.dhill.model.Person;

public class PersonController implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -25595180939938054L;	
	
	private final String URL  = "http://localhost:8080/rest/person";
	
	public Person getPersonbyID(String id) {
		RestTemplate template = new RestTemplate();
		String url = URL + "/{id}";
		Person person = template.getForObject(url, Person.class, id);
		return person;
	}

}
