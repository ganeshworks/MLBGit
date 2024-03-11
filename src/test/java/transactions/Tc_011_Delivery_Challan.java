package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.Delivery_Challan;
import testPageObjects.LoginPage;

public class Tc_011_Delivery_Challan extends BaseClass {

	

	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);

		l.AgencyId(username);
		logg.info("Agencyid Entered");
		l.password(password);
		logg.info("Password Entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.submitclick();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*
		 * logg.info("Clicked On Submit"); l.ClickOnProfile();
		 */

		/*
		 * logg.info("Clicked On Profile"); driver.manage().timeouts().implicitlyWait(5,
		 * TimeUnit.SECONDS);
		 * 
		 * l.ClickOnSinout(); logg.info("Clicked On Signout");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * l.ClickingOnSinout(); logg.info("Confirm For Signout");
		 */

	}
	@Test(priority = 2)
	public void Delivery_Challan() throws Exception {
		
		Delivery_Challan Dc=new Delivery_Challan(driver);
		
		Dc.ClickonTransactions();
		Dc.ClickonSales();
		Thread.sleep(2000);
		Dc.ClickonDc();
		Thread.sleep(2000);
		Dc.ClickOnAdd();
		Thread.sleep(2000);
		Dc.EnterDcDate("03/11/2024");
		Thread.sleep(2000);
		Dc.SelectCustName();
		Dc.SelectStaff();
		Dc.Selectvehicle();
		Dc.EnterInvNo("64546654646");
		Dc.EnterDcMode("Oneway");
		Dc.EnterDcInst("NA");
		Dc.SelectProdfromlist();
		Dc.EnterUnitPrice("105");
		Dc.EnterQanty("100");
		Thread.sleep(2000);
		Dc.ClickOnFetchValue();
		Thread.sleep(2000);
		Dc.ClickonCalculate();
		Thread.sleep(2000);
		Dc.ClickonSave();
		
		
		
		
		
		
		
}
} 
