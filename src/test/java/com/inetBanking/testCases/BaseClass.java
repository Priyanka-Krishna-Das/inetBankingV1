package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUserName();
	public String password=readconfig.getPassword();
    

    public static WebDriver driver;
	
	public Logger logger;
	
	public ResourceBundle rb ; //to read config.properties file
	 
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		logger=Logger.getLogger("ebanking"); //Log4j
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


    public String captureScreen(String name) {
		// TODO Auto-generated method stub
	return null;
	}



//	public void captureScreen(WebDriver driver,String tname) throws IOException {
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File Source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File (System.getProperty("user.dir")+"/Screenshots/"+ tname+".png");
//		FileUtils.copyFile(Source, target);
//		System.out.println("Screenshot Taken");
//	}
	
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
		
	}
	
	public String randomNum()
	{
		String generatedString=RandomStringUtils.randomNumeric(8);
		return generatedString;
		
	}

	
}
