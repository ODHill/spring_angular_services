package uy.com.rest.impl;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.com.rest.db.interfaces.PersonDao;
import uy.com.rest.interfaces.PersonService;

import com.dhill.model.Person;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

@Service
@Path("person")
public class PersonServiceImpl implements PersonService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5913379775549739661L;
	
	@Autowired
	private PersonDao personDao;

	//TODO return message to client
	public void create(String data) {
		ObjectMapper mapper = new ObjectMapper();
		Person person = null;
		try {
			person = mapper.readValue(data, Person.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		personDao.create(person);		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}


	public List<Person> find() {
		// TODO Auto-generated method stub
		return new ArrayList<Person>();
	}

	public String getAll() {
		ObjectMapper mapper = new ObjectMapper();
		try {			
			return mapper.writerWithType(TypeFactory.defaultInstance().constructCollectionType(List.class, Person.class))
					.writeValueAsString(personDao.getAll());
		} catch (Exception e) {
			
		}
		return null;
	}

	public String findByID(String id) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(personDao.find(Long.parseLong(id)));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}	
		
		return "Not Found";
		 		
	}

}
