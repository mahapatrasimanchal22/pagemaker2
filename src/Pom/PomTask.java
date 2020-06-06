package Pom;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTask {

	public WebDriver drive;
	
	@FindBy(id="container_tasks")
	private WebElement clickTask;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement clickAddnew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement Enterusername;
	
	@FindBy(xpath="(//div[.='  Create Customer'])[2]")
	private WebElement Createcustomer;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement clickcancel;
	
	
	public PomTask(WebDriver drive) {
		this.drive=drive;
	PageFactory.initElements(drive, this);
	}

	public void clicktask() throws InterruptedException  {
		clickTask.click();
		clickAddnew.click();
		Thread.sleep(5000);
		Newcustomer.click();
		Thread.sleep(5000);
		Enterusername.sendKeys("simanchal");
		//Createcustomer.click();
		Thread.sleep(3000);
		clickcancel.click();
		
		Alert alt =drive.switchTo().alert();
		alt.accept();

	}
}
