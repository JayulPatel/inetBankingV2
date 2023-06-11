package com.guru99.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.Pages.HomePage;
import com.guru99.qa.Pages.LoginPage;
import com.guru99.qa.base.TestBase;
import com.guru99.qa.utilities.TestUtil;

public class LoginPageTest extends TestBase{
       
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
      loginPage = new LoginPage();
      
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");	
	}
	
	@Test(priority=2)
	public void Guru99LogImageTest() {
		boolean flag = loginPage.validateGuru99Logo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
