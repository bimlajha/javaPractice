package com.ActiTime.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertyFile(String Key) throws IOException
	{
		FileInputStream file = new FileInputStream("./CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(file);
		String value=pobj.getProperty(Key);
		
		return value;
	}
	public void getDatafromExcelSheet(String Key) throws FileNotFoundException
	{
		FileInputStream file= new FileInputStream("./testing.xlsx");
		
	}
	
	
}
