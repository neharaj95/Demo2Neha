package shriTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
	features = "src/test/java/features",glue = "stepDefinations",tags="@SmokeTest")

// glue = "stepDefinations" - give package name
public class TestRunner {
	

}
