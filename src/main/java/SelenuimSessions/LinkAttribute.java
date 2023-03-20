package SelenuimSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAttribute {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		
		// Webscrapping : analyze the data -fetch all links , images etc and give it to concerned team
	 By links=By.tagName("a");
	 
	 By images=By.tagName("img");
	 
//	List<WebElement> linklist=getElements(links);
//	
//	for(WebElement e: linklist) {
//		String  href=e.getAttribute("href");
//	String text=e.getText();
//	
//	System.out.println(href+""+text);
//	}
	 
//	 List<WebElement> imagesLink=getElements(images);
//	 System.out.println(imagesLink.size());
//	 for(WebElement e :imagesLink) {
//		 String imglinks=e.getAttribute("src");
//		 System.out.println(imglinks);
//	 }
	 
	 getElementsAttribute(links, "href");
	 getElementsAttribute(images, "src");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementsAttribute(By locator,String attrname) {
		List<WebElement> elelist=getElements(locator);
		for(WebElement e :elelist) {
			String atr= e.getAttribute(attrname);
			System.out.println(atr);
			
		}
	}

}
