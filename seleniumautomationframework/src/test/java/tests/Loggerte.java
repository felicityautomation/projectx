package tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import utilities.BrowserUtil;

public class Loggerte {
	
	public static void main(String args[]) {
		Logger log=Logger.getLogger("test case");
		PropertyConfigurator.configure("log4j.properties");
		//BasicConfigurator.configure();
		log.debug("test");
		log.warn("test");
		log.info("test");
		log.error("error");
		log.fatal("Fatal error");
		RemoteWebDriver driver=new BrowserUtil().getDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
//		actions.dragAndDrop(draggable, droppable).build().perform();
		actions.clickAndHold(draggable).release(droppable).build().perform();
	}

}
