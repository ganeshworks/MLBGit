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
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Dc.ClickonSales();
		logg.info(getClass().getName() + " - "+"Clicked On Sales");
		Thread.sleep(2000);
		Dc.ClickonDc();
		logg.info(getClass().getName() + " - "+"Clicked On Delivery Challan");
		Thread.sleep(2000);
		Dc.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Dc.EnterDcDate("03/11/2024");
		logg.info(getClass().getName() + " - "+"Delivery Challan Date Entered");
		Thread.sleep(2000);
		Dc.SelectCustName();
		logg.info(getClass().getName() + " - "+"Customer Was Selected");
		Dc.SelectStaff();
		logg.info(getClass().getName() + " - "+"Staff Selected For Responsible");
		Dc.Selectvehicle();
		logg.info(getClass().getName() + " - "+"Vehicle Selected For Transportation");
		Dc.EnterInvNo("64546654646");
		logg.info(getClass().getName() + " - "+"Invoice Number Entered");
		Dc.EnterDcMode("Oneway");
		logg.info(getClass().getName() + " - "+"Entered Mode Of Delivery");
		Dc.EnterDcInst("NA");
		logg.info(getClass().getName() + " - "+"Delivery Instructions Entered");
		Dc.SelectProdfromlist();
		logg.info(getClass().getName() + " - "+"Product Selected From List");
		Dc.EnterUnitPrice("105");
		logg.info(getClass().getName() + " - "+"Unit Price Entered");
		Dc.EnterQanty("100");
		logg.info(getClass().getName() + " - "+"Quantity Entered");
		Thread.sleep(2000);
		Dc.ClickOnFetchValue();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Value Button");
		Thread.sleep(2000);
		Dc.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Thread.sleep(2000);
		Dc.ClickonSave();
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
