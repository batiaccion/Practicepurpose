package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features ="src/test/resources/features",
	glue="StepDef",
	//dryRun=true,
	//publish=true,
	tags = "@sanity"
)
public class testrunner {

}
