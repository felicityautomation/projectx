package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OrangeResetPasswordPage {
	RemoteWebDriver driver;
	
	public OrangeResetPasswordPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Define locators
	By inputUserName=By.name("username");
	
	
	public void setUserName(String userName) {
		driver.findElement(inputUserName).sendKeys(userName);
	}

}
