package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By country =By.id("Form_getForm_Country");
		
//		// select is a class , we are creating an obj of select class
//		// add argument as webelemnt so create webelement
//		
//		WebElement country_ele=driver.findElement(country);
//		Select select=new Select(country_ele);
//		
//		//select.selectByIndex(4);
//		//select.selectByValue("Argentina");
//		select.selectByVisibleText("Belgium");
		
		// for different dropdowns need to create once again all steps
		// so create generic methods
		
		By country =By.id("Form_getForm_Country");	
		
		getDropdownSelectByIndex(country,7);
//		getDropdownSelectByValue(country,"Croatia");
//		getDropdownSelectByVisibleText(country,"Egypt");
//				
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	 
	public static void getDropdownSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public static void getDropdownSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void getDropdownSelectByVisibleText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
