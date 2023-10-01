package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.OrangeLoginPage2;
import pages.OrangeResetPasswordPage2;
import utilities.BrowserUtil;

public class OrangeLoginTest2 {
	
	
	public static void main(String args[]) {
		String a=null;
		a.equals("bharath");
	}
	
	@Test
	public void login() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		OrangeLoginPage2 loginPage=new OrangeLoginPage2(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage.login("admin", "admin123");
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void forgotPasswordTest() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeLoginPage2 loginPage=new OrangeLoginPage2(driver);
		loginPage.clickOnForgotPasswordLink();
		OrangeResetPasswordPage2 resetPage=new OrangeResetPasswordPage2(driver);
		resetPage.setUserName("Bharath@edureka.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
