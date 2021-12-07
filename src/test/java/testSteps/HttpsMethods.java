package testSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.PojoBodyData;


public class HttpsMethods {
static Properties Pr;
	
	public  HttpsMethods(Properties Pr) {
		
		this.Pr = Pr;
	}
	
	public Response getRequest(String URI) {
		
		Response res = given().contentType(ContentType.JSON).when().get(Pr.getProperty("URI1"));

		System.out.println("The response for get is ---->"+res.asString());
		return res;
	}
	
	public Response postRequest(PojoBodyData Body , String URI) {
		Response res = given().contentType(ContentType.JSON).body(Body).when().post(URI);
		System.out.println("The reponse for post is ----->"+ res.asString());
		res.asPrettyString();
		return res;
		
		
	}
	
}
