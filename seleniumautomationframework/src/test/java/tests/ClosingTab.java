package tests;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class ClosingTab {
	
	@Test
	public void test() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.google.com/intl/en_in/business/");
		driver.findElement(By.xpath("(//span[contains(text(),'Manage now')])[2]")).click();
		Thread.sleep(10000);
		Set<String> handles=driver.getWindowHandles();
		
		for(String hadle:handles) {
			driver.switchTo().window(hadle);
			String title=driver.getTitle();
			//driver.getCurrentUrl();
//			if(title.contains("Google bus")) {
//				break;
//			}
		}
		driver.close();
		Thread.sleep(5000);
		
//		ArrayList<String> windows=new ArrayList<String>(handles);
//		driver.switchTo().window(windows.get(1));
//		driver.close();
	}
	

}
