package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"\\src\\test\\resources\\features\\Landing.feature"},
		glue= {"stepdefs","hooks"},
		tags="@Regression",
				
				publish= true,
				plugin= {"pretty","json:target/cucumber-reports/cucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
				
				
		
		
		
		




public class MyTestRunner {

}
