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
import testPageObjects.Nc_Dbc_Transactions;

public class Tc_013_NcDbc_Transactions extends BaseClass {

	

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
	public void NcDbc() throws Exception {
		
		Nc_Dbc_Transactions Nc=new Nc_Dbc_Transactions(driver);
		
		Nc.ClickonTransactions();
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Nc.ClickonNcDbc();
		logg.info(getClass().getName() + " - "+"Clicked On NcDbc Main Module");
		Thread.sleep(2000);
		Nc.ClickonNcDbcSub();
		logg.info(getClass().getName() + " - "+"Clicked On NcDbc Sub Module");
		Nc.SelectPackage();
		logg.info(getClass().getName() + " - "+"Selected Package From DropDown");
		Thread.sleep(2000);
		Nc.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Nc.EnterInvoiceDate("03/12/2024");
		logg.info(getClass().getName() + " - "+"Invoice Date Entered");
		Thread.sleep(2000);
		Nc.SelectInvoiceAmt();
		logg.info(getClass().getName() + " - "+"Invoice Amount Entered");
		Nc.EnterCustName("Veramasa");
		logg.info(getClass().getName() + " - "+"Customer Name Entered");
		Thread.sleep(2000);
		Nc.EnterCashRecvd("1000");
		logg.info(getClass().getName() + " - "+"Cash Received Amount Entered");
		Nc.EnterAmtRecvdOnline("1000");
		logg.info(getClass().getName() + " - "+"Online Received Amount Entered");
		Nc.SelectBank();
		logg.info(getClass().getName() + " - "+"Bank Selected TO Credit The Amount");
		Thread.sleep(2000);
		Nc.ClickOnFetchDepAndCharges();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Deposits And Charges Button");
		Thread.sleep(2000);
		Nc.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Nc.ClickonSave();
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