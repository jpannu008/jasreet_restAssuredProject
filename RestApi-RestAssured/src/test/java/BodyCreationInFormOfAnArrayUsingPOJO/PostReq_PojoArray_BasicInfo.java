package BodyCreationInFormOfAnArrayUsingPOJO;

public class PostReq_PojoArray_BasicInfo {
	
	
	String FirstName;
	String LastName;
	String Designation;
	String Id;
	String MentorName;
	String CourseName;
	
	PostReq_PojoComplex_Address[] Address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
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

	public PostReq_PojoComplex_Address[] getAddress() {
		return Address;
	}

	public void setAddress(PostReq_PojoComplex_Address[] address) {
		Address = address;
	}
	
	

}
