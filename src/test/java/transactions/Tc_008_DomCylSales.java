package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
			logg.info(getClass().getName() + " - "+"Agency Id Entered");
			l.password(password);
			logg.info(getClass().getName() + " - "+"Password Entered");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			l.submitclick();
			logg.info(getClass().getName() + " - "+"Clicked On Submit");
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
			logg.info(getClass().getName() + " - "+"Clicked On Transactions");
			Dom.ClickonSales();
			logg.info(getClass().getName() + " - "+"Clicked On Sales");
			Thread.sleep(2000);
			Dom.ClickonDomSales();
			logg.info(getClass().getName() + " - "+"Clicked On Domestic Sales");
			Thread.sleep(2000);
			Dom.ClickOnAdd();
			logg.info(getClass().getName() + " - "+"Clicked On Add Button");
			Thread.sleep(2000);
			Dom.EnterSalesDate(Todaydate);
			logg.info(getClass().getName() + " - "+"Entered Sales Date");
			Thread.sleep(2000);
			Dom.SelectCustName();
			logg.info(getClass().getName() + " - "+"Customer Selected");
			Dom.SelectPayterms();
			logg.info(getClass().getName() + " - "+"Payment Terms Selected");
			Dom.SelectProdfromlist();
			logg.info(getClass().getName() + " - "+"Selected Product From List");
			Dom.Enterdisc("105");
			logg.info(getClass().getName() + " - "+"Discount Entered");
			Dom.EnterQanty("100");
			logg.info(getClass().getName() + " - "+"Quantity Entered");
			Thread.sleep(2000);
			Dom.EnterDigi("1");
			logg.info(getClass().getName() + " - "+"Digi Cylinders Count Entered");
			Dom.EnterPsv("1");
			logg.info(getClass().getName() + " - "+"Psv Cylinders Count Entered");
			Dom.SelectDeliverdBy();
			logg.info(getClass().getName() + " - "+"Selected Person By Whom Delivered By ");
			//Dom.SelectBankfromlist();
			logg.info(getClass().getName() + " - "+"Selected Bank Account To Credit Amount");
			Thread.sleep(2000);
			Dom.SelectAreaCodefromlist();
			logg.info(getClass().getName() + " - "+"Selected Area Code For Delivery");
			Dom.ClickOnFetchInvoice();
			logg.info(getClass().getName() + " - "+"Clicked On Fetch Invoice Number Button");
			Thread.sleep(2000);
			Dom.ClickOnFetchPrice();
			logg.info(getClass().getName() + " - "+"Clicked On Fetch Price Button");
			Thread.sleep(2000);
			Dom.ClickonCalculate();
			logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
			Thread.sleep(2000);
			Dom.ClickonSave();
			logg.info(getClass().getName() + " - "+"Clicked On Save Button");
			
			
}
		@AfterMethod(enabled = false)
		public void Aftermthd(ITestResult Tr) throws Exception {
			if (ITestResult.FAILURE == Tr.getStatus()) {
				Thread.sleep(2000);
				String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File target = new File(
						System.getProperty("user.dir") + "/SS/" + Tr.getName() + timestamp + ".png");
				FileUtils.copyFile(source, target);
			}
		}
}