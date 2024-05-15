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
import testPageObjects.Com_Cyl_Sales;
import testPageObjects.LoginPage;

public class Tc_009_ComCylSales extends BaseClass {

	

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
	public void Com_Sales() throws Exception {
		Com_Cyl_Sales Com=new Com_Cyl_Sales(driver);
		
		Com.ClickonTransactions();
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Com.ClickonSales();
		logg.info(getClass().getName() + " - "+"Clicked On Sales");
		Thread.sleep(2000);
		Com.ClickonComSales();
		logg.info(getClass().getName() + " - "+"Clicked On Commercial Sales");
		Thread.sleep(2000);
		Com.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Com.EnterSalesDate("03/11/2024");
		logg.info(getClass().getName() + " - "+"Sales Date Entered");
		Thread.sleep(2000);
		Com.SelectCustName();
		logg.info(getClass().getName() + " - "+"Customer Is Selected");
		Com.SelectPoNo();
		logg.info(getClass().getName() + " - "+"Selected Purchase Order Number");
		Com.SelectPayterms();
		logg.info(getClass().getName() + " - "+"Payment Terms Selected");
		Com.Selectvehicle();
		logg.info(getClass().getName() + " - "+"Vehicle Selected For Transportation");
		Com.SelectProdfromlist();
		logg.info(getClass().getName() + " - "+"Product Selected From List");
		Com.Enterdisc("105");
		logg.info(getClass().getName() + " - "+"Discount Entered");
		Com.EnterQanty("100");
		logg.info(getClass().getName() + " - "+"Quantity Entered ");
		Thread.sleep(2000);
		Com.EnterPsv("1");
		logg.info(getClass().getName() + " - "+"Psv Quantity Entered");
		Com.EnterEmptiesRecvd("1");
		logg.info(getClass().getName() + " - "+"Quantity Entered For Empties Received");
		Com.SelectDeliverdBy();
		logg.info(getClass().getName() + " - "+"Selected Person By Whom Delivered By ");
		Com.SelectBankfromlist();
		logg.info(getClass().getName() + " - "+"Selected Bank Account To Credit Amount");
		Thread.sleep(2000);
		Com.SelectAreaCodefromlist();
		logg.info(getClass().getName() + " - "+"Selected Area Code For Delivery ");
		Com.ClickOnFetchInvoice();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Invoice Button");
		Thread.sleep(2000);
		Com.ClickOnFetchGst();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Gst Button");
		Thread.sleep(2000);
		Com.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Thread.sleep(2000);
		Com.ClickonSave();
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