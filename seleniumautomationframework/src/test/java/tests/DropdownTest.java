package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class DropdownTest {

	@Test(enabled = false)
	public void selectDropdown() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.amazon.in/");
		WebElement e=driver.findElement(By.id("searchDropdownBox"));
		Select dropdown=new Select(e);
		dropdown.selectByVisibleText("Alexa Skills");
		Thread.sleep(5000);
		dropdown.selectByValue("search-alias=appliances");
		Thread.sleep(5000);
		dropdown.selectByIndex(10);
		
		List<WebElement> list=dropdown.getOptions();
		for(WebElement element:list) {
			System.out.println(element.getText());
		}
		
		System.out.println(dropdown.isMultiple());
	}
	
	@Test
	public void multiDropDown() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement e=driver.findElement(By.id("cars"));
		Select dropdown=new Select(e);
		System.out.println(dropdown.isMultiple());
		dropdown.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		dropdown.selectByValue("saab");
		Thread.sleep(5000);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		dropdown.deselectByVisibleText("Volvo");
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		
		
	}
}
