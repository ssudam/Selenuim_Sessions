package SelenuimSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {

	public static void main(String[] args) {
		String browsername="chrome";
		
		BrowserUtil brUtil=new BrowserUtil();
		
		WebDriver driver=brUtil.initDriver(browsername);
		
	    brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String actTitle=brUtil.getPageTitle();
		
		System.out.println(actTitle);
		
		//locators - By locators
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By emailid=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPassword=By.id("input-confirm");
		
		ElementUtil elUtil=new ElementUtil(driver);
		
		elUtil.doSendKeys(firstname, "Sanjana");
		elUtil.doSendKeys(lastname, "Sudam");
		elUtil.doSendKeys(emailid, "Sudam.sanjana@gmail.com");
		elUtil.doSendKeys(telephone, "2243529234");
		elUtil.doSendKeys(password, "aahd");
		elUtil.doSendKeys(confirmPassword, "aahd");



		

	}

}
