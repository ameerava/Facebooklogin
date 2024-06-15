package testpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage1.Facebookloginpage;

public class Facebooklogintest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

}
	@Test
	public void logintest()
	{
		Facebookloginpage ob =new Facebookloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.loginclick();
	}
	
	

}
