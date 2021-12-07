package testUtilities;

import io.restassured.response.Response;
import testCases.TC_GetRequest;
import testCases.TC_PostRequest;

public class JsonParsing {

	public static String JsonResParsing(Response res, String JsonPath) {

		String JsonParseKey = res.jsonPath().getString(JsonPath).toString();

		return JsonParseKey;

	}

}
