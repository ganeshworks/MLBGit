package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testPageObjects.LoginPage;
import testPageObjects.Stock_Adjustment_Module;

public class Tc_008_Stock_Adjustment extends BaseClass{

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
	public void InternalTransf() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		Sam.ClickonStockAdjModule();
		Sam.EnterSecretPin("1234");
		Sam.ClickonSubmitPin();
		Thread.sleep(2000);
		Sam.EnterDate("03/05/2024");
		Sam.SelectProdCatgry();
		Thread.sleep(2000);
		Sam.SelectProduct();
		Sam.ClickonAdd();
		Sam.ClickonIntTransf();
		Thread.sleep(2000);
		Sam.SelectFromLoc();
		Sam.SelectToLoc();
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		Sam.EnterEmpties("10");
		Sam.EnterNarration("Qatest");
		Thread.sleep(2000);
		Sam.ClickonSave();
		Thread.sleep(2000);
		
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Stock Adjustment Module-Internal transfer- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
	}
	
	@Test(enabled = false)
	public void ExternalTransf() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		Sam.ClickonStockAdjModule();
		Sam.EnterSecretPin("1234");
		Sam.ClickonSubmitPin();
		Thread.sleep(2000);
		Sam.EnterDate("03/04/2024");
		Sam.SelectProdCatgry();
		Thread.sleep(2000);
		Sam.SelectProduct();
		Sam.ClickonAdd();
		Sam.ClickonExtTransf();
		Thread.sleep(2000);
		Sam.SelectFromLoc();
		Sam.SelectToLoc();
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		Sam.EnterEmpties("10");
		Sam.EnterNarration("Qatest");
		Thread.sleep(2000);
		Sam.ClickonSave();
		Thread.sleep(2000);
		
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Stock Adjustment Module-External transfer- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
	}
	@Test(enabled = false)
	public void Loss() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		Sam.ClickonStockAdjModule();
		Sam.EnterSecretPin("1234");
		Sam.ClickonSubmitPin();
		Thread.sleep(2000);
		Sam.EnterDate("03/04/2024");
		Sam.SelectProdCatgry();
		Thread.sleep(2000);
		Sam.SelectProduct();
		Sam.ClickonAdd();
		Sam.ClickonIntLoss();
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		Sam.EnterEmpties("10");
		Sam.EnterNarration("Qatest");
		Thread.sleep(2000);
		Sam.ClickonSave();
		Thread.sleep(2000);
		
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Stock Adjustment Module-Loss- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
	}
}
