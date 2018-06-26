package CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources"},glue={"Cucumber.EqGlobal.StepDefinition"})
public class TestRunner {

}
