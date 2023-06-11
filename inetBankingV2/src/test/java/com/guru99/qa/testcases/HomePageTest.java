package com.guru99.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.qa.Pages.AddNewCustomerPage;
import com.guru99.qa.Pages.HomePage;
import com.guru99.qa.Pages.LoginPage;
import com.guru99.qa.Pages.NewAccountPage;
import com.guru99.qa.base.TestBase;
import com.guru99.qa.utilities.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewAccountPage  newaccountPage;
	AddNewCustomerPage addnewcustomerpage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	
	  testUtil = new TestUtil();
	  newaccountPage = new NewAccountPage();
	  addnewcustomerpage = new AddNewCustomerPage();
      loginPage = new LoginPage();
      homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
      
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Guru99 Bank Manager HomePage","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyGuru99SiteLogoTest() {
		//testUtil.switchtoFrame();
		Assert.assertTrue(homePage.verifyGuru99SiteLogo());
	}
	
	@Test(priority=3)
	public void verifyTest() {
		//testUtil.switchtoFrame();
		newaccountPage  = homePage.ClickOnNewAccountLink();
	}
	
	@Test(priority=4)
	public void verifyAddCustomerTest() {
		addnewcustomerpage = homePage.ClickOnAddNewCustomerlink();
		
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
