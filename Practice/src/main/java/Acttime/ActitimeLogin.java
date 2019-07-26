package Acttime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {
		
		FileInputStream file = new FileInputStream("./testing.xlsx");
		Workbook book= WorkbookFactory.create(file);
	  Sheet	sheet = book.getSheet("testsheet");
	 Row row = sheet.getRow(0);
	// Row row1= sheet.getRow(0);
	 Cell cell= row.getCell(1);
	 String pass= cell.getStringCellValue();
	Cell cell1 = row.getCell(0);
	String username= cell1.getStringCellValue();
	System.out.println(username);
	System.out.println(pass);
	WebDriver driver= new FirefoxDriver();
	driver.get("http://localhost:8888/login.do");
	
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	
	driver.findElement(By.id("loginButton")).click();

	}

}
