package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {
	
RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By imgProfilePic=By.xpath("//img[@alt='profile picture']");
	
	public boolean isProfileIconDisplayed() {
		return driver.findElement(imgProfilePic).isDisplayed();
	}

}
