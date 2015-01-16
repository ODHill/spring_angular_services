package com.dhill.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@Autowired
	@Qualifier(value="personsrv")
	private PersonService personService;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)	
	public Person getPersonById(@PathVariable String id){
		System.out.println("HAsta aca llegue --> id="+ id );
		return personService.getPersonbyID(id);
	}
	
	@RequestMapping("hello")
	 public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "helloworld";
	 }
	


}
