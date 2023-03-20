package SelenuimSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List <WebElement> totalLinks=driver.findElements(By.tagName("a"));
		int linksCount=totalLinks.size();
		System.out.println(linksCount);
		
		
		int count=0;
		for(WebElement e:totalLinks)
		{
			String text =e.getText();
			if(text.length()>0) {
			
			System.out.println(count+" : "+text);
		}
			count++;
			}
	
	}

}
