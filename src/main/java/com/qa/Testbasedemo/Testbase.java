package com.qa.Testbasedemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	
	//constructor intialization
	public Testbase()
	{
		try
		{
			
			//FileIputStream class is use to read data from the file
			FileInputStream ip = new FileInputStream("D:\\Slenium_Codes\\org.OrangeliveHRM.emp\\src\\main\\java\\com\\OrangeHRM\\configuration\\Config.properties");
			prop = new Properties();//create object of proprties
			prop.load(ip);//to recognize properties
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		
	}
	
	//we are makin this method static so dat we need not to create an object of this method and it can be called directly with the classname.
	public static void Intialization()
	{
		
		String browser_name=prop.getProperty("browser");
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));//fetching data from prperty file
			driver = new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
}
