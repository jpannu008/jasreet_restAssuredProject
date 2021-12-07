package testResponseValidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidation {

	public static void ResponseStatusCodeVal(int ExpectedStatusCode, Response res) {
		Assert.assertEquals(res.getStatusCode(), ExpectedStatusCode);

	}

	public static void ResponseDataValid(String ExpData, String ActualData) {
		Assert.assertEquals(ExpData, ActualData);
		
		//Assert.assertEquals(actual, expected, message);

	}
}
