package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {
	// Data members
		//Instance variables
		//Emp Name
		//Empt ID
		//Emp Dept
		//Emp Salary
	
	//Methods
		//Methods will operate on object's data stored in the instance variables
		//setEmployeeName()
		//getEmployeeName()
		//increaseEmplyeeSalary()
	
	RemoteWebDriver kkk;
	
	public LoginPage(RemoteWebDriver driver) {
		this.kkk=driver;
	}
	
	By inputUser=By.name("username");
	By inputPassword=By.name("password");
	By buttonLogin=By.xpath("//button");
	By messageLoginError=By.xpath("//p[text()='Invalid credentials']");
	
	public void login(String username,String password) {
		kkk.findElement(inputUser).sendKeys(username);
		kkk.findElement(inputPassword).sendKeys(password);
	}
	public void clickOnLoginButton() {
		kkk.findElement(buttonLogin).click();
	}
	
	public boolean isLoginErrorDisplayed() {
		return kkk.findElement(messageLoginError).isDisplayed();
	}
}
