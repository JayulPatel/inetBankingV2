package com.guru99.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.qa.Pages.AddNewCustomerPage;
import com.guru99.qa.Pages.HomePage;
import com.guru99.qa.Pages.LoginPage;
import com.guru99.qa.Pages.NewAccountPage;
import com.guru99.qa.base.TestBase;
import com.guru99.qa.utilities.TestUtil;

public class AddNewCustomerTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewAccountPage  newaccountPage;
	AddNewCustomerPage addnewcustomerpage;
	
	String SheetName = "AddCustomer";
	
	public AddNewCustomerTest() {
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
      addnewcustomerpage = homePage.ClickOnAddNewCustomerlink();
	}
	
@Test(priority=1)
    public void verifyaddnewcustomerlable() {
	Assert.assertTrue(addnewcustomerpage.verifyaddnewcustomerlable(), "add new customer lable is missin on the page");	
    }

@DataProvider
public Object[][] getGuru99TestData()
{
	Object data[][] = TestUtil.getTestData(SheetName);
	return data;
	
}


@Test(priority=2, dataProvider="getGuru99TestData")
public void validateAddnewCustomer(String CustomerName, String DOB, String Address, String City, String State, String PinNumber,String ContactNumber, String Email, String PassWord)
{
	//addnewcustomerpage.AddnewCustomer("Jayul Patel", "1996/05/09", "dgsajgfwfjsadhvcbsagdzgbxdjhgd","Vaughn" , "ON", "L3S3X6","4372218747" ,"jayulpatel9@gmail.com" ,"ghdvfjasdgskfdhfsdkjsh");
	addnewcustomerpage.AddnewCustomer(CustomerName, DOB, Address, City, State, PinNumber, ContactNumber, Email, PassWord);
	
}

		
	@AfterMethod
	public void tearDown() {
		driver.quit();	
  }
	
}
