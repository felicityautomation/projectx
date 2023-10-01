package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class ActionClassExamples {
	
	@Test(enabled=false)
	public void multiDropDown() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.icicibank.com/");
		WebElement loansMenu=driver.findElement(By.xpath("(//span[text()='Loans'])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(loansMenu).build().perform();
		//Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30000));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Loans Against Securities ']")));
		driver.findElement(By.xpath("//a[text()='Loans Against Securities ']")).click();
		WebElement fixedDiposits=driver.findElement(By.xpath("(//a[text()='Fixed Deposit'])[3]"));
		actions.moveToElement(fixedDiposits).build().perform();
		
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.switchTo().frame("iframeResult");
		WebElement button=driver.findElement(By.xpath("//button[text()='Double-click me']"));
		Thread.sleep(5000);
		actions.doubleClick(button).build().perform();
	}
	
	@Test
	public void rightClick() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClickButton).build().perform();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		//actions.clickAndHold(draggable).release(droppable).build().perform();
		actions.dragAndDrop(draggable, droppable).build().perform();
		
		
	}

}
