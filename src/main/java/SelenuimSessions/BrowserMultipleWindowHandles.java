package SelenuimSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		Thread.sleep(3000);
		String parentwihndowid=driver.getWindowHandle();
		
		// clicking all  4 windows at a time

		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

		twEle.click();
		fbEle.click();
		ytEle.click();
		liEle.click();
		
		// get window handles for all 5 windows
		
		Set<String>handles =driver.getWindowHandles();
		
		Iterator <String>it=handles.iterator();
		
		// as we have lot of windows to iterate and check use while
		while(it.hasNext()) { // hasNEXT - used to iterate more elements
			String windowid=it.next();
			driver.switchTo().window(windowid);
			System.out.println("the windowid"+driver.getCurrentUrl());
			
			Thread.sleep(1000);

			if (!windowid.equals(parentwihndowid)) {
				driver.close();
			}
		}
		
		//dont forget to switch back to parent window id
		
		driver.switchTo().window(parentwihndowid);
		
		System.out.println("the windowid"+driver.getCurrentUrl());

	}

}
