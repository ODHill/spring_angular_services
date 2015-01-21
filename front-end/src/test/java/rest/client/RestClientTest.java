package rest.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.dhill.model.Person;


public class RestClientTest {
	private static final String BASE_URL = "http://localhost:8080/rest/person";
	
//	@Test
//	public void addPerson() {		
//			RestTemplate template = new RestTemplate();
//			String url = BASE_URL + "/{id}";			
//			Person person = template.getForObject(url, Person.class, "3");
//			System.out.println(person.toString());
//	}
//	
//	@Test
//	public void getAll() throws URISyntaxException {
//		RestTemplate template = new RestTemplate();
//		String url = BASE_URL; 			
//		ResponseEntity<List<Person>> responseEntity = 
//				template.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Person>>() {}, Collections.emptyMap());		
//	
//		List<Person> persons=  responseEntity.getBody();		
//		for (Person person : persons) {
//			System.out.println(person.toString());
//		}
//	}

}
