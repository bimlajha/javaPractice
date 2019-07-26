package com.ActiTime.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.ActiTime.ObjectRepo.*;

public class BaseClass {
	
	FileUtility flib= new FileUtility();
	
	public WebDriver driver;
	@BeforeSuite
	public void configBS()
	{
		System.out.println("---------db Connection----------");
	}
	@BeforeClass
	public void configBC() throws IOException
	{
		System.out.println("-------------BeforeClass--------------------");
		String browser = flib.getDataFromPropertyFile("browser");
		if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		System.out.println("-----------Login Method------------");
		String url=flib.getDataFromPropertyFile("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*Login_POM_Class login= PageFactory.initElements(driver,Login_POM_Class.class);
		String username= flib.getDataFromPropertyFile("username");
		login.getUserName(username);
		String password =flib.getDataFromPropertyFile("password");
		login.getPasswor(password);
		login.getLoginBtn();
		*/
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("--------------Logout Method-----------------");
		//Logout_Link logout= PageFactory.initElements(driver,Logout_Link.class);
		driver.close();
		
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("-------------Close Browser---------------");
		//driver.close();
	}
	public void configAS()
	{
		System.out.println("----------Close DataBase-----------");
	}

}
