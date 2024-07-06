package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression or @tag1", 
                 features={"src/test/resources/TagFeatures"},
                 glue = {"StepDefinition"},
                 plugin = {"pretty", "html:target/htmlreport.html"})
 

public class TestRunnerForTags extends AbstractTestNGCucumberTests {

}
