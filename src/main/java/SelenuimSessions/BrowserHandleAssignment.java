package SelenuimSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// handling 2 windows at a time - parent and child so we need each window handle 
public class BrowserHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		Thread.sleep(3000);
		String parentwihndowid=driver.getWindowHandle();
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
//		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
//		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
//		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

		twEle.click();
		
		Set<String>handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		
		String parentwindow=it.next();
		System.out.println("parentwindowID is"+parentwindow);

		
		String child1 =it.next();
		System.out.println("child1 is"+child1);

		
		
		driver.switchTo().window(child1);
		System.out.println("the child1   is"+driver.getCurrentUrl());

		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println("the parent window  is"+driver.getCurrentUrl());

		Thread.sleep(3000);
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));

		fbEle.click();
		
       Set<String>handles2=driver.getWindowHandles();
		
		Iterator<String> it2=handles2.iterator();
		
		String parentwindow1=it2.next();
		System.out.println("parentwindowID 1 is"+parentwindow1);

		
		String child2 =it2.next();
		System.out.println("childwindow2 is"+child2);

		
		
		driver.switchTo().window(child2);
		System.out.println("the child2   is"+driver.getCurrentUrl());

		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println("the parent   is"+driver.getCurrentUrl());

		Thread.sleep(3000);
		
	WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

	ytEle.click();
	
	Set<String>handles3=driver.getWindowHandles();
	
	Iterator<String> it3=handles3.iterator();
	
	String parentwindow2=it3.next();
	System.out.println("parentwindowID2 is"+parentwindow2);

	
	String child3 =it3.next();
	System.out.println("child window 3 is"+child3);

	
	
	driver.switchTo().window(child3);
	System.out.println("the child3   is"+driver.getCurrentUrl());

	driver.close();
	driver.switchTo().window(parentwindow);
	System.out.println("the parent   is"+driver.getCurrentUrl());

	Thread.sleep(3000);
	
	WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

	liEle.click();
		
    Set<String>handles4=driver.getWindowHandles();
	
	Iterator<String> it4=handles4.iterator();
	
	String parentwindow3=it4.next();
	System.out.println("parentwindowID3 is"+parentwindow3);

	
	String child4 =it4.next();
	System.out.println("child window 4 is"+child4);

	
	
	driver.switchTo().window(child4);
	System.out.println("the child4   is"+driver.getCurrentUrl());

	driver.close();
	driver.switchTo().window(parentwindow);
	System.out.println("the parent   is"+driver.getCurrentUrl());

	Thread.sleep(3000);
	}
}
