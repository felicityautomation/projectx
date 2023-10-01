package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import dataprovider.LoginTestData;
import pages.OrangeLoginPage;
import utilities.BrowserUtil;

public class OrangeLoginTestWithExcelDataProvider {
	
	
	
	@Test(dataProvider = "loginData",dataProviderClass = LoginTestData.class)
	public void login(String userName,String password) throws InterruptedException, IOException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		OrangeLoginPage loginPage=new OrangeLoginPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage.login(userName, password);
		Thread.sleep(10000);
		File screenShot=driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.write(screenShot, (CharSequence) new File());
		FileUtils.copyFile(screenShot, new File("screenshot/file_"+userName+".jpg"));
		driver.quit();
	}

	
}
