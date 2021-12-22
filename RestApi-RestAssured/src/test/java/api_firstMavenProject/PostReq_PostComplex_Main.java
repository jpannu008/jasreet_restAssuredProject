package api_firstMavenProject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class PostReq_PostComplex_Main {
	
	public static void main(String[] args) {
	PostReq_PojoComplex_Address address = new PostReq_PojoComplex_Address();
	address.setH_No("3726/10");
	address.setStreet("augusta lane");
	address.setZipcode("ME46DG");
	
	
	PostReqst_PojoComplex_BasicInfo basicInfo = new PostReqst_PojoComplex_BasicInfo();
	basicInfo.setfirstname("");
	basicInfo.setlastname("");
	basicInfo.setCourseName("TESTING");
	basicInfo.setMentorName("test");
	basicInfo.setDesignation("SDET");
	basicInfo.setAddress(address);
	
	
	Response res=
			given()
			.contentType(ContentType.JSON)
			.body(basicInfo)
			.when()
			.post("http://localhost:3000/posts");
	
	System.out.println("The session Id is ----->"+ res.getSessionId());
	System.out.println("The status code is ----->"+ res.getStatusCode());
	System.out.println(res.asString());
}
}
