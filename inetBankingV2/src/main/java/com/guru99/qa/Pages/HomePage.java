package com.guru99.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//div[@class='logo']")
	@CacheLookup
	WebElement Guru99SiteLogo;
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")
	@CacheLookup
	WebElement NewAccountLink;
	
	@FindBy(xpath="//a[contains(text(),'Deposit')]")
	@CacheLookup
	WebElement DepositLink;
	
	@FindBy(xpath="//a[contains(text(),'Balance Enquiry')]")
	@CacheLookup
	WebElement BalanceEnquiryLink;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement AddNewCustomerlink;
		
	//Initializing the Page Objects:
		 public HomePage() {
			 PageFactory.initElements(driver, this);
			 }
		 
		 public String verifyHomePageTitle() {
			 return driver.getTitle();
		 }
		 
		 public boolean verifyGuru99SiteLogo() {
			 return Guru99SiteLogo.isDisplayed();
			 
			 
		 }
		 
		 public NewAccountPage ClickOnNewAccountLink() {
			 NewAccountLink.click();
			 return new NewAccountPage();
			 
		 }
		 
		 
		 public DepositePage ClickOnDepositLink() {
			 DepositLink.click();
			 return new DepositePage();
			 
		 }
		 
		 public BalanceEnquiryPage ClickOnBalanceEnquiryLink() {
			 BalanceEnquiryLink.click();
			 return new BalanceEnquiryPage();
			 
		 }
		 
		 public AddNewCustomerPage ClickOnAddNewCustomerlink(){
			 AddNewCustomerlink.click();
			 return new AddNewCustomerPage();
			 
		 }
		 
		
}
