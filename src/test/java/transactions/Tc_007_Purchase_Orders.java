 package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;
import testPageObjects.Purchase_Orders;

public class Tc_007_Purchase_Orders extends BaseClass {

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
	public void Purchase_Order() throws Exception {
		Purchase_Orders Po=new Purchase_Orders(driver);
		
		Po.ClickonTransactions();
		Po.ClickonSales();
		Po.ClickonPO();
		Po.ClickOnAdd();
		Po.EnterPoNum("PO/23-0001");
		Po.EnterPODate("03/06/2024");
		Po.EnterCustName("Cust1");
		Thread.sleep(2000);
		Po.SelectStafffromlist();
		Po.EnterFootnotes("Qa");
		Thread.sleep(2000);
		Po.ClickonSaleType();
		Po.SelectProdCatfromlist();
		Po.SelectProdfromlist();
		Thread.sleep(2000);
		Po.Enterdisc("10");
		Po.EnterQanty("100");
		Thread.sleep(2000);
		Po.ClickOnFetchGst();
		Po.ClickonCalculate();
		Thread.sleep(2000);
		Po.ClickonSave();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
