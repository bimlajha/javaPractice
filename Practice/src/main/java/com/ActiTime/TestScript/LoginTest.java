package com.ActiTime.TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ActiTime.ObjectRepo.Login_POM_Class;
import com.ActiTime.genericLib.BaseClass;
import com.ActiTime.genericLib.FileUtility;

public class LoginTest extends BaseClass {
	
	@Test
	public void LoginActiTime() throws IOException
	
	{
		FileUtility fl = new FileUtility();
		Login_POM_Class log = new Login_POM_Class();
		log.getUserName(fl.getDataFromPropertyFile("username"));
		log.getPasswor(fl.getDataFromPropertyFile("password"));
		
		
	}

}
