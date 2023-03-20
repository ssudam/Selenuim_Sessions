package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionClassConcept {

	
	// if you give null pointer exception it will fail as its arithemtic 
	
	
	// can explain while giving demo if you know there are some regression cases that are failing
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
}
