package api_firstMavenProject;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetRequest {

	
	public static void main (String[] args) {
		Response res= 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/friends");
		System.out.println("Status code"+ res.getContentType());
		
		System.out.println("Status code"+ res.getStatusCode());
		System.out.println("Data is");
		System.out.println(res.asString());
		
	}
}
