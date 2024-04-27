package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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

	public void AddRefill_Price() throws Exception {

		Refill_Price_Master Rp = new Refill_Price_Master(driver);
		LoginPage l = new LoginPage(driver);

		// For Creating Price For An Refill

		Rp.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On Master Data");
		Thread.sleep(2000);
		Rp.ClickonPricemaster();
		logg.info(getClass().getName() + "Clicked On Price master");
		Rp.ClickonRefillPrice();
		logg.info(getClass().getName() + "Clicked On Refill Price");
		Rp.EnterSecretPin("1234");
		logg.info(getClass().getName() + "Pin Entered");
		Rp.ClickonSubmitPin();
		logg.info(getClass().getName() + "Clicked On Submit pin");
		Thread.sleep(2000);
		Rp.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Rp.ProductListSelect();
		logg.info(getClass().getName() + "Clicked On Product Dropdown");
		Thread.sleep(2000);
		Rp.EnterRSP("1540");
		logg.info(getClass().getName() + "Rsp Entered");
		Rp.EnterOfrPrice("1500");
		logg.info(getClass().getName() + "OfferPrice Entered");
		Thread.sleep(3000);
		Rp.EnterDate("03/13/2024");
		logg.info(getClass().getName() + "Date Entered");
		Thread.sleep(2000);
		Rp.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Thread.sleep(2000);
		Rp.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(2000);
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Refill Price Setting Got Error - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}
	@Test(priority = 2)

	public void MultipleAddRefill_Price() throws Exception {

		Refill_Price_Master Rp = new Refill_Price_Master(driver);
		LoginPage l = new LoginPage(driver);

		// For Creating Price For An Refill

		Rp.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On Master Data");
		Thread.sleep(2000);
		Rp.ClickonPricemaster();
		logg.info(getClass().getName() + "Clicked On Price master");
		Rp.ClickonRefillPrice();
		logg.info(getClass().getName() + "Clicked On Refill Price");
		Rp.EnterSecretPin("1234");
		logg.info(getClass().getName() + "Pin Entered");
		Rp.ClickonSubmitPin();
		logg.info(getClass().getName() + "Clicked On Submit pin");
		Thread.sleep(2000);
		Rp.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Rp.ProductListSelect();
		logg.info(getClass().getName() + "Clicked On Product Dropdown");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[8]/div/div[2]/div[2]/div")).click();
		
		
		Thread.sleep(2000);
		Rp.EnterRSP("1540");
		logg.info(getClass().getName() + "Rsp Entered");
		Rp.EnterOfrPrice("1500");
		logg.info(getClass().getName() + "OfferPrice Entered");
		Thread.sleep(3000);
		Rp.EnterDate("03/13/2024");
		logg.info(getClass().getName() + "Date Entered");
		Thread.sleep(2000);
		Rp.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Thread.sleep(2000);
		
		
		//For 2nd add
		
	
		Rp.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Rp.ProductListSelect2();
		logg.info(getClass().getName() + "Clicked On Product Dropdown");
		Thread.sleep(2000);
		Rp.EnterRSP2("1540");
		logg.info(getClass().getName() + "Rsp Entered");
		Rp.EnterOfrPrice2("1500");
		logg.info(getClass().getName() + "OfferPrice Entered");
		Thread.sleep(3000);
		Rp.EnterDate2("03/13/2024");
		logg.info(getClass().getName() + "Date Entered");
		Thread.sleep(2000);
		Rp.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Thread.sleep(2000);
		
		
		//For 3rd Time
		
		Rp.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Rp.ProductListSelect3();
		logg.info(getClass().getName() + "Clicked On Product Dropdown");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[8]/div/div[2]/div[2]/div")).click();
		Thread.sleep(2000);
		Rp.EnterRSP3("1540");
		logg.info(getClass().getName() + "Rsp Entered");
		Rp.EnterOfrPrice3("1500");
		logg.info(getClass().getName() + "OfferPrice Entered");
		Thread.sleep(3000);
		Rp.EnterDate3("03/13/2024");
		logg.info(getClass().getName() + "Date Entered");
		Thread.sleep(2000);
		Rp.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Thread.sleep(2000);
		
		//For 4th Add
		
		Rp.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Rp.ProductListSelect4();
		logg.info(getClass().getName() + "Clicked On Product Dropdown");
		Thread.sleep(2000);
		Rp.EnterRSP4("1540");
		logg.info(getClass().getName() + "Rsp Entered");
		Rp.EnterOfrPrice4("1500");
		logg.info(getClass().getName() + "OfferPrice Entered");
		Thread.sleep(3000);
		Rp.EnterDate4("03/13/2024");
		logg.info(getClass().getName() + "Date Entered");
		Thread.sleep(2000);
		Rp.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Thread.sleep(2000);
		
		Rp.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(2000);
		
	}

	private void elseif(boolean equalsIgnoreCase) {
		// TODO Auto-generated method stub
		
	}

	@Test(enabled = false)

	public void ViewData() throws Exception {
		// For Viewing Any Item Data
		Refill_Price_Master Rp = new Refill_Price_Master(driver);
		LoginPage l = new LoginPage(driver);

		Rp.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On Master Data");
		Thread.sleep(2000);
		Rp.ClickonPricemaster();
		logg.info(getClass().getName() + "Clicked On Price master");
		Rp.ClickonRefillPrice();
		logg.info(getClass().getName() + "Clicked On Refill Price");
		Rp.EnterSecretPin("1234");
		logg.info(getClass().getName() + "Pin Entered");
		Rp.ClickonSubmitPin();
		logg.info(getClass().getName() + "Clicked On Submit pin");
		Thread.sleep(2000);
		Rp.ClickOnView();
		logg.info(getClass().getName() + "Clicked On View");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Product Price List - " +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
		 */

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[1]/button")).click();

		l.ClickOnProfile();
		logg.info(getClass().getName() + "Clicked On Profile");
		logg.info("Clicked On Profile");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		l.ClickOnSinout();
		logg.info("Clicked On Signout");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.ClickingOnSinout();
		logg.info("Confirm For Signout");
		driver.close();

	}

	

	

	@AfterMethod(enabled = false)
	public void Aftermthd(ITestResult Tr) throws Exception {
		if (ITestResult.FAILURE == Tr.getStatus()) {
			Thread.sleep(2000);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/SS/" + Tr.getName() + timestamp + ".png");
			FileUtils.copyFile(source, target);
		}
	}

}
