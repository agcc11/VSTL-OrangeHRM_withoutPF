package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	
	@FindBy(xpath="//a[text()='Apply']")
	private WebElement Apply;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement Leavetypebox;
	
	@FindBy(xpath="//span[text()='CAN - FMLA']")
	private WebElement leavetype;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[1]")
	private WebElement fromdate;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[2]")
	private WebElement todate;
		
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement duration;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Applybtn;
	
	
	public void clickonLeave()
	{
		Leave.click();
	}
	
	public void clickonapply()
	{
		Apply.click();
	}
	
	public void selectleavetype()
	{
		Leavetypebox.click();
		leavetype.click();
	}
	
	public void selectfromandTodate()
	{
		fromdate.sendKeys("2024-25-10");
		todate.sendKeys("2024-25-10");
	}
	
	public void submitleave()
	{
		Applybtn.click();
	}
	
	
	public LeavePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
