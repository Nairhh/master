package testRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/cucumberreport.html"},
		features ="Feature",
		glue= {"stepDefination"},
		tags= {"@login,@data_driven"})

public class DemoTestRunner {

}
