package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Locaters
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	WebElement newCust;
	
    @FindBy(xpath="//*[@name='name']")
	WebElement txtCustName;
		
	@FindBy(xpath="//*[@value='f']")
	WebElement txtCustGender;
		
	@FindBy(xpath="//input[@id='dob']")
	WebElement txtCustDOB;
	
	@FindBy(xpath="//*[@name='addr']")
	WebElement txtCustAdd;
	
	@FindBy(xpath="//td/input[@name='city']")
	WebElement txtCustCity;
	
	@FindBy(xpath="//td/input[@name='state']")
	WebElement txtCustState;
	
	@FindBy(xpath="//td/input[@name='pinno']")
	WebElement txtCustPin;
	
	@FindBy(xpath="//td/input[@name='telephoneno']")
	WebElement txtCustTel;
	
	@FindBy(xpath="//td/input[@name='emailid']")
	WebElement txtCustEmail;
	
	@FindBy(xpath="//td/input[@name='password']")
	WebElement txtCustPwd;
	
	@FindBy(xpath="//td/input[@value='Submit']")
	WebElement addNewClickSubmit;
	
	//Action Methods
	public void clickNewCustLink() 
	{
		newCust.click();
		
	}
	
	public void custName(String cname) 
	{
		txtCustName.sendKeys(cname);
		
	}
	
	public void custGender(String cgender) 
	{
		txtCustGender.click();
		
	}
	
	public void custDOB(String mm,String dd, String yy) 
	{
		txtCustDOB.sendKeys(mm);
		txtCustDOB.sendKeys(dd);
		txtCustDOB.sendKeys(yy);
		
	}
	public void custAddress(String caddress) 
	{
		txtCustAdd.sendKeys(caddress);
		
	}
	
	public void custCity(String ccity) 
	{
		txtCustCity.sendKeys(ccity);
		
	}
	
	public void custState(String cstate) 
	{
		txtCustState.sendKeys(cstate);
		
	}
	//public void custPin(int cpin) 
	public void custPin(String cpin)
	{
		txtCustPin.sendKeys(String.valueOf(cpin));
		
	}
	
	public void custTel(String ctel) 
	{
		txtCustTel.sendKeys(ctel);
		
	}
	
	public void custEmail(String cemail) 
	{
		txtCustEmail.sendKeys(cemail);
		
	}
	
	public void custPwd(String cpwd) 
	{
		txtCustPwd.sendKeys(cpwd);
		
	}
	
	public void custSumbit() 
	{
		addNewClickSubmit.click();
		
	}
	
	
	
}
