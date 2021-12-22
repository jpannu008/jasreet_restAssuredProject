package ReadVariablesFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ReadVariables {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\jpannu\\OneDrive - Amadeus Workplace\\Documents\\Training\\testng\\RestApi-RestAssured\\src\\test\\java\\ReadVariablesFromFile\\JsonVariableFile.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		
		String data = jo.toString();
	      	data = data.replaceAll(Pattern.quote("{{"+"id"+"}}"), "1022");
	      	data = data.replaceAll(Pattern.quote("{{"+"firstName"+"}}"), "Johnny");
	      	data = data.replaceAll(Pattern.quote("{{"+"Designation"+"}}"), "Schilling");
	      
		
		
		
		  Response res = given() 
				  .contentType(ContentType.JSON) 
				  .body(data)
				  .when()
				  .post("http://localhost:3000/friends");
		 
		  System.out.println("the status code is ----->" + res.getStatusCode());
		  System.out.println("The data is :");
		  System.out.println(res.asString());
	}
}
