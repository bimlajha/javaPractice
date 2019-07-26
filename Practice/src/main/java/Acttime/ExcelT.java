package Acttime;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelT {

	public static void main(String[] args) throws IOException {

HSSFWorkbook hs= new HSSFWorkbook();
//XSSFWorkbook hs1= new XSSFWorkbook();
hs.createSheet("heel");
hs.createSheet("feel");
//hs.write(new File("wemar.xls"));

	}

}
