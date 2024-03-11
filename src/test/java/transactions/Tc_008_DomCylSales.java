package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.Dom_Cyl_Sales;
import testPageObjects.LoginPage;
import testPageObjects.Purchase_Orders;

public class Tc_008_DomCylSales extends BaseClass {

	

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
		public void Dom_Sales() throws Exception {
			Dom_Cyl_Sales Dom=new Dom_Cyl_Sales(driver);
			
			Dom.ClickonTransactions();
			Dom.ClickonSales();
			Thread.sleep(2000);
			Dom.ClickonDomSales();
			Thread.sleep(2000);
			Dom.ClickOnAdd();
			Thread.sleep(2000);
			Dom.EnterSalesDate("03/11/2024");
			Thread.sleep(2000);
			Dom.SelectCustName();
			Dom.SelectPayterms();
			Dom.SelectProdfromlist();
			Dom.Enterdisc("105");
			Dom.EnterQanty("100");
			Thread.sleep(2000);
			Dom.EnterDigi("1");
			Dom.EnterPsv("1");
			Dom.SelectDeliverdBy();
			Dom.SelectBankfromlist();
			Thread.sleep(2000);
			Dom.SelectAreaCodefromlist();
			Dom.ClickOnFetchInvoice();
			Thread.sleep(2000);
			Dom.ClickOnFetchPrice();
			Thread.sleep(2000);
			Dom.ClickonCalculate();
			Thread.sleep(2000);
			Dom.ClickonSave();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}