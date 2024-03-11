package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.ARB_Sales;
import testPageObjects.LoginPage;

public class Tc_010_ARBSales extends BaseClass {

	

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
	public void Com_Sales() throws Exception {
		ARB_Sales Arb=new ARB_Sales(driver);
		
		Arb.ClickonTransactions();
		Arb.ClickonSales();
		Thread.sleep(2000);
		Arb.ClickonArbSales();
		Thread.sleep(2000);
		Arb.ClickOnAdd();
		Thread.sleep(2000);
		Arb.EnterSalesDate("03/11/2024");
		Thread.sleep(2000);
		Arb.SelectCustName();
		Arb.SelectPayterms();
		Arb.SelectStaff();
		Arb.Selectvehicle();
		Arb.SelectProdfromlist();
		Arb.Enterdisc("105");
		Arb.EnterQanty("100");
		Thread.sleep(2000);
		Arb.SelectBankfromlist();
		Thread.sleep(2000);
		Thread.sleep(2000);
		Arb.ClickOnFetchPrice();
		Thread.sleep(2000);
		Arb.ClickonCalculate();
		Thread.sleep(2000);
		Arb.ClickonSave();
		
		
		
		
		
		
		
}
} 
