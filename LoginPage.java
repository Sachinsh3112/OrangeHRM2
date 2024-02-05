package com.orangehr.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(xpath="(//p/../p)[4]")
	private WebElement text;
	
	@FindBy(xpath="(//input)[2]")
	private WebElement Email;

	@FindBy(xpath="(//input)[3]")
	private WebElement Pass;

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement lgbtn;

	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void SetLogin(String UN,String PWD ) throws InterruptedException {
		boolean Text = text.isDisplayed();
		Assert.assertTrue(Text);
	Email.sendKeys(UN);
	Thread.sleep(2000);
	Pass.sendKeys(PWD);
	Thread.sleep(2000);
	lgbtn.click();
}
}

