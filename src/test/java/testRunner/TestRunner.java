package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = { ".\\src\\test\\resources\\FeatureFile\\HerokuappFeatureFile.feature" }, 
            glue = {"stepDefinition" }, 
          plugin = { "html:target/cucumber-html-report",
				      "junit:target/junit_report/junit_reports.xml" },

		monochrome = true, dryRun = false

)
public class TestRunner {

}
