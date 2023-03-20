package SelenuimSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConcept {

	public static void main(String[] args) {
		// open browser
		
//		ChromeDriver driver=new ChromeDriver();
//		
//		
//	driver.get("https://facebook.com");
//		
//	String actTitle=	driver.getTitle();
//	
//	System.out.println("the actual title is" +actTitle);
//	
//	driver.quit();
	
	
	// do top casting with switch case and assertions tom
	
	// dynamic arrays , hash map recordings
	
	// how to code when I need another browser like firefox 
	
	// use top casting
		
		// webdriver is interface and its grand parent of child class
		
		WebDriver driver=null; // local variable to be used you have to initailize
	
	//WebDriver driver =new FirefoxDriver();  // new object of child class
	
	//String browser="chrome";
	String browser="chrome";
	
	switch (browser) {
	case "chrome":
		driver =new ChromeDriver();
		
		break;
	case "firefox":
		driver =new FirefoxDriver();
		
		break;
	case "edge":
		driver =new EdgeDriver();
		
		break;
	default:
		System.out.println("invalid browser");
		break;
	}
	
	driver.get("https://facebook.com");
	
	String actTitle=driver.getTitle();
	
	System.out.println("the actual title is" +actTitle);
	
	driver.quit();
	
	
	}

}
