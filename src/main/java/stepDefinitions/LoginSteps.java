package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseSteps{	
	
	@Given("Lanuch the browser")
	public void lanuchTheBrowser(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@And("Launch the url")
	public void launchTheUrl(){
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("Maximize the window")
	public void maximizeTheWindow(){
		driver.manage().window().maximize();
	}
	
	@And("Set timeouts")
	public void setTimeouts(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("Enter the userName as (.*)")
	public void enterTheUserName(String userName){
		driver.findElementById("username").sendKeys(userName);
	}
	
	@And("Enter the password as (.*)")
	public void enterThePassword(String password){
		driver.findElementById("password").sendKeys(password);
	}
	
	@And("Click the login button")
	public void clickTheLoginButton(){
		driver.findElementByXPath("//form[@id='login']/p[3]/input").click();
	}
	
	@Then("Print the welcome message")
	public void printTheWelcomeMessage(){
		String msg = driver.findElementByXPath("//div[@id='form']/h2").getText();
		System.out.println(msg);
	}
	
	@But("Print the error message")
	public void printTheErrorMessage(){
		String errMsg = driver.findElementById("errorDiv").getText();
		System.out.println(errMsg);
	}
	
	@When("Enter the username and password")
	public void enterUsernameAndPassword(DataTable dt){
		List<List<String>> records = dt.raw();
		driver.findElementById("username").sendKeys(records.get(1).get(0));
		driver.findElementById("password").sendKeys(records.get(1).get(1));
	}
	
	@And("Click the CRM/SFA link in the home page")
	public void clickCrmsfaLink(){
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click the Creat Lead link in the menu")
	public void clickCreatLeadLink(){
		driver.findElementByLinkText("Creat Lead");
	}

}
