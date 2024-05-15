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
	@Test(enabled = false)
	public void InternalTransf() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sam.ClickonStockAdjModule();
		logg.info(getClass().getName() + " - "+"Clicked On StockAdjustModule");
		Sam.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Entered Pin");
		Sam.ClickonSubmitPin();
		logg.info(getClass().getName() + " - "+"Submitted Pin");
		Thread.sleep(2000);
		Sam.EnterDate("03/05/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Sam.SelectProdCatgry();
		logg.info(getClass().getName() + " - "+"Selected Product Category From List");
		Thread.sleep(2000);
		Sam.SelectProduct();
		logg.info(getClass().getName() + " - "+"Selected Product  From List");
		Sam.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Sam.ClickonIntTransf();
		logg.info(getClass().getName() + " - "+"Clicked On Internal Transer");
		Thread.sleep(2000);
		Sam.SelectFromLoc();
		logg.info(getClass().getName() + " - "+"Select From Loacation");
		Sam.SelectToLoc();
		logg.info(getClass().getName() + " - "+"Select From Loacation");
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		logg.info(getClass().getName() + " - "+"Entered Fulls");
		Sam.EnterEmpties("10");
		logg.info(getClass().getName() + " - "+"Entered Empties");
		Sam.EnterNarration("Qatest");
		logg.info(getClass().getName() + " - "+"Entered Narration");
		Thread.sleep(2000);
		Sam.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		Thread.sleep(2000);
		
		/*
		 * String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot tss = (TakesScreenshot) driver; File sourcee =
		 * tss.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Stock Adjustment Module-Internal transfer- " + timestampp + ".png");
		 * FileUtils.copyFile(sourcee, targete); System.out.println("screenshot taken");
		 */
	}
	
	@Test(enabled = false)
	public void ExternalTransf() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sam.ClickonStockAdjModule();
		logg.info(getClass().getName() + " - "+"Clicked On StockAdjustModule");
		Sam.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Entered Pin");
		Sam.ClickonSubmitPin();
		logg.info(getClass().getName() + " - "+"Submitted Pin");
		Thread.sleep(2000);
		Sam.EnterDate("03/05/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Sam.SelectProdCatgry();
		logg.info(getClass().getName() + " - "+"Selected Product Category From List");
		Thread.sleep(2000);
		Sam.SelectProduct();
		logg.info(getClass().getName() + " - "+"Selected Product  From List");
		Sam.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Sam.ClickonExtTransf();
		logg.info(getClass().getName() + " - "+"Clicked On External Transer");
		Thread.sleep(2000);
		Sam.SelectFromLoc();
		
		Sam.SelectFromLoc();
		logg.info(getClass().getName() + " - "+"Select From Loacation");
		Sam.SelectToLoc();
		logg.info(getClass().getName() + " - "+"Select From Loacation");
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		logg.info(getClass().getName() + " - "+"Entered Fulls");
		Sam.EnterEmpties("10");
		logg.info(getClass().getName() + " - "+"Entered Empties");
		Sam.EnterNarration("Qatest");
		logg.info(getClass().getName() + " - "+"Entered Narration");
		Thread.sleep(2000);
		Sam.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		Thread.sleep(2000);
		
		/*
		 * String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot tss = (TakesScreenshot) driver; File sourcee =
		 * tss.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Stock Adjustment Module-External transfer- " + timestampp + ".png");
		 * FileUtils.copyFile(sourcee, targete); System.out.println("screenshot taken");
		 */
	}
	@Test(priority = 2)
	public void Loss() throws Exception {
		Stock_Adjustment_Module Sam=new Stock_Adjustment_Module(driver);
		
		Sam.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sam.ClickonStockAdjModule();
		logg.info(getClass().getName() + " - "+"Clicked On StockAdjustModule");
		Sam.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - "+"Entered Pin");
		Sam.ClickonSubmitPin();
		logg.info(getClass().getName() + " - "+"Submitted Pin");
		Thread.sleep(2000);
		Sam.EnterDate("03/05/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Sam.SelectProdCatgry();
		logg.info(getClass().getName() + " - "+"Selected Product Category From List");
		Thread.sleep(2000);
		Sam.SelectProduct();
		logg.info(getClass().getName() + " - "+"Selected Product  From List");
		Sam.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Sam.ClickonIntLoss();
		logg.info(getClass().getName() + " - "+"Clicked On Loss CheckBox");
		Thread.sleep(2000);
		Sam.EnterFulls("10");
		logg.info(getClass().getName() + " - "+"Entered Fulls");
		Sam.EnterEmpties("10");
		logg.info(getClass().getName() + " - "+"Entered Empties");
		Sam.EnterNarration("Qatest");
		logg.info(getClass().getName() + " - "+"Entered Narration");
		Thread.sleep(2000);
		Sam.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		Thread.sleep(2000);
		
		/*
		 * String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot tss = (TakesScreenshot) driver; File sourcee =
		 * tss.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Stock Adjustment Module-Loss- " + timestampp + ".png");
		 * FileUtils.copyFile(sourcee, targete); System.out.println("screenshot taken");
		 */
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
