package SelenuimSessions;

public class AmazonTest {

	
	String browserName="firefox";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName="firefox";
		
		BrowserUtil brUtil= new BrowserUtil();
		brUtil.initDriver(browserName);
		
		brUtil.launchURL("https://www.facebook.com");
		
		String actTitle=brUtil.getPageTitle();
		
		if(actTitle.contains("Facebook")) {
			System.out.println("title -- pass");
			
		}
		else {
			System.out.println("title -- fail");

		}
		
		

		
	}

}
