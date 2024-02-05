package com.orangehr1.generic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehr.in.BaseClass;
import com.orangehr.pom.HomePage;
import com.orangehr.pom.PIMPage;

public class CreateCustomer extends BaseClass {

	@Test
public void CreateCustomr() throws Exception {
		Reporter.log("CreateNewEmp", true);
		
		
		
		HomePage h=new HomePage(driver);
		h.PIm();
		PIMPage p=new PIMPage(driver);
		p.Add().click();
		FileInputStream fis=new FileInputStream("./Data/EmpData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String FN=wb.getSheet("EmpDatas").getRow(0).getCell(0).getStringCellValue();
		String MN=wb.getSheet("EmpDatas").getRow(0).getCell(1).getStringCellValue();
		String LN=wb.getSheet("EmpDatas").getRow(0).getCell(2).getStringCellValue();
		String UN=wb.getSheet("EmpDatas").getRow(0).getCell(3).getStringCellValue();
		String PWD=wb.getSheet("EmpDatas").getRow(0).getCell(4).getStringCellValue();
		
		p.fn().sendKeys(FN);
		p.mn().sendKeys(MN);
		p.ln().sendKeys(LN);
		p.img().click();
		
Robot r=new Robot();
File f=new File("./Data/Screenshot 2024-01-25 132324.png");
String path=f.getAbsolutePath();
StringSelection se=new StringSelection(path);
Thread.sleep(2000);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

		p.checkbox().click();
		p.UserName().sendKeys(UN);
		p.Password().sendKeys(PWD);
		p.CPassword().sendKeys(PWD);
		p.Save().click();
		Thread.sleep(5000);
		p.Emplist().click();
		Thread.sleep(2000);
		p.Searchtext().sendKeys(FN);
		p.Search().click();
		Thread.sleep(2000);
		p.delete().click();
		Thread.sleep(2000);
		p.YesSir().click();
		
	

	}
	}
