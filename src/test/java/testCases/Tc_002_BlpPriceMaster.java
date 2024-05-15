package testCases;

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

import testPageObjects.BLPG_PriceMaster;
import testPageObjects.LoginPage;

public class Tc_002_BlpPriceMaster extends BaseClass {

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
	public void AddBLPG_Price() throws Exception {

		BLPG_PriceMaster Blp = new BLPG_PriceMaster(driver);
		LoginPage l = new LoginPage(driver);
		// For Creating Price For An Refill

		Blp.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Thread.sleep(2000);
		Blp.ClickonPricemaster();
		logg.info(getClass().getName() + " - "+"Clicked On Price master");
		Blp.ClickonRefillPrice();
		logg.info(getClass().getName() + " - "+"Clicked On Refill Price");
		Blp.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Pin Entered");
		Blp.ClickonSubmitPin();
		logg.info(getClass().getName() +" - "+ "Clicked On Submit pin");
		Thread.sleep(2000);
		Blp.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Blp.ProductListSelect();
		logg.info(getClass().getName() + " - "+"Selected Item From List");
		Thread.sleep(2000);
		Blp.EnterRSP("154");
		logg.info(getClass().getName() + " - "+"Rsp Entered");
		Blp.EnterOfrPrice("150");
		logg.info(getClass().getName() + " - "+"Offer Price Entered");
		Thread.sleep(2000);
		Blp.EnterDate("03/13/2024");
		logg.info(getClass().getName() +" - "+ "Date Entered");
		Thread.sleep(2000);
		Blp.ClickOnCalculate();
		logg.info(getClass().getName() +" - "+ "Clicked On Calculate Button");
		Thread.sleep(2000);
		Blp.ClickOnSave();
		logg.info(getClass().getName() +" - "+ "Clicked On Save Button");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "BLPG Product Adding For First Time With Today Date- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}

	@Test(priority = 2)
	public void MultipleAddBLPG_Price() throws Exception {

		BLPG_PriceMaster Blp = new BLPG_PriceMaster(driver);
		LoginPage l = new LoginPage(driver);
		// For Creating Price For An Refill

		Blp.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Thread.sleep(2000);
		Blp.ClickonPricemaster();
		logg.info(getClass().getName() + " - "+"Clicked On Price master");
		Blp.ClickonRefillPrice();
		logg.info(getClass().getName() + " - "+"Clicked On Refill Price");
		Blp.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Pin Entered");
		Blp.ClickonSubmitPin();
		logg.info(getClass().getName() +" - "+ "Clicked On Submit pin");
		Thread.sleep(2000);
		Blp.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Blp.ProductListSelect();
		logg.info(getClass().getName() + " - "+"Selected Item From List");
		Thread.sleep(2000);
		Blp.EnterRSP("154");
		logg.info(getClass().getName() + " - "+"Rsp Entered");
		Blp.EnterOfrPrice("150");
		logg.info(getClass().getName() + " - "+"Offer Price Entered");
		Thread.sleep(2000);
		Blp.EnterDate("03/13/2024");
		logg.info(getClass().getName() +" - "+ "Date Entered");
		Thread.sleep(2000);
		Blp.ClickOnCalculate();
		logg.info(getClass().getName() +" - "+ "Clicked On Calculate Button");
		Thread.sleep(2000);
		
		
		//For 2nd Add
		
		Blp.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Blp.ProductListSelect2();
		logg.info(getClass().getName() + " - "+"Selected Item From List");
		Thread.sleep(2000);
		Blp.EnterRSP2("154");
		logg.info(getClass().getName() + " - "+"Rsp Entered");
		Blp.EnterOfrPrice2("150");
		logg.info(getClass().getName() + " - "+"Offer Price Entered");
		Thread.sleep(2000);
		Blp.EnterDate2("03/13/2024");
		logg.info(getClass().getName() +" - "+ "Date Entered");
		Thread.sleep(2000);
		Blp.ClickOnCalculate();
		logg.info(getClass().getName() +" - "+ "Clicked On Calculate Button");
		Thread.sleep(2000);
		
		//For 3rd Add
		
		Blp.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Blp.ProductListSelect3();
		logg.info(getClass().getName() + " - "+"Selected Item From List");
		Thread.sleep(2000);
		Blp.EnterRSP3("154");
		logg.info(getClass().getName() + " - "+"Rsp Entered");
		Blp.EnterOfrPrice3("150");
		logg.info(getClass().getName() + " - "+"Offer Price Entered");
		Thread.sleep(2000);
		Blp.EnterDate3("03/13/2024");
		logg.info(getClass().getName() +" - "+ "Date Entered");
		Thread.sleep(2000);
		Blp.ClickOnCalculate();
		logg.info(getClass().getName() +" - "+ "Clicked On Calculate Button");
		Thread.sleep(2000);
		
		//For 4th Add
		
		Blp.ClickOnAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Blp.ProductListSelect4();
		logg.info(getClass().getName() + " - "+"Selected Item From List");
		Thread.sleep(2000);
		Blp.EnterRSP4("154");
		logg.info(getClass().getName() + " - "+"Rsp Entered");
		Blp.EnterOfrPrice4("150");
		logg.info(getClass().getName() + " - "+"Offer Price Entered");
		Thread.sleep(2000);
		Blp.EnterDate4("03/13/2024");
		logg.info(getClass().getName() +" - "+ "Date Entered");
		Thread.sleep(2000);
		Blp.ClickOnCalculate();
		logg.info(getClass().getName() +" - "+ "Clicked On Calculate Button");
		Thread.sleep(2000);
		
		
		Blp.ClickOnSave();
		logg.info(getClass().getName() +" - "+ "Clicked On Save Button");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "BLPG Product Adding For First Time With Today Date- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}

	@Test(enabled = false)
	public void BlpgView() throws Exception {
		BLPG_PriceMaster Blp = new BLPG_PriceMaster(driver);
		LoginPage l = new LoginPage(driver);
		// For Viewing Product Saved price list

		Blp.ClickonMasterData();
		logg.info(getClass().getName() +" - "+"Clicked On Master Data");
		Thread.sleep(2000);
		Blp.ClickonPricemaster();
		logg.info(getClass().getName() +" - "+ "Clicked On Price master");
		Blp.ClickonRefillPrice();
		logg.info(getClass().getName() +" - "+ "Clicked On Refill Price");
		Blp.EnterSecretPin("1234");
		logg.info(getClass().getName() +" - "+ "Pin Entered");
		Blp.ClickonSubmitPin();
		logg.info(getClass().getName() +" - "+ "Clicked On Submit pin");

		Blp.ClickOnView();
		logg.info(getClass().getName() +" - "+ "Clicked On View");
		Thread.sleep(2000);
		Blp.ClickOnCloseWindow();
		logg.info(getClass().getName() +" - "+ "Clicked On Close Window");

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "BLPG Price-Blpg Product Price List - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
		l.ClickOnProfile();
		logg.info("Clicked On Profile");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		l.ClickOnSinout();
		logg.info("Clicked On Signout");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.ClickingOnSinout();
		logg.info("Confirm For Signout");
		driver.close();
	}
	@AfterMethod()
	public void Aftermthd(ITestResult Tr) throws Exception {
		if (ITestResult.FAILURE == Tr.getStatus()) {
			Thread.sleep(2000);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/SS/" + Tr.getName() + timestamp + ".png");
			FileUtils.copyFile(source, target);
		}
}}
