package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenuim {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//id - unique
		
		driver.findElement(By.id("input-email")).sendKeys("sudam.sanjana@gmail.com");
	
		
		//2.name : can be duplicate
		
		driver.findElement(By.name("email")).sendKeys("sds@adjh");
		By emailid=By.name("email");
		
		//3.class name: can be duplicate most of the time - not recommended if its duplicate
		//use class name only if its unique
		
		driver.findElement(By.className("form-control")).sendKeys("ssusuad@gmail.com");

		
		//4 . Xpath:its not an attribute. its the address of the element in HTML DOM
	      driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abc@gmail.com");
	      
	      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123@gmail.com");
	
	      
	     // By locators
	     By emailid1= By.xpath("//*[@id=\"input-email\"]");
	    By pass= By.xpath("//*[@id=\"input-password\"]");
	    
	    doSendKeys(emailid1, "venkyk@gmail.com");
	    
	    doSendKeys(pass, "venka345");
	    
	 	//5. css selector: not an attribute
	    driver.findElement(By.cssSelector("#input-email")).sendKeys("sjh@gmial.com");
	    driver.findElement(By.cssSelector("#input-password")).sendKeys("sjh@gmial.com");
        driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
	   
        //6.linkText: only for links --> htmltag = a . LinkText can be duplicate
        
      //its not an attribute -- its the text of the link
      		driver.findElement(By.linkText("Register")).click();
     		By registerLink = By.linkText("Register");
      		doClick(registerLink);
      		
      	//  7. partialLinkText: only for links
    		// Forgotten Password
    		// Forgotten UserId
    		//driver.findElement(By.partialLinkText("Forgotten")).click();
    
	//8. tagName : htmltag
      		
      driver.findElement(By.tagName("h2")).getText();
	
      
     //getText: links, headers, paragraph, footer 
		By payment = By.linkText("Recurring payments");
		String val = doElementGetText(payment);
		System.out.println(val);
		
		//click: button, checkboxes, radiobutton, images, links
		//sendKeys: textbox/textfield, dropdown, fileupload
	
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		 getElement(locator).sendKeys(value);
	}

	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doElementGetText(By locator) {
       return getElement(locator).getText();
	}
}
