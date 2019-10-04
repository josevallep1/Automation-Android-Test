package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = "@Android",
    glue = {"stepdefinitions"},
    features = {"src/test/resources/features"},
    plugin = {"pretty", "html:target/reports/execution-report",
        "json:target/reports/execution-report.json"})

public class RunAndroidTest extends AbstractTestNGCucumberTests {

}
