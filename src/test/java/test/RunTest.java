package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Acer on 03/09/2017.
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".", tags = "@kailash", plugin =
        {"pretty","html:target/comTest-html-report", "json:target/comTest_report.json"})

public class RunTest {
}
