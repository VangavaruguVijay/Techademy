package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public String propFilePath="C:\\Users\\admin\\eclipse-workspace\\Techademy\\Resources\\data.properties";
	Properties prop =new Properties();
	

	public WebDriver initializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(propFilePath);
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Techademy\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\admin\\eclipse-workspace\\Techademy\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Techademy\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public String getUrl() throws IOException
	{
		FileInputStream fis=new FileInputStream(propFilePath);
		prop.load(fis);
		String url=prop.getProperty("url");
		return url;

	}

	public void getScreenShot(String TestResult) throws IOException
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		FileUtils.copyFile(src, new File("C:\\saved_screenshots\\"+TestResult+"screenshot.png"));
		
	}
	
	
}
