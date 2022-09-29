package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
		glue = {"com.truist.bdd.steps", "base"},
		tags = "@tag",
		plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
		monochrome = true,
		dryRun = false)

public class TestRunnner {

}
