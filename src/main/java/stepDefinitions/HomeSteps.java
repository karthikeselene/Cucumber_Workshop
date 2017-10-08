package stepDefinitions;

import cucumber.api.java.en.And;

public class HomeSteps extends BaseSteps{
	
	@And("Click the CRM/SFA link in the home page")
	public void clickCrmsfaLink(){
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click the Creat Lead link in the menu")
	public void clickCreatLeadLink(){
		driver.findElementByLinkText("Creat Lead");
	}

}
