package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G://Java WorkSpace//SeleniumCucumber//features//orangeHRMLogin.feature",
glue = "stepDefinations")
public class testRunner {
}
