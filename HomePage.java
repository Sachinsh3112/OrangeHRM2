package com.orangehr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	@FindBy(xpath="(//a/..)[3]")
	private WebElement PIM;
	
	 @FindBy(xpath="(//i)[4]")
	 private WebElement drop;
	 
	 @FindBy(xpath="//a[text()='Logout']")
	 private WebElement logt;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void SetLogout() {
		drop.click();
		logt.click();
	}
	public void PIm() throws InterruptedException {
		Thread.sleep(2000);
		PIM.click();
	}
	
}


