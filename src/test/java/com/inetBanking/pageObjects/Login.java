package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	
	//Const
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	//Locaters
	@FindBy(xpath="//*[@name='uid']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement txtPwd;
	
	@FindBy(xpath="//*[@name='btnLogin']")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[@href='Logout.php']")
	WebElement btnLogout;
	
	
	
	//Actions
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setPwd(String pwd)
	{
		txtPwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	

}
