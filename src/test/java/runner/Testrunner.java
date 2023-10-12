package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"features/Registration.feature"},glue = {"step.difinations"},plugin= {"html:htmlreport/cucumber-test-report.html","pretty"})
public class Testrunner extends AbstractTestNGCucumberTests {
	
}
