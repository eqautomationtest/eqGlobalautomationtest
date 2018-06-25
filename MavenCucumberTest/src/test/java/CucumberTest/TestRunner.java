package CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"},glue={"Cucumber.EqGlobal.StepDefinition"})
public class TestRunner {

}
