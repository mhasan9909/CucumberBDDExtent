package cucumberAutomation;


import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		tags="@Smoke or @Regression",
		
		features="/Users/mdhasan/eclipse-workspace/m.Cucumber/src/test/java/firstSampleSprint/FirstSample.feature",
		glue= {"stepps"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"				
		}
		)


public class FirstFeatureRunnerTest {
	
	
}
