package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features\\OpenAccount.feature",
		glue = {"com.truist.bdd.steps", "base"},
		tags = "@dataprovider", 
		plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
		monochrome = true,
		dryRun = false)

public class TestRunnner {

}
