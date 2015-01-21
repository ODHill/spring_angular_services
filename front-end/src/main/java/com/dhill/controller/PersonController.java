package com.dhill.controller;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhill.model.Person;
import com.dhill.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -25595180939938054L;	
	
	private static final Logger logger = Logger.getLogger(PersonController.class.getName());
	
	@Autowired
	@Qualifier(value="personsrv")
	private PersonService personService;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)	
	public Person getPersonById(@PathVariable String id){
		logger.log(Level.INFO, "Id Value --> "+ id );
		return personService.getPersonbyID(id);
	}		
	
	@RequestMapping(value="/",method = RequestMethod.GET)	
	public List<Person> getAllPersons(){
		logger.log(Level.INFO,"Getting all persons");
		return personService.getAllPersons();
	}
	
	@RequestMapping(value="/",method = RequestMethod.POST)	
	public void createPerson(@RequestBody String data) {
		logger.log(Level.INFO,"Saving person :" + data);
		personService.createPerson(data);
	}
	
	public void updatePerson() {
		
	}
	
}
