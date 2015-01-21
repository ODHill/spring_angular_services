package rest.client;

import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	//TODO Move to properties
	private final String URL  = "http://localhost:8080/rest/person";
	
	//TODO inject
	private RestTemplate template = new RestTemplate();
	
	public static void get() {
		
		
	}
	
	public static void put() {
		
	}
	
	public static void post() {
	
	}
	
	public static void delete() {
		
	}
}
