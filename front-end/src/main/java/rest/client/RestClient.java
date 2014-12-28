package rest.client;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.dhill.model.Person;


public class RestClient {
	private static final String BASE_URL = "http://localhost:8080/rest/person";
	
	@Test
	public void addPerson() {		
			RestTemplate template = new RestTemplate();
			String url = BASE_URL + "/{id}";			
			Person person = template.getForObject(url, Person.class, "3");
			System.out.println(person.toString());
	}

}
