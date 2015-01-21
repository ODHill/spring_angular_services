package com.dhill.service;

import java.util.Collections;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	public List<Person> getAllPersons() {
		RestTemplate template = new RestTemplate();		
		ResponseEntity<List<Person>> responseEntity = 
				template.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Person>>() {}, Collections.emptyMap());		
	
		List<Person> persons = responseEntity.getBody();
		return persons;
	}

	@Override
	public void createPerson(String data) {
		// TODO Auto-generated method stub
		RestTemplate template = new RestTemplate();		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(data,headers);
		template.postForLocation(URL, entity);
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub
		
	}

}
