package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public static RemoteWebDriver driver;
	
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

}
