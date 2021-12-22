package api_firstMavenProject;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POJO_PostRequest {
	
	
private 	String firstname;
private     String lastname;
private 	String Designation;
private 	String Id;
private 	String MentorName;
private 	String CourseName;
	
	
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstName) {
		firstname = firstName;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastName) {
		lastname = lastName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMentorName() {
		return MentorName;
	}
	public void setMentorName(String mentorName) {
		MentorName = mentorName;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	
	


}

