package SelenuimSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		//driver.get("https://classic.crmpro.com");
		driver.get("https://www.amazon.com/");

		
//		List <WebElement>  paralist=driver.findElements(By.tagName("p"));
//		
//		int para=paralist.size();
//		System.out.println(para);
//		
//		for(WebElement  e :paralist) {
//			String paratext=e.getText();
//			System.out.println(paratext);
//		}
		
		//assignment 2
		
		//By AmazonFooterlinks= By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr");
		
		List <WebElement> AmazonFooterlinks =driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr"));

		int footerlinktotal=AmazonFooterlinks.size();
		System.out.println(footerlinktotal);
		
		for(WebElement e :AmazonFooterlinks) {
			String footertext=e.getText();
			System.out.println(footertext);
		}
	
	}

}
