package testngSessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
		//int i = 9/0;
	} 

	@Test(dependsOnMethods = "searchTest")// this test case will be skipped
	public void addToCart() {
		System.out.println("addToCart");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "addToCart")// this will skip
	public void makePayment() {
		System.out.println("makePayment");

	}

}
