package uy.com.rest.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.dhill.model.Person;


public interface PersonService {
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Path("create/{name}/{surname}")
	public void create(@PathParam("name")String name,@PathParam("surname") String surname);
	
	@PUT
	public void update();
	
	@DELETE
	public void remove();
	
	@GET
	public List<Person> find();

}
