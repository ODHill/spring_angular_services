package uy.com.rest.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dhill.model.Person;


public interface PersonService {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public void create(String data);
	
	@PUT
	public void update();
	
	@DELETE
	public void remove();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public String getAll();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public String findByID(@PathParam("id") String id);

}
