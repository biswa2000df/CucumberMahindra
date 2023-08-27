package com.sumvention.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".//src/main/resources/Features", glue = "com.sumvention.defination", plugin = {
		"html:target/cucumber.html" }

)

public class Run extends AbstractTestNGCucumberTests {
}
