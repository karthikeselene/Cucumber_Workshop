package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateLeadSteps extends BaseSteps{
	
	@And("Enter the company name (.*)")
	public void enterCompanyName(String cName){
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the first name (.*)")
	public void enterFirstName(String fName){
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the last name (.*)")
	public void enterLastName(String lName){
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@And("Click on the create lead button")
	public void clickCreateLeadButton(){
		driver.findElementByName("submitButton").click();
	}
	
	@Then("Print the company name in the view lead")
	public void printLeadId(){
		String leadId = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(leadId);
	}	

}
