package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		//single selection
		// ele is on first page
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='DenMark']")).size() > 0) {	
	
				selectCountry("DenMark");
				break;
			}
			
			// pagination logic 
			else {
			WebElement next=driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
			if(next.getAttribute("class").contains("disabled")) {
				System.out.println("paginatin not found");
				break;
			}
			
			next.click();
			Thread.sleep(3000);
			}
		}
		
	

}
	private static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	
		
	}
	
}

