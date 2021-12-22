package BodyCreationInFormOfAnArrayUsingPOJO;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.given;


public class PostReq_PojoArray_Main {
	
	public static void main(String[] args) {

	PostReq_PojoComplex_Address[] Address = new PostReq_PojoComplex_Address [2] ;

	Address[0]=new PostReq_PojoComplex_Address();
	Address[1]=new PostReq_PojoComplex_Address();
	
	Address[0].setH_No("2314/56");
	Address[0].setStreet("1MG");
	Address[0].setZipCode("560056");
	
	Address[1].setH_No("2318/56");
	Address[1].setStreet("21MG");
	Address[1].setZipCode("560066");
	
	
	PostReq_PojoArray_BasicInfo basicInfo = new PostReq_PojoArray_BasicInfo();
	basicInfo.setFirstName("John");
	basicInfo.setLastName("May");
	basicInfo.setCourseName("developer");
	basicInfo.setMentorName("Pinto");
	basicInfo.setDesignation("trainer");
	basicInfo.setAddress(Address);
	basicInfo.setId("001");
	
	Response res = 
			given()
			.contentType(ContentType.JSON)
			.body(basicInfo)
			.when()
			.get("http://localhost:3000/friends");
	
	System.out.println("The status code for post request is -----> " + res.getStatusCode());
	System.out.println("Data Posted is :");
	System.out.println(res.asString());//stores data
	
	
	

}

}