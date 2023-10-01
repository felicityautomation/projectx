package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class FirstTest {
	
	@Test
	public void test() {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.google.com");
		
		String a=System.getProperty("testng");
		System.out.println(a);
	}

}
