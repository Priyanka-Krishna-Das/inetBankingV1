package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.Login;
import com.inetBanking.utilities.XLUtils;

public class TC_002_LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void LoginDDT(String user, String pwd)//dp is providing 
	{
		Login lp= new Login(driver);
		lp.setUserName(user);
		lp.setPwd(pwd);
		lp.clickLogin();

		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept(); //close window
			driver.switchTo().defaultContent(); //this is 
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent()  //user define method
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}

	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path="xlxs.path";
		
		//read data
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]= new String [rownum][colcount];
		
		//0 is header
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1,0
				
			}
		}
		return logindata;
	}
}
