package org.TestRunner;

import org.base1.JvmReport1;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Sekar\\eclipse-workspace\\CucumberClass1\\src\\test\\resources\\feature",monochrome=true,glue= {"org.stepdefinition"},plugin= {"pretty","json:C:\\\\Users\\\\Sekar\\\\eclipse-workspace\\\\CucumberClass1\\\\src\\\\test\\\\resources\\\\report\\\\final.json"})
public class TestRunner {
	@AfterClass
	public static void afterclass() {
		JvmReport1.report("C:\\\\Users\\\\Sekar\\\\eclipse-workspace\\\\CucumberClass1\\\\src\\\\test\\\\resources\\\\report\\\\final.json");
	}
}
