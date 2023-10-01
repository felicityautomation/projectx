package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.OrangeLoginPage;
import pages.OrangeResetPasswordPage;
import utilities.BrowserUtil;

public class OrangeLoginTest {
	
	
	public static void main(String args[]) {
		String a=null;
		a.equals("bharath");
	}
	
	@Test
	public void login() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		OrangeLoginPage loginPage=new OrangeLoginPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage.login("admin", "admin123");
		Thread.sleep(5000);
		driver.quit();
		
	}

	@Test
	public void forgotPasswordTest() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeLoginPage loginPage=new OrangeLoginPage(driver);
		loginPage.clickOnForgotPasswordLink();
		OrangeResetPasswordPage resetPage=new OrangeResetPasswordPage(driver);
		resetPage.setUserName("Bharath@edureka.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
