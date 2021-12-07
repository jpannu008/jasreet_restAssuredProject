package testTrigger;

import java.io.IOException;

import testCases.TC_GetRequest;
import testCases.TC_PostRequest;

public class TriggerTest {

	public static void main(String[] args) throws IOException {
		TC_GetRequest tc1 = new TC_GetRequest();
		tc1.testcase1();
		
		TC_PostRequest tc2 = new TC_PostRequest();
		tc2.testcase2();
	}
}
