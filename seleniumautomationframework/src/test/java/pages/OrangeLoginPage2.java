package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OrangeLoginPage2 {
	
	
	public OrangeLoginPage2(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locators of the page
	@FindBy(name = "username")
	WebElement inputUserName;
	
	@FindBy(name="password")
	WebElement inputPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonLogin;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	WebElement linkForgotPassword;
	
	
	//Functionalities of the page
	public void login(String userName,String password) {
		inputUserName.sendKeys(userName);
		Reporter.log("Setting user name field to Admin", true);
		inputPassword.sendKeys(password);
		Reporter.log("Setting password field to admin123", true);
		buttonLogin.click();
	}
	
	public void clickOnForgotPasswordLink() {
		linkForgotPassword.click();
	}
	
	
	
}
