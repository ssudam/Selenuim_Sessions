package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
//		JavascriptExecutor js=(JavascriptExecutor)(driver);
//		
//		String title=js.executeScript("return document.title").toString();
//	System.out.println(title);
//	
//	js.executeScript("alert('hi this is alert')");
		
		JavaScriptUtil JsUtil= new JavaScriptUtil(driver);
//		JsUtil.generateAlert("this is sanjana page");
//		
//		JsUtil.generateConfirmPopUp("are you sure ?");
//		
	//	JsUtil.refreshBrowserByJS();
	
//		String pageText = JsUtil.getPageInnerText();
//		System.out.println(pageText);
		
		//WebElement un = driver.findElement(By.name("username"));
		// form = driver.findElement(By.id("hs-login"));
		//JsUtil.drawBorder(form);
		
//		JsUtil.flash(un);
//		un.sendKeys("naveen@gmail.com");
//		
		
		
		JsUtil.scrollPageDown();
		Thread.sleep(2000);
		JsUtil.scrollPageUp();
		Thread.sleep(2000);
		JsUtil.scrollPageDown();
		Thread.sleep(2000);
		JsUtil.scrollPageUp();
		Thread.sleep(2000);
		JsUtil.scrollPageDownMiddlepage();
		
	}

}
