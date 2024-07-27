package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.inetBanking.pageObjects.BaseClass;
import com.inetBanking.pageObjects.Login;

public class TC_001_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		
		driver.get(baseURL);
		logger.info("URL is open");
		
		//Login
		Login lp=new Login(driver);
		lp.setUserName(username);
		logger.info("Enter username");
		
		lp.setPwd(password);
		logger.info("Enter username");
		
		lp.clickLogin();
		logger.info("Click on Login");
		
		System.out.println();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
       {
	      Assert.assertTrue(true);
	      logger.info("Login successfully");
       }
       else
       {
    	   //captureScreen(driver, "loginTest");
    	   Assert.assertTrue(false);
    	   logger.info("Login failed");
    	   
       }

	}
	
	

}
