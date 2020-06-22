package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Resources/RahulShettyAutomationProject.feature" }, glue = {
        "" }, plugin = { "pretty", "html:target/cucumber-reports",
        //"json:target/cucumber-reports/d2c.json",
        //"junit:target/cucumber-reports/d2c.xml",
        "rerun:target/rerun/d2c.txt" }, monochrome = true)

public class Test_Rahul_Shetty {
}
