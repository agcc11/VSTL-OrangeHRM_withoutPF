package POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	
	
	
	// Page object Model
	By loc_inp_username = By.xpath("");
	

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement AddEmployee;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middlename;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebtn;
	
	
	public void clickonPIM()
	{
		PIM.click();
	}
	
	public void ClickOnAddEmployee()
	{
		AddEmployee.click();
	}
	
	public void EnterNamedetails()
	{
		Firstname.sendKeys("john");
		middlename.sendKeys("mark");
		lastname.sendKeys("will");
		savebtn.click();
	}
	public PIMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
