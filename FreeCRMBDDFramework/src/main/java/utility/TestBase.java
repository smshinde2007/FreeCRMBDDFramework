package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.core.backend.CucumberInvocationTargetException;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop= new Properties();
			FileInputStream fs= new FileInputStream("C:/Users/POOJA/git/FreeCRMBDDFramework/FreeCRMBDDFramework/src/main/java/config/config.properties");
			prop.load(fs);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
		catch(CucumberInvocationTargetException i)
		{
			i.getCause();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void initilization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		System.setProperty("WebDriver.chrome.driver", "C:/Users/POOJA/Downloads/chromedriver_win32");
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("--headless"); driver = new
		 * ChromeDriver(chromeOptions);
		 */
			 driver= new ChromeDriver();
			
		
		}
		   else if(browserName.equals("FF"))
  	    {
			   System.setProperty("WebDriver.chrome.driver", "C:/Users/POOJA/Downloads/chromedriver_win32");	 
	    }
		
		   driver.get(prop.getProperty("url"));
		   driver.manage().window().maximize();
		   System.out.println("Open url successfully");
		   driver.manage().timeouts().pageLoadTimeout(PageUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(PageUtil.Page_IMPILCIT_WAIT, TimeUnit.SECONDS);
	}
	
	
}
