package com.orangehr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PIMPage {
	
	@FindBy(xpath="(//button)[6]")
	private WebElement Add;

	
	@FindBy (name="firstName")
	private WebElement fn;
	
	@FindBy(name="middleName")
	private WebElement mn;
	
	@FindBy(name="lastName")
	private WebElement ln;
	
	@FindBy(xpath="(//input/.)[6]")
	private WebElement emp;
	
	@FindBy(xpath="(//img)[4]")
	private WebElement img;
	
	@FindBy(xpath="(//span/../span)[16]")
	private WebElement checkbox;
	
	@FindBy(xpath="(//input)[8]")
	private WebElement UserName;
	
	
	@FindBy(xpath="(//input)[11]")
	private WebElement Password;
	
	@FindBy(xpath="(//input)[12]")
	private WebElement CPassword;
	
	@FindBy(xpath="(//button)[5]")
	private WebElement Save;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement Emplist;

	@FindBy(xpath="(//input)[2]")
	private WebElement Searchtext;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement Search;
	
	@FindBy(xpath="(//button)[7]")
	private WebElement delete;
	
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement YesSir;
	
	public PIMPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public WebElement Add() {
		return Add;
	}
	public WebElement fn() {
		return fn;
	}
	public WebElement mn() {
		return mn;
	}
	public WebElement ln() {
			return ln;
		}
	public WebElement emp() {
		return emp;
	}
	public WebElement img() {
		return img;
	}
	public WebElement checkbox() {
		return checkbox;
	}
	public WebElement UserName() {
		return  UserName;
	}
	public WebElement radio() {
		return radio();
	}
	public WebElement Password() {
		return Password;
	}
	public WebElement CPassword() {
		return CPassword;
	}
	public WebElement Save() {
		return Save;
	}
	public WebElement Emplist() {
		return Emplist;
	}
	
	public WebElement Searchtext() {
		return Searchtext;
	}
	
	public WebElement Search() {
		return Search;
	}
	
	public WebElement delete() {
		return delete;
	}
	
	public WebElement YesSir() {
		return YesSir;
	}
}
