package com.guru99.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class AddNewCustomerPage extends TestBase {

	@FindBy(xpath = "//p[@class='heading3']")
	WebElement addnewcustomerlable;
	
	@FindBy(name = "name")
	WebElement CustomerName;
	
	@FindBy(xpath = "//input[@id='dob']")
	WebElement DOB;
	
	@FindBy(xpath = "//textarea[@rows='5']")
	WebElement Address;
	
	@FindBy(name = "city")
	WebElement City;
	
	@FindBy(name = "state")
	WebElement State;
	
	@FindBy(name = "pinno")
	WebElement PinNumber;
	
	@FindBy(name = "telephoneno")
	WebElement ContactNumber;
	
	@FindBy(name = "emailid")
	WebElement Email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement PassWord;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement SubmitButton;
	
	
	 public AddNewCustomerPage() {
		 PageFactory.initElements(driver, this);
 }
	
	 public boolean verifyaddnewcustomerlable() {
		 return addnewcustomerlable.isDisplayed();
	 }
	 
	 public void AddnewCustomer(String customername,String Birthday,String address,String city,String state,String pinno,String mobilenumber,String email,String password) 
	 {
		 CustomerName.sendKeys(customername);
		 DOB.sendKeys(Birthday);
		 Address.sendKeys(address);
		 City.sendKeys(city);
		 State.sendKeys(state);
		 PinNumber.sendKeys(pinno);
		 ContactNumber.sendKeys(mobilenumber);
		 Email.sendKeys(email);
		 PassWord.sendKeys(password);
		 SubmitButton.click();
		 
		 
	 }
	
	
}
