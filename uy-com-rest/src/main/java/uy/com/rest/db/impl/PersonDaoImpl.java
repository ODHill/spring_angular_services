package uy.com.rest.db.impl;

import org.springframework.stereotype.Repository;

import uy.com.rest.db.interfaces.PersonDao;

import com.dhill.model.Person;

@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {


}
