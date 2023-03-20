package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassTest {
	public WebDriver driver;
	
    @Parameters({"url","browser"})
	@BeforeTest // will run only once and then executes these 3 test cases
	public void setup(String url, String browserName) {
		
		System.out.println("launching browser :"+browserName);
		if(browserName.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browserName.trim().equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("please pass right browser:"+browserName);
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
