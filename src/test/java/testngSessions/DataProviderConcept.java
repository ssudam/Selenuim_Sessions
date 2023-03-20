package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	WebDriver driver; // class level variable
	
	// registration page 
	// create test cases
	// add data provider , priortity
	
	public boolean doLogin(String Username, String password) {
		
		driver.findElement(By.id("input-email")).clear();
		
		driver.findElement(By.id("input-email")).sendKeys(Username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		
		String errormesg=driver.findElement(By.cssSelector("alert alert-danger alert-dismissible")).getText();

		if(errormesg.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// to create test data , we use data provider - we supply data to test method
	@DataProvider
	public Object[][] getLoginNegativeData()
	{
		return new Object[][] {
			{"abcccccc@gmail.com", "testttt@123"},
			{"abcccccc1212@gmail.com", "testttt@123"},
			{"abc", "testttt@123"},
			{"testtttt@gmail.com", " "},
			{"testtttt@gmail.com", "testtttt"},
			{"#@#@#@#@gmail.com", "asdasdasd"}, // 6 rows , 2 cols
			

		
		
	};
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] { //[3][5]
			
			{"Heena", "Vaghela", "heena@gmail.com", "9090909098", "heena@123"},
			{"vinutha", "ravindra", "vinu@gmail.com", "9090909099", "vinu@123"},
			{"supriya", "bendukuri", "supriya@gmail.com", "9090909088", "sup@123"},
		};
	}
	
	@Test(dataProvider="getLoginNegativeData",priority=1)
	public void loginTest(String Username, String password) // holding parameters from data P
	{
		System.out.println("Login page");
		boolean flag=doLogin(Username,password);
		Assert.assertTrue(flag);
	}
	
	@Test(dataProvider="getRegTestData",priority=2)
	public void RegisterTest(String fn, String ln, String email, String phone, String password) {
		System.out.println(fn + ln + email + phone + password);

	}
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
