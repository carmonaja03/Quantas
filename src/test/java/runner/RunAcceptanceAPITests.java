package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html", "json:target/cucumber-json/TestSuite1/api.json",
                "junit:target/test-reports/cucumber-junit-api.xml"},
        tags = "@alltestcase",
        glue = "stepDefinition",
        features = "src/test/resources"
)
public class RunAcceptanceAPITests {
}
