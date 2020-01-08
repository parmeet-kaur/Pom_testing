package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testbasedemo.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(id="txtUsername")
	WebElement Useremail;
	
	@FindBy(id="txtPassword")
	WebElement Userpass;
	
	@FindBy(id="btnLogin")
	WebElement Loginbutton;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String Verifytitle()
	{
		
		return driver.getTitle();
	}
	
	public void Verifylogin()
	{
		Useremail.sendKeys(prop.getProperty("username"));
		Userpass.sendKeys(prop.getProperty("passord"));
		Loginbutton.click();
		driver.navigate().back();
		
	}
	
	
	
	
	
}
