package utilities;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserUtil {
	
	public static RemoteWebDriver getDriver() {
		
		String browser=System.getProperty("browser");
		System.out.println("Browser command-line argument is:="+browser);
		Logger log=LoggerUtil.getLogger("BrowserUtil.getDriver()");
		log.debug("Browser command-line argument is:="+browser);
		RemoteWebDriver driver=null;
//		if(browser==null) {
//			driver=new ChromeDriver();
//		}
		if(browser!=null&&browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser!=null&&browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser!=null&&browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		return driver;
	}

}
