package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
//	this is BS .. db connections
//	this is BT .. Create User
//	this is BC .. launch browser
	
//	this is BM .. LoginToApp
//	homePageSearchTest
//	this is AM .. logout
	
//	this is BM .. LoginToApp
//	homePageTitleTest
//	this is AM .. logout
	
//	this is BM .. LoginToApp
//	homePageURLTest
//	this is AM .. logout
	
//	this is AC .. close browser
//	this is AT .. deleteUser

	// annonations -- Before means pre conditions
	
	// 1,2,3 - executes only once 
	
	//1
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("this is BS .. db connections");
	}
	
	//2
	@BeforeTest
	public void CreateUser() {
		System.out.println("this is BT .. Create User");
	}
	
	//3
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("this is BC .. launch browser");
	}
	
	//4 , 7, 10-will be executing before each and every test method
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("this is BM .. LoginToApp");
	}
	
	//8
	@Test     // these are test methods
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	//11
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}

	//5
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	
	
	
	// post conditions : after 
	
	//6,9,12 - after each and every test method
	@AfterMethod
	public void LogOut() {
		System.out.println("this is AM .. logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("this is AC .. close browser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("this is AT .. deleteUser");
	}
	
	//15
	@AfterSuite
	public void disconnectDB() {
		System.out.println("this is AS .. disconnectDB");
	}
	
	
	
	
	
	
}
