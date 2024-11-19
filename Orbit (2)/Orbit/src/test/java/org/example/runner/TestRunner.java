package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/login.feature",
        glue = {"org.example.stepDefinitions",  "org.example.base"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},

//        plugin=  {"pretty","html:target/cucumber.html","junit:target/cucumber.xml",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        //plugin = {"json:target/cucumber.json"},
        monochrome = true


)
public class TestRunner {
}