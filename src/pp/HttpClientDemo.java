package pp;


import java.io.IOException;
import java.net.URI;
import  java.net.http.*;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	var client =  HttpClient.newBuilder().build();
	
	var request = HttpRequest.newBuilder()
		         .uri(URI.create("https://reqres.in/api/users?page=2"))
		         .build();
	
	var response = client.send(request, BodyHandlers.ofString()); 
	
	System.out.println(response.statusCode());
	
	System.out.println(response.body());
	
	

	}

}
