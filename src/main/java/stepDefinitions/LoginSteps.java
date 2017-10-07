package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public static RemoteWebDriver driver;
	
	@Before
	public void executeBeforeScenario(Scenario sc){
		String scenarioName = sc.getName();
		String scenarioId = sc.getId();
		System.out.println("Starting the Execution of the Scenario: "+scenarioName);
		System.out.println("ID of the Scenario: "+scenarioId);
	}
	
	@After
	public void executeAfterScenario(Scenario sc){
		String scenarioStatus = sc.getStatus();
		String scenarioName = sc.getName();
		System.out.println("The Status of the Scenario "+scenarioName+" is: "+scenarioStatus);
	}
	
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

}
