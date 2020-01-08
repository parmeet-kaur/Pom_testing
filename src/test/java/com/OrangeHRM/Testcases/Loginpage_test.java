package com.OrangeHRM.Testcases;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.OrangeHRM.pages.Loginpage;
import com.qa.Testbasedemo.*;
public class Loginpage_test extends Testbase {
	
	
	//This is Login Page Test
	Loginpage loginpage;
	public Loginpage_test()
	{
		
		super();
	}
	
@BeforeSuite
public void Setup()
{
	Intialization();	
	loginpage = new Loginpage();
	
}

@Test
public void Verifytitletest()
{
String title=loginpage.Verifytitle();
Assert.assertEquals(title,"OrangeHRM" );
	
	
}
@Test
public void Verifylogintest()
{
	
loginpage.Verifylogin();
//driver.navigate().back();
}

@AfterSuite
public void Teardown()
{
	driver.quit();

}


}
