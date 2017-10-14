package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.And;

public class HomeSteps extends BaseSteps{
	
	@FindBy(linkText = "CRM/SFA") WebElement crmsfa_Link;
	@And("Click the CRM/SFA link in the home page")
	public void clickCrmsfaLink(){
		crmsfa_Link.click();
	}
	
	@FindBy(linkText = "Creat Lead") WebElement creatLead_Link;
	@And("Click the Creat Lead link in the menu")
	public void clickCreatLeadLink(){
		creatLead_Link.click();
	}

}
