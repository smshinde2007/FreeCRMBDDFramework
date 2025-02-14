package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="", features="C:/Users/POOJA/eclipse-workspace/FreeCRMBDDFramework/src/test/resources/features",
				glue="stepDefinitions",
				plugin= {"pretty","html:target/htmlreport.html"}
		
				)
public class TestRunner extends AbstractTestNGCucumberTests {

}
