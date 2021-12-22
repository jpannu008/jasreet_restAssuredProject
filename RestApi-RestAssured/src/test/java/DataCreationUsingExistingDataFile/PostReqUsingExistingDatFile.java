package DataCreationUsingExistingDataFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.response.Response;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class PostReqUsingExistingDatFile {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("C:\\Users\\jpannu\\OneDrive - Amadeus Workplace\\Documents\\Training\\testng\\RestApi-RestAssured\\src\\test\\java\\DataCreationUsingExistingDataFilebody.json");
		FileReader fr = new FileReader(f);
		JSONTokener ft = new JSONTokener(fr);
		JSONObject jo = new JSONObject(ft);

		Response res = given().contentType(ContentType.JSON).body(jo.toString()).when()
				.post("http://localhost:3000/friends");

		System.out.println("The response status is -----> " + res.getStatusCode());
		System.out.println("The dats is :");
		System.out.println(res.asString());
	}
}
 