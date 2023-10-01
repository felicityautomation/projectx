package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeResetPasswordPage2 {
	RemoteWebDriver driver;
	
	public OrangeResetPasswordPage2(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Define locators
	@FindBy(name="username")
	WebElement inputUserName;
	
	
	public void setUserName(String userName) {
		inputUserName.sendKeys(userName);
	}

}
