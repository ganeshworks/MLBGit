package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testPageObjects.LoginPage;
import testPageObjects.Set_CreditLimit;

	public class Tc_004_SetCreditLimit extends BaseClass{

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
	@Test(enabled = false)
	public void SetCreditLimit() throws Exception {
		Set_CreditLimit Sc=new Set_CreditLimit(driver);
		
		Sc.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sc.ClickonSetCreditLimit();
		logg.info(getClass().getName() + " - "+"Clicked On SetCreditLimit");
		Thread.sleep(2000);
		Sc.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Entered Pin");
		Sc.ClickonSubmitPin();
		logg.info(getClass().getName() + " - "+"Clicked On Submit Pin");
		Thread.sleep(2000);
		Sc.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Sc.SelectCust();
		logg.info(getClass().getName() + " - "+"Selected Customer");
		Sc.EnterCreditLimit("16545446");
		logg.info(getClass().getName() + " - "+"Credit Limit Entered");
		Sc.SelectControl1();
		logg.info(getClass().getName() + " - "+"Control Selected");
		Sc.EnterCreditDay("180");
		logg.info(getClass().getName() + " - "+"Credit Days Entered");
		Sc.SelectControl2();
		logg.info(getClass().getName() + " - "+"Control2 Selected");
		Thread.sleep(2000);
		Sc.SelectFromProdList();
		logg.info(getClass().getName() + " - "+"Selected Product");
		Sc.EnterDiscount("105");
		logg.info(getClass().getName() + " - "+"Discount Entered");
		Sc.EnterDate("03/05/2024");
		logg.info(getClass().getName() + " - "+"Date Entered");
		
		Sc.ClickOnSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		
		Thread.sleep(2000);
		
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Set Credit Limit- Added Customer- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}
	@Test(priority = 2)
	public void AddMultipleProdDiscounts() throws Exception {
		Set_CreditLimit Sc=new Set_CreditLimit(driver);
		
		Sc.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sc.ClickonSetCreditLimit();
		logg.info(getClass().getName() + " - "+"Clicked On SetCreditLimit");
		Thread.sleep(2000);
		Sc.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Entered Pin");
		Sc.ClickonSubmitPin();
		logg.info(getClass().getName() + " - "+"Clicked On Submit Pin");
		Thread.sleep(2000);
		Sc.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Sc.SelectCust();
		logg.info(getClass().getName() + " - "+"Selected Customer");
		Sc.EnterCreditLimit("16545446");
		logg.info(getClass().getName() + " - "+"Credit Limit Entered");
		Sc.SelectControl1();
		logg.info(getClass().getName() + " - "+"Control Selected");
		Sc.EnterCreditDay("180");
		logg.info(getClass().getName() + " - "+"Credit Days Entered");
		Sc.SelectControl2();
		logg.info(getClass().getName() + " - "+"Control2 Selected");
		Thread.sleep(2000);
		Sc.SelectFromProdList();
		logg.info(getClass().getName() + " - "+"Selected Product");
		Sc.EnterDiscount("105");
		logg.info(getClass().getName() + " - "+"Discount Entered");
		Sc.EnterDate("03/05/2024");
		logg.info(getClass().getName() + " - "+"Date Entered");
		
		//For 2nd Product
		
		Sc.SelectFromProdList2();
		logg.info(getClass().getName() + " - "+"Selected Product");
		Sc.EnterDiscount2("105");
		logg.info(getClass().getName() + " - "+"Discount Entered");
		Sc.EnterDate2("03/05/2024");
		logg.info(getClass().getName() + " - "+"Date Entered");
		
		Sc.ClickOnSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		
		Thread.sleep(2000);
		
		
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
