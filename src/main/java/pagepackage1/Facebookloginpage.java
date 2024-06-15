package pagepackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookloginpage {

	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement button;
	
	public Facebookloginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
	}
	
	public void loginclick() {
		button.click();
	}
	
	
}
