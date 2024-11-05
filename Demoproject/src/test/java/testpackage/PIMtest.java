package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.LoginPage;
import POMPackage.PIMPage;

public class PIMtest extends BaseClass {

	
	PIMPage pm;
	LoginPage lp;
	@BeforeMethod
	public void Logintest()
	{
		lp=new LoginPage(driver);
		lp.Enterusername();
		lp.Enterpassword();
		lp.ClickOnLoginBtn();
	}
	
	@Test
	public void PIMtest()
	{
		pm=new PIMPage(driver);
		pm.clickonPIM();
		pm.ClickOnAddEmployee();
		pm.EnterNamedetails();
		
	}
	
	
	
}
