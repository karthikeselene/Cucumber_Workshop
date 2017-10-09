package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/main/java/features/CreateLead.feature"},
                 glue = "stepDefinitions",
                 plugin = {"html:target/cucumber",
                		   "pretty:target/pretty.txt"},
                 monochrome = true
		        )

public class RunTest {

}
