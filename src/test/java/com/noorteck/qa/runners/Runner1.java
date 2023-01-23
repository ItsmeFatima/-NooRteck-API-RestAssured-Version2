package com.noorteck.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@org.junit.runner.RunWith(Cucumber.class)

@CucumberOptions(
					features = "src/test/resources/hr/US205-GetAllDeps.feature",
					glue = "com.noorteck.qa.steps",					
							plugin = {"summary","pretty", "html:target/cucumber-reports.html",
									"json:target/cucumber-reports",					
									"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					monochrome = true
						)
public class Runner1 {

}
