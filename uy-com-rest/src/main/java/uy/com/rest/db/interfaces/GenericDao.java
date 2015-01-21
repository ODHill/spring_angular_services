package uy.com.rest.db.interfaces;

import java.util.List;


public interface GenericDao<T> {
	
	T find(Object obj);
		
	void create(T obj);
	
	List<T> getAll();

}
