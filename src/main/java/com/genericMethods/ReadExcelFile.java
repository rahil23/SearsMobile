package com.genericMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ReadExcelFile {

	public static AndroidDriver driver=null;

	public static String sDirPath = System.getProperty("user.dir");
	public static String stestdatafile = sDirPath +"\\TestData.xlsx";

	@Test
	public String[] readData(String sTestCaseid) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String sData[] = null;
		FileInputStream file=null;
		try {
			file = new FileInputStream(stestdatafile); //TODO this will give FileNotFoundException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //TODO FileInputStream is from IO package
		Workbook wb = 	(Workbook)WorkbookFactory.create(file); //TODO Workbook and WorkBookFactory is from package "apache.poi.ss.usermodel"
		//TODO WorkBook is throwing  EncryptedDocumentException, InvalidFormatException, IOException
		
		Sheet sh = wb.getSheet("TestData");  //TODO Sheet class is from package org.apache.poi.ss.usermodel.Sheet
		int srow = sh.getLastRowNum();
		
		for(int i=1;i<=srow;i++)
		{
			if(sh.getRow(i).getCell(0).toString().equals(sTestCaseid))
			{
				int scell = sh.getRow(i).getLastCellNum();
				sData=new String[scell];
				for (int j=0;j<scell;j++)
				{
					sData[j]=sh.getRow(i).getCell(j).getStringCellValue();
					
				}
			}
		}
		
		
		
		return sData;
		
	}
}
