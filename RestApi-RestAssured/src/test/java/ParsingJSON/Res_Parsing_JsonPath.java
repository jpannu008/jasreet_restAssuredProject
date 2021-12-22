package ParsingJSON;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static com.jayway.restassured.RestAssured.*;
public class Res_Parsing_JsonPath {

	public static void main(String[] args) {
		
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/friends");
		
		System.out.println(res.asString());
		
		String firstname =res.jsonPath().getString("address[0].street");
		System.out.println(firstname);
	}
}
