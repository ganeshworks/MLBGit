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
import testPageObjects.Itv_Rc;
import testPageObjects.LoginPage;

public class Tc_014_Itv_Rc_Transactions extends BaseClass {

	

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
	public void ItvRc() throws Exception {
		
		Itv_Rc Itv=new Itv_Rc(driver);
		
		Itv.ClickonTransactions();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Itv.ClickonNcDbc();
		logg.info(getClass().getName() + " - "+"Clicked On Main NcDbc");
		Thread.sleep(2000);
		Itv.ClickonItvRcSub();
		logg.info(getClass().getName() + " - "+"Clicked On ITV/RC");
		Thread.sleep(2000);
		Itv.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		//Itv.EnterInvoiceDate("03/11/2024");
		Thread.sleep(2000);
		Itv.SelectStaffName();
		logg.info(getClass().getName() + " - "+"Selected Staff For Responsible");
		Itv.EnterCustName("Veramasa");
		logg.info(getClass().getName() + " - "+"Customer Name Entered");
		Thread.sleep(2000);
		Itv.SelectItem();
		logg.info(getClass().getName() + " - "+"Item Selected From DropDown");
		Itv.EnterNoOfCyl("10");
		logg.info(getClass().getName() + " - "+"Entered Number Of Cylinders");
		Thread.sleep(2000);
		Itv.EnterNoOfReg("05");
		logg.info(getClass().getName() + " - "+"Entered NUMBER OF REGULATORS");
		Itv.EnterCylDep("5");
		logg.info(getClass().getName() + " - "+"Entered CYLINDER DEPOSIT");
		Thread.sleep(2000);
		Itv.EnterRegDep("01");
		logg.info(getClass().getName() + " - "+"Entered REGULATOR DEPOSIT");
		Itv.SelectAdminCharge();
		logg.info(getClass().getName() + " - "+"Selected Admin Charges ");
		Thread.sleep(2000);
		Itv.ClickOnFetchDepAndCharges();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Deposit And Charges Button");
		Itv.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Itv.ClickonSave();
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
