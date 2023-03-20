package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelHandlingBigBasketExample {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
By menu=By.cssSelector("a.meganav-shop");

WebElement mainmenu=driver.findElement(menu);

mainmenu.click();

Thread.sleep(2000);

		
		WebElement parentele=driver.findElement(By.linkText("Bakery, Cakes & Dairy"));
	    
		Actions act=new Actions(driver);
		
		act.moveToElement(parentele).build().perform();
		
		
		Thread.sleep(3000);

		
	WebElement secondmenu=driver.findElement(By.linkText("Ice Creams & Desserts"));

	Actions act1=new Actions(driver);
	
	act.moveToElement(secondmenu).build().perform();

	
	}

}
