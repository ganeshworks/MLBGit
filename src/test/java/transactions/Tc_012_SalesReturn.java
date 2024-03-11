package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;
import testPageObjects.Sales_Return;

public class Tc_012_SalesReturn extends BaseClass {

	

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
	public void SalesReturn() throws Exception {
		
		Sales_Return Sr=new Sales_Return(driver);
		
		Sr.ClickonTransactions();
		Sr.ClickonSales();
		Thread.sleep(2000);
		Sr.ClickonSalesReturn();
		Thread.sleep(2000);
		Sr.ClickOnAdd();
		Thread.sleep(2000);
		Sr.EnterSaleInvNo("655466546546");
		Sr.EnterInvoiceDate("03/11/2024");
		Thread.sleep(2000);
		Sr.SelectCustName();
		Sr.SelectPayTerms();
		Sr.SelectProdfromlist();
		Sr.EnterRetnQanty("100");
		Sr.EnterNetWt("105");
		Thread.sleep(2000);
		Sr.SelectBank();
		Sr.ClickOnFetchGst();
		Thread.sleep(2000);
		Sr.ClickonCalculate();
		Thread.sleep(2000);
		Sr.ClickonSave();
		
		
		
		
		
		
		
}}
