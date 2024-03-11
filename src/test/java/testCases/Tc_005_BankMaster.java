package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testPageObjects.Bank_Master;
import testPageObjects.LoginPage;

public class Tc_005_BankMaster extends BaseClass {

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

	public void Bank_Masters() throws Exception  {

		Bank_Master Bm = new Bank_Master(driver);

		//For Adding Bank
		
		/*
		 * Bm.ClickonMasterData(); Thread.sleep(2000); Bm.ClickonBankmaster();
		 * Bm.EnterSecretPin("1234"); Bm.ClickonSubmitPin(); Thread.sleep(2000);
		 * Bm.ClickOnAdd(); Thread.sleep(2000); Bm.EnterNickName("Hdfc123");
		 * Bm.BankListSelect(); Bm.BankTypeSelect(); Bm.EnterAccNum("6554445441478521");
		 * Bm.EnterAccBrnach("Hyd"); Thread.sleep(2000); Bm.EnterIfsc("Sbin0055475");
		 * Bm.EnterAddress("Hyderabad,Borabanda"); Bm.EnterOpBlnce("125441");
		 * Thread.sleep(2000); Bm.ClickOnSave(); Thread.sleep(2000);
		 * 
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Bank Master-BankAcc Added - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
		
		//For Edit Bank
		
		Bm.ClickonMasterData();
		Thread.sleep(2000);
		Bm.ClickonBankmaster();
		Bm.EnterSecretPin("1234");
		Bm.ClickonSubmitPin();
		Thread.sleep(2000);
		Bm.Dropdown();
		Bm.ClickonEditBank();
		Bm.EditBranch("Hyderabad");
		Bm.EditIfsc("SBIN0014511");
		Thread.sleep(2000);
		Bm.EditAddress("Borabanda ");
		Bm.EditCLimit("12005");
		Thread.sleep(2000);
		Bm.ClickOnEditSave();
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Bank Master-BankAccount Edited - " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
		
		
	}

	
}
