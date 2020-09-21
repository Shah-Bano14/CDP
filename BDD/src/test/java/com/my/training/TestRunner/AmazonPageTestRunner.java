package com.my.training.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.my.training.stepDefs" },
plugin = { "html:target/cucumber-report.html","pretty" },
		 features = {"src/test/java/com/my/training/features/AmazonHomePage.feature"},
		 tags= {"@fgh"},
		// dryRun= true,
		 strict= true,
		 monochrome= true)
public class AmazonPageTestRunner {

	
}
