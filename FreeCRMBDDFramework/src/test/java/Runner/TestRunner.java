package Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions( features="C:/Users/POOJA/eclipse-workspace/FreeCRMBDDFramework/src/test/resources/features",
				glue="stepDefinitions",
				//plugin= {"pretty","html:target/cucumber-reports","json:target/cucmber.json"} //,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)
//@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests 

{
	  private TestNGCucumberRunner testNGCucumberRunner;
	  
	  @BeforeClass(alwaysRun=true) public void setUpClass()
	  { 
		  testNGCucumberRunner= new TestNGCucumberRunner(this.getClass()); 
	  }
	  
		/*
		 * @Test(groups="cucumber", description
		 * ="Runs Cucumber Features",dataProvider="scenarios") public void
		 * feature(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
		 * testNGCucumberRunner.runScenario(pickle.getPickle());
		 * 
		 * }
		 */
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	 @AfterClass(alwaysRun=true) public void tearDownClass()
	  {
		  testNGCucumberRunner.finish();
	  
	  }
	 

}
