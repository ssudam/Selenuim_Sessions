package SelenuimSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/alerts-map/#/");

		
		Thread.sleep(3000);
	
	
	String SvgXpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @id='north-carolina']//*[name()='path']";
	
	List<WebElement> ncstatelist=driver.findElements(By.xpath(SvgXpath));
	
	System.out.println(ncstatelist.size());
	
	for(WebElement e:ncstatelist) {
		String counties=e.getAttribute("name");
		System.out.println(counties);
	}
	
	
	
	
	
	
	
	
	
	}

}
