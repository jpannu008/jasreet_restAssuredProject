package BodyCreationUsingJsonLibrary;

import org.json.JSONObject;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class ostReq_OrgJson_Simple {

	
	public static void main(String[] args) {
		
		JSONObject basicInfo = new JSONObject();
		basicInfo.put("FirstName","JuneL");
		basicInfo.put("LastName", "JulyLL");
		basicInfo.put("Age", "22");
		basicInfo.put("id", "1003");
		
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(basicInfo.toString())
				.when()
				.post("http://localhost:3000/friends");
		
		
		System.out.println("The response is ------> " + res.getStatusCode());
		System.out.println("The Data posted is : ");
        System.out.println(res.asString());//stores data				
	}
}
