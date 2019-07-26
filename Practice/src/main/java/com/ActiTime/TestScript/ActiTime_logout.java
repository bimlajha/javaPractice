package com.ActiTime.TestScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ActiTime.ObjectRepo.Logout_Link;
import com.ActiTime.genericLib.BaseClass;

public class ActiTime_logout extends BaseClass {

	@Test
	public void logout()
	
	{
		Logout_Link log=PageFactory.initElements(driver, Logout_Link.class);
		
		log.getLogOut();
		
	}
}
