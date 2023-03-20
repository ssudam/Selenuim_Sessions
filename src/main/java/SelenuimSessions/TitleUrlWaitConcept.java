package SelenuimSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleUrlWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		driver.findElement(By.linkText("Forgotten Password")).click();

//	String titlepass=waitForTitleContainsAndFetch(10, "Password?");
//	
//	System.out.println(titlepass);
//		
//		if(titlepass.equals("Forgot Your Password?")){
//			System.out.println("PASS"); 	
//
//		}
//		
//	String pass2=	waitForTitleIsAndFetch(20, "Forgot Your Password?");
//	
//	System.out.println(pass2);
//	
		
		
		// URL 
		
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.linkText("Customer Service")).click();
//	String url=	waitForURLIsAndFetch(10,"https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
//	
//	System.out.println(url);
//	
//	if(url.contains("help")){
//		System.out.println("PASS");
		
	//}
		
		String wait2=waitForURLContainsAndFetch(10,"customer");
		System.out.println(wait2);
		
		if(wait2.contains("display")) {
			System.out.println("pass");
		}
}
	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}
	
	public static String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	}

	public static String waitForURLIsAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}
	
	public static String waitForURLContainsAndFetch(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();
	}
}
