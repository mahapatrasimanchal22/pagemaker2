package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class PomaActitime {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//label[.='Keep me logged in']")
	private WebElement keepmeloggedin;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement Login;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement Forgot;
	
	
	public PomaActitime(WebDriver drive) {
		PageFactory.initElements(drive, this);
	}
	
	
	public void loginprocces(){
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		keepmeloggedin.click();
		Login.click();
	}
	
}
