package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcepts {
	static WebDriver  driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        
//		String ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//	    System.out.println(ph);
//	    
//	    String img=  driver.findElement(By.className("img-responsive")).getAttribute("src");
//	    String titleval=  driver.findElement(By.className("img-responsive")).getAttribute("title");
//
//	    System.out.println(img+"--->"+titleval);
		
		By fname=By.name("firstname");
		By imagelink=By.className("img-responsive");
		
		getElementAttribute(fname, "placeholder");
		
	}

	
	//generic methods // this concept used for images , links ,placeholders from form
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static String getElementAttribute(By locator,String attrname) {
		return getElement(locator).getAttribute(attrname);
	}
}
