package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement add=driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
	
		
		Actions act=new Actions(driver);
		
		act.moveToElement(add).build().perform();
		
		Thread.sleep(2000);
		
		
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//
//		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(menu).build().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
//		
		
	
	}

}
