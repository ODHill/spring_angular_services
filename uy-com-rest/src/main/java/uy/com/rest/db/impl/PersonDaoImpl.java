package uy.com.rest.db.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import uy.com.rest.db.interfaces.PersonDao;

import com.dhill.model.Person;

@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		return em.createNamedQuery(Person.GET_ALL_PERSON).getResultList();
	}

}
