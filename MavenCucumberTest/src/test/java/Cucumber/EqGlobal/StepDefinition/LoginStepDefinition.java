package Cucumber.EqGlobal.StepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.EqGlobal.Resources.ObjectRepository_Login;
public class LoginStepDefinition {

	String url;
	WebDriver driver;
	WebDriver driver2;
	@Before
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver","C:\\IEDriverServer_x64_3.9.0.exe\\IEDriverServer.exe");
		//driver=new InternetExplorerDriver();
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				
	}
	@Given("^The site \"([^\"]*)\"$")
	public void the_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		url=arg1;
	}
@Given("^Navigate to Login page$")
public void navigate_to_Login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	
}

@When("^I Enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_Enter_and(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	driver.findElement(By.id(ObjectRepository_Login.oLoginUsernameInputBoxId)).sendKeys(arg1);
	driver.findElement(By.id(ObjectRepository_Login.oLoginPasswordInputBoxId)).sendKeys(arg2);
}
	@When("^Enter the Six Digit \"([^\"]*)\" Code$")
	public void enter_the_Six_Digit_Code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id(ObjectRepository_Login.oVerificationCodeInputBoxId)).sendKeys(arg1);
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.findElement(By.id(ObjectRepository_Login.oLoginInputButtonId)).click();
	}

	@Then("^Home Page Displayed$")
	public void home_Page_Displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		String text= driver.findElement(By.xpath(ObjectRepository_Login.oEQGlobalLogoXpath)).getAttribute("alt");
		Assert.assertEquals(text,"Equiniti International Payments");
		
	}

	@Then("^Verify the UserName$")
	public void verify_the_UserName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		String text= driver.findElement(By.xpath(ObjectRepository_Login.oEQGlobalUserDisplayNameXpath)).getText();
		Assert.assertEquals(text,"Neil Kinnon");
	}
	@Then("^Close the window$")
	public void close_the_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.close();
	}
	@Then("^Test$")
	public void test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
		
	}

}
