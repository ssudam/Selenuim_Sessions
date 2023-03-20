package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoSendKeys {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	By fn=By.id("input-firstname");
	By ln=By.id("input-lastname");
	By continueBtn = By.cssSelector("input[type='submit']");

	Actions act=new Actions(driver);
	//ElementNotInteractableException will be found
	//act.sendKeys(driver.findElement(fn), "naveen").build().perform();
	
	//so create your own utilties and use generic methods
	
	
	doSendKeys(fn, "sanjana");
	doSendKeys(ln, "sudam");
	doActionsCick(continueBtn);

}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	
	public static void doActionsCick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
}
