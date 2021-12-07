package testCases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.PojoBodyData;
import pojo.PojoSimpleBody;
import testResponseValidation.ResponseValidation;
import testSteps.HttpsMethods;
import testUtilities.JsonParsing;
import testUtilities.PropertiesFileLoad;

public class TC_PostRequest {
@Test
	public  static void testcase2() throws IOException  {
	Properties pr = PropertiesFileLoad.propertiesFileLoad("E:\\"
			+ "jasreet_restAssuredProject\\Environment.Properties");
	
	HttpsMethods http = new HttpsMethods(pr);
	PojoBodyData Body = PojoSimpleBody.getBodtData();
	
	
	Response res = http.postRequest(Body,pr.getProperty("URI2"));
   ResponseValidation.ResponseStatusCodeVal(201, res);
   
   
   String ParseData= JsonParsing
	.JsonResParsing(res, "name");
   
   System.out.println("the value of the json key fetched is ---->"+ ParseData);
   System.out.println(res.asString());
   
   ResponseValidation.ResponseDataValid("Jasreet", ParseData);
   


}
}
