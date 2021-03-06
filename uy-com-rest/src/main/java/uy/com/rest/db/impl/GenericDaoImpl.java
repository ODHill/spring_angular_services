package uy.com.rest.db.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import uy.com.rest.db.interfaces.GenericDao;


public abstract class GenericDaoImpl<T> implements GenericDao<T>{
	
	@PersistenceContext
	protected EntityManager em;
	
	Class<T> clazz;
	
	public GenericDaoImpl() {
		clazz = getType(getClass());
	}

	@SuppressWarnings("unchecked")
	private Class<T> getType(Class<?> clase) {
		Type tipo = clase.getGenericSuperclass();
		if(tipo instanceof ParameterizedType)
			return (Class<T>) ((ParameterizedType)tipo).getActualTypeArguments()[0];
		else
			return getType(clase.getSuperclass());
	}
	
	@Transactional
	public T find(Object obj){
		return (T) em.find(clazz, obj);
	}
	
	
	@Transactional
	public void create(T obj) {
		em.persist(obj);
	}

}
