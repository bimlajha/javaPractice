package com.ActiTime.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_POM_Class {
	
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	public void getUserName(String userName)
	{
		un.sendKeys(userName);
	}
	public void getPasswor(String password)
	{
		pass.sendKeys(password);
	}
	public void getLoginBtn()
	{
		loginbtn.click();
	}

}
