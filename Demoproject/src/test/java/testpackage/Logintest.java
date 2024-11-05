package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.LoginPage;

public class Logintest extends BaseClass{

	LoginPage lp;
	
	@Test
	public void Logintest()
	{
		lp=new LoginPage(driver);
		lp.Enterusername();
		lp.Enterpassword();
		lp.ClickOnLoginBtn();
	}
	
	
	
}
