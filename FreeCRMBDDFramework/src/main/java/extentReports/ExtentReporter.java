package extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter 
{		

	public static ExtentReports getReportObject()
	{
		ExtentSparkReporter sparkRepoter= new ExtentSparkReporter("test-output/sparkReport/sparkReport.html");//(System.getProperty("user.dir")+"/extentReports.reports/myReport.html");

		sparkRepoter.config().setDocumentTitle("Automation report");
		sparkRepoter.config().setReportName("Functinal Testing");
		sparkRepoter.config().setTheme(Theme.DARK);
		
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(sparkRepoter);
		extent.setSystemInfo("EnvName", "FreeCRM");
		extent.setSystemInfo("TesterName", "SagarS");
		return extent;
	}
}
