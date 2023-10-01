package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

import utilities.WebActions;

public class OrangeLoginPage {
	//Define RemoteWebDriver reference
	RemoteWebDriver driver;
	
	public OrangeLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	//Locators of the page
	By inputUserName=By.name("username");
	By inputPassword=By.name("password");
	By buttonLogin=By.xpath("//button[@type='submit']");
	By linkForgotPassword=By.xpath("//p[text()='Forgot your password? ']");
	
	//Functionalities of the page
	public void login(String userName,String password) {
		WebActions.setText(driver, inputUserName, userName);
		WebActions.setText(driver, inputPassword, password);
		WebActions.click(driver, buttonLogin);
	}
	
	public void clickOnForgotPasswordLink() {
		WebActions.click(driver, linkForgotPassword);
	}
	
	
	
}
