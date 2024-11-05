package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	
	public void Enterusername()
	{
		username.sendKeys("Admin");
	}
	
	
	public void Enterpassword()
	{
		password.sendKeys("admin123");
	}
	
	public void ClickOnLoginBtn()
	{
		loginbtn.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
