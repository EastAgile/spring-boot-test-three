package com.thaohm.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by thaohm on 7/26/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "classpath:features/"},
        glue = "com.foreach.cuke",
        format = {
            "json:target/cucumber/cucumber-report.json",
            "html:target/cucumber/plain-html-reports",
            "com.foreach.cuke.core.formatter.ConsoleReporter"
        }
)
public class TestCwbRestFeatures {
}
