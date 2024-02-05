package com.orangehr.in;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehr.pom.HomePage;
import com.orangehr.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	@BeforeClass
	public void OpenBrowser(){
		Reporter.log("OpenBrowser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@BeforeMethod
	public void Login() throws IOException, InterruptedException {
		Reporter.log("Login", true);
		 fis=new FileInputStream("./Data/OrDemo.txt");
		 p=new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		driver.get(URL);
		String UN = p.getProperty("un");
		String PWD = p.getProperty("pwd");
		LoginPage l=new LoginPage(driver);
		l.SetLogin(UN,PWD);
	}

	@AfterMethod
	public void logOut() throws InterruptedException {
		Reporter.log("LogOut", true);
		HomePage h=new HomePage(driver);
		h.SetLogout();
			
	
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("CloseBrowser", true);
		driver.quit();
	}}

