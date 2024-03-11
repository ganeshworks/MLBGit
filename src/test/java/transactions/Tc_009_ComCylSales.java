package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.Com_Cyl_Sales;
import testPageObjects.LoginPage;

public class Tc_009_ComCylSales extends BaseClass {

	

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
		Com_Cyl_Sales Com=new Com_Cyl_Sales(driver);
		
		Com.ClickonTransactions();
		Com.ClickonSales();
		Thread.sleep(2000);
		Com.ClickonComSales();
		Thread.sleep(2000);
		Com.ClickOnAdd();
		Thread.sleep(2000);
		Com.EnterSalesDate("03/11/2024");
		Thread.sleep(2000);
		Com.SelectCustName();
		Com.SelectPoNo();
		Com.SelectPayterms();
		Com.Selectvehicle();
		Com.SelectProdfromlist();
		Com.Enterdisc("105");
		Com.EnterQanty("100");
		Thread.sleep(2000);
		Com.EnterPsv("1");
		Com.EnterEmptiesRecvd("1");
		Com.SelectDeliverdBy();
		Com.SelectBankfromlist();
		Thread.sleep(2000);
		Com.SelectAreaCodefromlist();
		Com.ClickOnFetchInvoice();
		Thread.sleep(2000);
		Com.ClickOnFetchGst();
		Thread.sleep(2000);
		Com.ClickonCalculate();
		Thread.sleep(2000);
		Com.ClickonSave();
		
		
		
		
		
		
		
}
} 