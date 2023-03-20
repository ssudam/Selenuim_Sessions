package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='input-email']"));
	
	String aboveele=driver.findElement(with(By.tagName("label")).above(ele)).getText();
	
	System.out.println(aboveele);
	
	String belowele=driver.findElement(with(By.xpath("//input[@id='input-password']")).below(ele)).getAttribute("placeholder");
	
	System.out.println(belowele);
	
	String near=driver.findElement(with(By.tagName("h2")).near(ele)).getText();

	System.out.println(near);


	//a[contains(text(),'Ashton cox')]
	
//	WebElement ele2=driver.findElement(By.xpath("//a[text()='Account']"));
//	
//	driver.findElement(with(By.tagName("a")).toLeftOf(ele2)).click();
//	
//	driver.findElement(with(By.tagName("a")).toRightOf(ele2)).click();

	

	
	
	
	}

}
