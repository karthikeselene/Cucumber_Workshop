package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseSteps{
	
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
		driver.close();
	}

}
