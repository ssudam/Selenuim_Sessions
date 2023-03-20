package SelenuimSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");//10 - 5 = 5
		driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");//10 - 2 = 8
		driver.findElement(By.xpath("//input[@value='Login']")).click();//10-6 = 4
		
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
	}

}
