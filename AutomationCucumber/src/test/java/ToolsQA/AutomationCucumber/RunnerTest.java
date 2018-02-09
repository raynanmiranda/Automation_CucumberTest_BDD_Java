package ToolsQA.AutomationCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/Registration.feature",
		glue = {"Tests"}
	)
public class RunnerTest {

	
}
