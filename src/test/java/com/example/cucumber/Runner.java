package com.example.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-html-reports.html"
        },
        features = {"src/test/java/com/example/cucumber"},
        glue = {"com/example/cucumber"},
        dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {
}
