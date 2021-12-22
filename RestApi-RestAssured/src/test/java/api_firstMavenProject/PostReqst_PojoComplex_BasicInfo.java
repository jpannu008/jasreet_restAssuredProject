package api_firstMavenProject;

public class PostReqst_PojoComplex_BasicInfo {

	String firstname;
	String lastname;
	String Designation;
	String Id;
	String MentorName;
	String CourseName;

	PostReq_PojoComplex_Address Address;

	public PostReq_PojoComplex_Address getAddress() {
		return Address;
	}

	public void setAddress(PostReq_PojoComplex_Address address) {
		Address = address;
	}

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
