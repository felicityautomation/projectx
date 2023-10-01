package tests;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.OrangeLoginPage;
import utilities.BrowserUtil;
import utilities.ExcelUtil;

public class OrangeLoginTestWithExcelData {
	
	
	
	@Test
	public void login() throws InterruptedException, IOException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		OrangeLoginPage loginPage=new OrangeLoginPage(driver);
		Object[][] testData=ExcelUtil.readDataFromExcelSheet("testdata/Credentials.xlsx","Login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage.login(testData[0][0].toString(), testData[0][1].toString());
		Thread.sleep(15000);
		Calendar calendar = Calendar.getInstance();
		long timeMilli2 = calendar.getTimeInMillis();
		File screenShot=driver.getScreenshotAs(OutputType.FILE);
		//FileUtils.write(screenShot, (CharSequence) new File());
		File k=new File("screenshot/myScreenshot"+timeMilli2+".jpg");
		FileUtils.copyFile(screenShot, k);
		
        Reporter.log("<a href='"+ k.getAbsolutePath() + "'> <img src='"+ k.getAbsolutePath() + "' height='100' width='100'/> </a>");

		driver.quit();
	}

	
}
