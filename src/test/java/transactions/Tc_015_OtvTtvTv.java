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
import testPageObjects.Otv_Ttv_Tv;

public class Tc_015_OtvTtvTv  extends BaseClass {

	

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
	public void OtvTtvTv() throws Exception {
		
		Otv_Ttv_Tv Otv=new Otv_Ttv_Tv(driver);
		
		Otv.ClickonTransactions();
		logg.info(getClass().getName() + " - "+"Clicked On Transactions");
		Thread.sleep(2000);
		Otv.ClickonNcDbc();
		logg.info(getClass().getName() + " - "+"Clicked On NcDbc Main");
		Thread.sleep(2000);
		Otv.ClickonOtvTTvTvSub();
		logg.info(getClass().getName() + " - "+"Clicked On OtvTTvTv Module");
		Thread.sleep(2000);
		Otv.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		//Otv.EnterInvoiceDate("03/11/2024");
		Thread.sleep(2000);
		Otv.SelectStaffName();
		logg.info(getClass().getName() + " - "+"Selected Staff Name For Responsible");
		Otv.EnterCustName("Veramasa");
		logg.info(getClass().getName() + " - "+"Customer Name Entered");
		Thread.sleep(2000);
		Otv.SelectCatgry();
		logg.info(getClass().getName() + " - "+"Selected Category From Drop Down");
		Otv.SelectItem();
		logg.info(getClass().getName() + " - "+"Product Selected From DropDown");
		Otv.EnterNoOfCyl("10");
		logg.info(getClass().getName() + " - "+"Number Of Cylinders Entered");
		Thread.sleep(2000);
		Otv.EnterNoOfReg("05");
		logg.info(getClass().getName() + " - "+"Number Of Regulators Entered");
		Otv.EnterCylDep("5");
		logg.info(getClass().getName() + " - "+"Number Of Cylinder Deposits Entered");
		Thread.sleep(2000);
		Otv.EnterRegDep("01");
		logg.info(getClass().getName() + " - "+"Number Of Regulator Deposits Entered");
		Thread.sleep(2000);
		Otv.EnterImpssAmnt("10");
		logg.info(getClass().getName() + " - "+"Impress Amount Entered");
		Otv.SelectAdminCharge();
		logg.info(getClass().getName() + " - "+"Admin Charges Selected");
		Thread.sleep(2000);
		Otv.ClickOnFetchDepAndCharges();
		logg.info(getClass().getName() + " - "+"Clicked On Fetch Deposit And Charges Button");
		Otv.ClickonCalculate();
		logg.info(getClass().getName() + " - "+"Clicked On Calculate Button");
		Otv.ClickonSave();
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