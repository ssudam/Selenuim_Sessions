package SelenuimSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Thread.sleep(3000);
	WebElement fblink=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/OrangeHRM/')]"));
	fblink.click();
	
	// get all window handles then swtich to child window
	
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();
	
	String parentwindow=it.next();
	System.out.println("parentwindowID is"+parentwindow);
	
	
	String childwindow=it.next();
	System.out.println("childwindowID is"+childwindow);
	
//1
	driver.switchTo().window(childwindow);
	
	System.out.println("childwindow title" +driver.getCurrentUrl());
	
	driver.close();
	
	//2
	driver.switchTo().window(parentwindow);
	
	System.out.println("parent window title" +driver.getCurrentUrl());
	
	//driver.quit();
	
	
	
	}

}
