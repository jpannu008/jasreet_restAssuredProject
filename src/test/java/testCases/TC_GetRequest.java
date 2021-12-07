package testCases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import testResponseValidation.ResponseValidation;
import testSteps.HttpsMethods;
import testUtilities.JsonParsing;
import testUtilities.PropertiesFileLoad;

public class TC_GetRequest {
	@Test
	public void testcase1() throws IOException {
		
		Properties pr = PropertiesFileLoad.propertiesFileLoad("E:\\"
				+ "jasreet_restAssuredProject\\Environment.Properties");
		
		HttpsMethods http = new HttpsMethods(pr);
		
		Response res = http.getRequest("URI1");
		
		ResponseValidation.ResponseStatusCodeVal(200, res);
	
	
	//	ResponseValidation.ResponseDataValid("Jasreet",content);
		
		
		
	}
	

}
