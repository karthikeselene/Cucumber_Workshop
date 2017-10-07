package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/main/java/features/Login.feature","src/main/java/features/Login_Pos_Neg.feature"},
                 glue = "stepDefinitions"
		        )

public class RunTest {

}
