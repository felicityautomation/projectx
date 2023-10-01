package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class WebActions {
	
	public static void openUrl(RemoteWebDriver driver,String Url) {
		driver.navigate().to(Url);
		Reporter.log("Launching the browser using the URL:="+Url);
		
	}
	
	public static void setText(RemoteWebDriver driver,By locator,String data) {
		driver.findElement(locator).sendKeys(data);
		Reporter.log("Setting the text of the element:="+locator.toString()+" with data:="+data);
	}
	
	public static void click(RemoteWebDriver driver,By locator) {
		driver.findElement(locator).click();
		Reporter.log("Clicking on the element with locator:="+locator.toString());
	}
	
	public static String getTitle(RemoteWebDriver driver) {
		return driver.getTitle();
	}
	
	public static void closeBrowser(RemoteWebDriver driver) {
		driver.quit();
	}

}
