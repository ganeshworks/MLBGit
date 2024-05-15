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
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Sr.ClickonSales();
		logg.info(getClass().getName() + " - "+"Clicked On Sales");
		Thread.sleep(2000);
		Sr.ClickonSalesReturn();
		logg.info(getClass().getName() + " - "+"Clicked On SalesReturn");
		Thread.sleep(2000);
		Sr.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Buttton");
		Thread.sleep(2000);
		Sr.EnterSaleInvNo("655466546546");
		logg.info(getClass().getName() + " - "+"Sales Invoice Number Entered");
		Sr.EnterInvoiceDate("03/11/2024");
		logg.info(getClass().getName() + " - "+"Sales Invoice Date Entered");
		Thread.sleep(2000);
		//Sr.SelectCustName();
		//logg.info(getClass().getName() + " - "+"Customer Is Selected");
		Sr.SelectPayTerms();
		logg.info(getClass().getName() + " - "+"Payment Terms Selected");
		Sr.SelectProdfromlist();
		logg.info(getClass().getName() + " - "+"Product Selected From List");
		Sr.EnterRetnQanty("100");
		logg.info(getClass().getName() + " - "+"Return Qunatity Entered");
		Sr.EnterNetWt("105");
		logg.info(getClass().getName() + " - "+"Net Weight Entered");
		Thread.sleep(2000);
		Sr.SelectBank();
		logg.info(getClass().getName() + " - "+"Bank Selected For Return The Sale");
		Sr.ClickOnFetchGst();
		logg.info(getClass().getName() + " - "+"Clicked On FetchGst Button");
		Thread.sleep(2000);
		Sr.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Thread.sleep(2000);
		Sr.ClickonSave();
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
