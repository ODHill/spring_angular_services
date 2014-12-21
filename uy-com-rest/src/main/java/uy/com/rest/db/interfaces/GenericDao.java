package uy.com.rest.db.interfaces;


public interface GenericDao<T> {
	
	T find(Object obj);
		
	void create(T obj);

}
