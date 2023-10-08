package step.definition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.BrowserUtil;

public class Steps {
	
	RemoteWebDriver driver;
	
	@Given("user is on the browser")
	public void user_is_on_the_browser() throws Exception {
	   driver=BrowserUtil.getDriver();
	}

	@When("user navigated to the login page")
	public void user_navigated_to_the_login_page() {
	   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters user name as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String userName, String password) {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(userName, password);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickOnLoginButton();
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
	    HomePage homePage=new HomePage(driver);
	    boolean flag=homePage.isProfileIconDisplayed();
	    Assert.assertEquals(flag, true);
	}
	
	@Then("error message is displayed in Login page")
	public void error_message_is_displayed_in_login_page() throws InterruptedException {
	   Thread.sleep(5000);
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}



}
