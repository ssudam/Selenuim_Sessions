package testngSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	// when invocation Count is set , this will run 10 times for the test case
	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("create user");
	}	

}
