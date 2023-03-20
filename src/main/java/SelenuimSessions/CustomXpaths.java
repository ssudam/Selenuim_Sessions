package SelenuimSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		//<----- with html tags----->
		//tag[@attr='value']
		////input[@id='input-email']
		////input[@placeholder='Search' and @type='text']
		//input[@type='text' and @name='email']
		//input[@type='text' and @name='email' and @id='input-email']
		
		//<--- text ()- text in init , headers , paras---->
		//tag[text()='value']
				//h2[text()='Returning Customer']
				//h2[text()='New Customer']
		
		// text() with attributes
		////label[@for='input-email' and text()='E-Mail Address']
		////a[text()='Login' and @class='list-group-item' and @href]
		
		
		//contains - //tag[contains(@attr,'value')]
		///input[contains(@placeholder,'E-Mail')]
		//input[contains(@placeholder,'Address')]
		
		//input[contains(@id,'email')]
		//input[@id='input-email']
		
		//contains() with one attribute and use another attribute without contains():
		//tag[contains(@attr1,'value') and @attr2='value']

		//input[contains(@placeholder,'E-Mail') and @id='input-email']
		
		//contains() with text():
		//tag[contains(text(),'value')]
		//a[contains(text(),'Consider a small Donation and support this page.')]
	
		//contains() with text() and contains() with attribute:
			//tag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Username') and contains(@rel,'nofollow noopener')]
	
		
		//starts-with():
				//tag[starts-with(text(),'value')]
		//h3[starts-with(text(),'Food')]
		//input[starts-with(@aria-labelledby,'UIFormControl') and @type='email']

		//input[starts-with(@placeholder,'First Crush') and @id='inp_val']
	
	//check boxes : parent / preceding sibling
		
		//notes: parent/child - direct -/
		// parent//child - direct+indirect elements 
		
		//* always go to parent and do preceding or following
		
		//.../../../// - ancestor parent
		
		//child/parent : /../.. or parent :: - backward travesing
		
		//a[contains(text(),'Garry.White')]/parent::td/preceding-sibling::td/input[@type='checkbox']
	
		//a[contains(text(),'Garry.White')]/parent::td/following-sibling::td[contains(text(),'ESS')]
	
	////input[@id='pass']/preceding-sibling::input[@id='userId']
		
		////select[@name='tablepress-1_length']/option
		
		
		//following siblings:
		
		////span[text()='Hazratullah Zazai']/ancestor::td/following-sibling::td
			
		//span[text()='Hazratullah Zazai']/ancestor::td/following-sibling::td//span/span
	
	//(//div[@class='ds-text-tight-s ds-font-regular ds-leading-4'])[1]//following-sibling::a
	
	// preceding -sibllings:
		////a[contains(text(),'Ashton cox')]/parent::td/preceding-sibling::td/input[@type='checkbox']
	
	//(//a[contains(text(),'Ashton cox')]/parent::td/following-sibling::td/span[@context='phone'])[1]
	
	}
	
	
	

}
