package testpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.LeavePage;
import POMPackage.LoginPage;
import POMPackage.PIMPage;

public class Leavetest extends BaseClass {

	LoginPage lp;
	LeavePage ll;
	
	@BeforeMethod
	public void Logintest() throws InterruptedException
	{
		lp=new LoginPage(driver);
		lp.Enterusername();
		lp.Enterpassword();
		lp.ClickOnLoginBtn();
		Thread.sleep(3000);
	}
	
	@Test
	public void leavetest()
	{
		ll=new LeavePage(driver);
		ll.clickonLeave();
		ll.clickonapply();
		ll.selectleavetype();
		ll.selectfromandTodate();
		ll.submitleave();
		
	}
	
}
