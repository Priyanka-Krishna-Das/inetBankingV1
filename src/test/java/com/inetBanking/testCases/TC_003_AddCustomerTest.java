package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.Login;

public class TC_003_AddCustomerTest extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		Login lp= new Login(driver);
		lp.setUserName(username);
		lp.setPwd(password);
		lp.clickLogin();
		Thread.sleep(4000);
		
		
		
		AddCustomerPage addcust= new AddCustomerPage(driver);
		addcust.clickNewCustLink();
		addcust.custName("Priyanka");
		addcust.custGender("Female");
		addcust.custDOB("01", "01", "2001");
		Thread.sleep(4000);
		addcust.custAddress("India");
		addcust.custCity("Pune");
		addcust.custState("Maharashtra");
		addcust.custPin("411014");
		addcust.custTel("9497783462");
		
		String email=randomString()+"gmail.com";
		addcust.custEmail(email);
		
		addcust.custPwd("abc@123");
		addcust.custSumbit();
		logger.info("Provided all cust infomation");
		Thread.sleep(3000);
		
//		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
//		
//		logger.info("Validation started...");
//		if(res==true)
//		{
//			Assert.assertTrue(true);
//			logger.info("New Customer added succesfully");
//		}
//		else
//		{
//			//captureScreen(driver,"addNewCustomer");
//			//captureScreen("addNewCustomer");
//			Assert.assertTrue(false);
//			logger.info("New customer add unsuccessful");
//		}
//		
	}
	
}
