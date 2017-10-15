package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseSteps{	
	
	public LoginSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Given("Launch the url")
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
	
	@FindBy(id = "username") WebElement usrName;
	@When("Enter the userName as (.*)")
	public void enterTheUserName(String userName){
		usrName.sendKeys(userName);
	}
	
	@FindBy(id = "password") WebElement pass;
	@And("Enter the password as (.*)")
	public void enterThePassword(String password){
		pass.sendKeys(password);
	}
	
	@FindBy(xpath = "//form[@id='login']/p[3]/input") WebElement login_Button;
	@And("Click the login button")
	public void clickTheLoginButton(){
		login_Button.click();
	}
	
	@FindBy(xpath = "//div[@id='form']/h2") WebElement wmsg;
	@Then("Print the welcome message")
	public void printTheWelcomeMessage(){
		String msg = wmsg.getText();
		System.out.println(msg);
	}
	
	@FindBy(id = "errorDiv") WebElement emsg;
	@But("Print the error message")
	public void printTheErrorMessage(){
		String errMsg = emsg.getText();
		System.out.println(errMsg);
	}
	
	@FindBy(id = "username") WebElement uName;
	@FindBy(id = "password") WebElement password;
	@When("Enter the username and password")
	public void enterUsernameAndPassword(DataTable dt){
		List<List<String>> records = dt.raw();
		uName.sendKeys(records.get(1).get(0));
		password.sendKeys(records.get(1).get(1));
	}

}
