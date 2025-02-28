package extentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReporterNG implements ITestListener
{
	ExtentReports extent = ExtentReporter.getReportObject();
	public ExtentTest test;
	
		public void onTestStart(ITestResult result)
		{
			System.out.println("*************onTestStart**********");
			test= extent.createTest(result.getName());
			test.log(Status.PASS, "Test case start is : "+result.getName());
		}
		
		public void onTestSuccess(ITestResult result)
		{
			System.out.println("*************onTestSuccess**********");
			test= extent.createTest(result.getName());
			test.log(Status.PASS, "Test case passed is : "+result.getName());
			
		}
		
		public void onTestFailure(ITestResult result)
		{
			System.out.println("*********OnTestFail**********");
			test= extent.createTest(result.getName());
			test.log(Status.FAIL, "Test case failed is : "+result.getName());
			test.log(Status.FAIL, "Test case failed cause is : "+result.getThrowable());
			
		}
		
		public void onSkippedTest(ITestResult result)
		{
			test= extent.createTest(result.getName());
			test.log(Status.SKIP, "Test case skipped is : "+result.getName());
			
		}
		public void onFinish(ITestContext context)
		{
			System.out.println("*******flush*******");
			extent.flush();
		}

}
