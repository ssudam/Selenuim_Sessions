package SelenuimSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementFromPageSection {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
//		List<WebElement> rightsectionlist=driver.findElements(By.xpath("//aside[@id=\"column-right\"]//a"));
//	
//	for(WebElement e:rightsectionlist) {
//		String rightpanelsec=e.getText();
//		System.out.println(rightpanelsec);
//	}
		By linkstext= By.xpath("//aside[@id='column-right']//a");
		getElementListText(linkstext);
	
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void  getElementListText(By locator) {
		// creating an empty list and storing the texts in arraylist
		ArrayList<String> emptylist=new ArrayList<String> (); //size =0;
		List <WebElement> textlist=getElements(locator);// 1
		for(WebElement elelist:textlist) {//2
			String rightheaderlist=elelist.getText();//3 it gives only login
			System.out.println(rightheaderlist);
			emptylist.add(rightheaderlist);//4
			
		}
		
		
	}

}
