package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	// can we use intialize null here at class variables = no need 
	static WebDriver driver; // if this variable is static then can access directly by any method in this class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// web elements : anything on webpage or browser
		
		// create webelement + perform action ( click , send keys , get text...)
		
		// create a webelement : need a locator
		
		// for the class variables no need to add null to the webdriver driver =null
		
		 driver=new ChromeDriver();
		
		// By is a class
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        // 1st - raw format 
		
		driver.findElement(By.id("input-email")).sendKeys("sudam.sanjana@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("sudcom");

        
        // 2nd : only once we can use webelement and provide diff values
        // when we have 10 values /locators will always to hit server everytime
        // directly it will hit server using driver.findelement
        WebElement emailId=driver.findElement(By.id("input-email"));
        WebElement pass=driver.findElement(By.id("input-password"));
        
        emailId.sendKeys("sjhad@gjandj.com");
        pass.sendKeys("dughgw");
        
        emailId.sendKeys("abcdgehf.com");
        
        // 3rd : By locator directly // OR
        //advantage : By locator and no need to hit server everytime when you create by locators
           // create all by locators then when you need hit server (driver.find element with by locator)
        
       By emailid= By.id("input-email");
       
       By password=By.id("input-password");
       
     WebElement eid=  driver.findElement(emailid);
     WebElement Password=driver.findElement(password);
     
     eid.sendKeys("eywur.com");
     Password.sendKeys("jsdhjh");

     
     // 4th approch : By locator + generic method to improve #3
     By emailid1= By.id("input-email");
     
     By password1=By.id("input-password");  
     
     getElement(emailid1).sendKeys("jdhwf@jdhj.com");
     getElement(password1).sendKeys("hdj");
        
 	// 5th approach: by locator+generic method for webelemnt +action
   
     
     By eid1= By.id("input-email");
     
     By pwd=By.id("input-password");  
     
     doSendKeys(eid1, "sanjana.com");
     doSendKeys(pwd, "sanjanaom");
     
     // 6th : by locator+generic method for webelemnt +action and 
     By eid2= By.id("input-email");
     
     By pwd2=By.id("input-password");
     
     ElementUtil eutil=new ElementUtil(driver);
     
     eutil.doSendKeys(eid2, null);
     
     eutil.doSendKeys(pwd2, null);
     
     
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
