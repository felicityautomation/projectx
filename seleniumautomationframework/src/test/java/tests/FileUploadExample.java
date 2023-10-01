package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class FileUploadExample {

	@Test
	public void upload() {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Actions actions=new Actions(driver);
		driver.findElement(By.id("file-upload")).sendKeys("D:\\edureka5\\workspace\\seleniumautomationframework\\testdata\\Credentials.xlsx");
		
		actions.click(driver.findElement(By.id("file-submit"))).build().perform();
//		driver.findElement(By.id("file-submit")).click();
	}
}
