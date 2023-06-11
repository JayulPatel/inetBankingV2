package com.guru99.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory
	
	@FindBy(name="uid")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement Loginbtn;
	
	@FindBy(xpath="//h2[@class='barone']")
	WebElement Guru99Logo;
	
	//Initializing the Page Objects:
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
 }
	
	//Actions
	 
	 public String ValidateLoginPageTitle() {
		 return driver.getTitle();
	 }
	 
	 public boolean validateGuru99Logo() {
		 return Guru99Logo.isDisplayed();
	 }
	 
	 public HomePage login(String un, String pwd) {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 Loginbtn.click();
		 
		 return new HomePage();
	 }
	

}
