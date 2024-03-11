package transactions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;
import testPageObjects.Quotations;

public class Tc_006_Quotations  extends BaseClass {

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
	public void Quotations() throws Exception {
		
		Quotations Q=new Quotations(driver);
		
		Q.ClickonTransactions();
		Q.ClickonSales();
		Q.ClickonQuotations();
		Q.EnterSecretPin("1212");
		Q.ClickonSubmitPin();
		Q.ClickOnAdd();
		Q.EnterQuteDate("03/06/2024");
		Q.EnterCustName("Cust1");
		Thread.sleep(2000);
		Q.SelectStafffromlist();
		Q.EnterFootnotes("Qa");
		Thread.sleep(2000);
		Q.ClickonSaleType();
		Q.SelectProdCatfromlist();
		Q.SelectProdfromlist();
		Thread.sleep(2000);
		Q.Enterdisc("10");
		Q.EnterQanty("100");
		Thread.sleep(2000);
		Q.ClickOnFetchGst();
		Q.ClickonCalculate();
		Thread.sleep(2000);
		Q.ClickonSave();
		
		
	}
}
