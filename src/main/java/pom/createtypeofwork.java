package pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AutoConstant;
import generic.ExcelLibrary;

public class createtypeofwork implements AutoConstant
{
	public WebDriver driver;
	//@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	//private WebElement settings;
	
	//@FindBy(xpath = "//a[.='Types of Work']")
	//private WebElement typeofwork;
	
	@FindBy(xpath = "//span[@unselectable='on']")
	private WebElement createtypeofwork;
	
	@FindBy(id = "name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	
	public createtypeofwork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //calls the current class object
	}
	
	
	public void createtyeofwork() throws InterruptedException, IOException
	{
		//settings.click();
		//Thread.sleep(2000);
		//typeofwork.click();
		//Thread.sleep(1000);
		createtypeofwork.click();
		Thread.sleep(1000);
		name.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 5, 0));
		Thread.sleep(1000);
		submit.click();
		
	}
	
}
