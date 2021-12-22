package api_firstMavenProject;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {
		
		POJO_PostRequest Data = new POJO_PostRequest();
		Data.setfirstname("Jackson");
		Data.setlastname("schilling");
		Data.setMentorName("tim");
		Data.setDesignation("SDET");
		Data.setCourseName("Testing");
		Data.setId("369_8");
	
		
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(Data)
				.when()
				.post("http://localhost:3000/friends");
			System.out.println("The session Id is ----->"+ res.getSessionId());
			System.out.println("The status code is ----->"+ res.getStatusCode());
			System.out.println(res.asString());
	}
}
