package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testPageObjects.BLPG_PriceMaster;
import testPageObjects.LoginPage;
import testPageObjects.Refill_Price_Master;

public class Tc_002_Price_Master extends BaseClass {

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

	public void Refill_Price() throws Exception {

		Refill_Price_Master Rp = new Refill_Price_Master(driver);
		LoginPage l = new LoginPage(driver);

		// For Creating Price For An Refill

		/*
		 * Rp.ClickonMasterData(); Thread.sleep(2000); Rp.ClickonPricemaster();
		 * Rp.ClickonRefillPrice(); Rp.EnterSecretPin("1234"); Rp.ClickonSubmitPin();
		 * Thread.sleep(2000); Rp.ClickOnAdd(); Rp.ProductListSelect();
		 * Thread.sleep(2000); Rp.EnterRSP("1540"); Rp.EnterOfrPrice("1500");
		 * Thread.sleep(2000); Rp.EnterDate("03/04/2024"); Thread.sleep(2000);
		 * Rp.ClickOnCalculate(); Thread.sleep(2000); Rp.ClickOnSave();
		 * 
		 * Thread.sleep(2000); String timestamp = new
		 * SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); TakesScreenshot
		 * ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Refill Price Setting Got Error - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		// For Viewing Any Item Data

		Rp.ClickonMasterData();
		Thread.sleep(2000);
		Rp.ClickonPricemaster();
		Rp.ClickonRefillPrice();
		Rp.EnterSecretPin("1234");
		Rp.ClickonSubmitPin();
		Thread.sleep(2000);
		Rp.ClickOnView();

		Thread.sleep(2000);

		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Product Price List - " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[1]/button")).click();

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

	@Test(priority = 2)
	public void BLPG_Price() throws Exception {

		BLPG_PriceMaster Blp = new BLPG_PriceMaster(driver);
		LoginPage l = new LoginPage(driver);
		// For Creating Price For An Refill

		
		/*
		 * Blp.ClickonMasterData(); Thread.sleep(2000); Blp.ClickonPricemaster();
		 * Blp.ClickonRefillPrice(); Blp.EnterSecretPin("1234"); Blp.ClickonSubmitPin();
		 * Thread.sleep(2000); Blp.ClickOnAdd(); Blp.ProductListSelect();
		 * Thread.sleep(2000); Blp.EnterRSP("154"); Blp.EnterOfrPrice("150");
		 * Thread.sleep(2000); Blp.EnterDate("03/04/2024"); Thread.sleep(2000);
		 * Blp.ClickOnCalculate(); Thread.sleep(2000); Blp.ClickOnSave();
		 * 
		 * Thread.sleep(2000); String timestamp = new
		 * SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); TakesScreenshot
		 * ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "BLPG Product Adding For First Time With Today Date- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
		
		//For Viewing Product Saved price list

		
		Blp.ClickonMasterData();
		Thread.sleep(2000);
		Blp.ClickonPricemaster();
		Blp.ClickonRefillPrice();
		Blp.EnterSecretPin("1234");
		Blp.ClickonSubmitPin();
		Thread.sleep(2000);

		Blp.ClickOnView();
		Thread.sleep(2000);
		Blp.ClickOnCloseWindow();

		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/"
				+ "BLPG Price-Blpg Product Price List - " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
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

}
