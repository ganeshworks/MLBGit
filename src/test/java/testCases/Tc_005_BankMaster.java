package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
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

	@Test(enabled = false)

	public void Bank_Masters() throws Exception {

		Bank_Master Bm = new Bank_Master(driver);

		// For Adding Bank

		Bm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Thread.sleep(2000);
		Bm.ClickonBankmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Bank Master");
		Bm.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - " + "Pin Entered");
		Bm.ClickonSubmitPin();
		logg.info(getClass().getName() + " - " + "Pin Submited");
		Thread.sleep(2000);
		Bm.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Bm.EnterNickName("Hdfc123");
		logg.info(getClass().getName() + " - " + "NickName Entered");
		Bm.BankListSelect();
		logg.info(getClass().getName() + " - " + "Bank Selected");
		Bm.BankTypeSelect();
		logg.info(getClass().getName() + " - " + "Bank type Selected");
		Bm.EnterAccNum("6554445441478521");
		logg.info(getClass().getName() + " - " + "Acc No Entered");
		Bm.EnterAccBrnach("Hyd");
		logg.info(getClass().getName() + " - " + "Acc Branch Entered");
		Thread.sleep(2000);
		Bm.EnterIfsc("Sbin0055475");
		logg.info(getClass().getName() + " - " + "Ifsc Entered");
		Bm.EnterAddress("Hyderabad,Borabanda");
		logg.info(getClass().getName() + " - " + "Address Entered");
		Bm.EnterOpBlnce("125441");
		logg.info(getClass().getName() + " - " + "OpBalance Entered");
		Thread.sleep(2000);
		Bm.ClickOnSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Bank Master-BankAcc Added - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}

	@Test(priority = 2)

	public void Multiple_Banks() throws Exception {

		Bank_Master Bm = new Bank_Master(driver);

		// For Adding Bank

		Bm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Thread.sleep(2000);
		Bm.ClickonBankmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Bank Master");
		Bm.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - " + "Pin Entered");
		Bm.ClickonSubmitPin();
		logg.info(getClass().getName() + " - " + "Pin Submited");
		Thread.sleep(2000);
		Bm.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Bm.EnterNickName("Hdfc12378");
		logg.info(getClass().getName() + " - " + "NickName Entered");
		Bm.BankListSelect();
		logg.info(getClass().getName() + " - " + "Bank Selected");
		Bm.BankTypeSelect();
		logg.info(getClass().getName() + " - " + "Bank type Selected");
		Bm.EnterAccNum("6554444741478787");
		logg.info(getClass().getName() + " - " + "Acc No Entered");
		Bm.EnterAccBrnach("Hyd");
		logg.info(getClass().getName() + " - " + "Acc Branch Entered");
		Thread.sleep(2000);
		Bm.EnterIfsc("Sbin0055475");
		logg.info(getClass().getName() + " - " + "Ifsc Entered");
		Bm.EnterAddress("Hyderabad,Borabanda");
		logg.info(getClass().getName() + " - " + "Address Entered");
		Bm.EnterOpBlnce("125441");
		logg.info(getClass().getName() + " - " + "OpBalance Entered");

		// 2nd
		Bm.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Bm.EnterNickName2("Hdfc1" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "NickName Entered");
		Bm.BankListSelect2();
		logg.info(getClass().getName() + " - " + "Bank Selected");
		Bm.BankTypeSelect2();
		logg.info(getClass().getName() + " - " + "Bank type Selected");
		Bm.EnterAccNum2("65544554414785" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc No Entered");
		Bm.EnterAccBrnach2("Hyd" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc Branch Entered");
		Thread.sleep(2000);
		Bm.EnterIfsc2("Sbin00554" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Ifsc Entered");
		Bm.EnterAddress2("Hyderabad,Borabanda");
		logg.info(getClass().getName() + " - " + "Address Entered");
		Bm.EnterOpBlnce2("125441" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "OpBalance Entered");

		// 3rd
		Bm.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Bm.EnterNickName3("Hdfc1" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "NickName Entered");
		Bm.BankListSelect3();
		logg.info(getClass().getName() + " - " + "Bank Selected");
		Bm.BankTypeSelect3();
		logg.info(getClass().getName() + " - " + "Bank type Selected");
		Bm.EnterAccNum3("655447854414785" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc No Entered");
		Bm.EnterAccBrnach3("Hyd" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc Branch Entered");
		Thread.sleep(2000);
		Bm.EnterIfsc3("Sbin00554" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Ifsc Entered");
		Bm.EnterAddress3("Hyderabad,Borabanda");
		logg.info(getClass().getName() + " - " + "Address Entered");
		Bm.EnterOpBlnce3("125441" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "OpBalance Entered");

		// 4th
		Bm.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Bm.EnterNickName4("Hdfc1" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "NickName Entered");
		Bm.BankListSelect4();
		logg.info(getClass().getName() + " - " + "Bank Selected");
		Bm.BankTypeSelect4();
		logg.info(getClass().getName() + " - " + "Bank type Selected");
		Bm.EnterAccNum4("65544054414785" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc No Entered");
		Bm.EnterAccBrnach4("Hyd" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Acc Branch Entered");
		Thread.sleep(2000);
		Bm.EnterIfsc4("Sbin00554" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Ifsc Entered");
		Bm.EnterAddress4("Hyderabad,Borabanda");
		logg.info(getClass().getName() + " - " + "Address Entered");
		Bm.EnterOpBlnce4("125441" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "OpBalance Entered");

		Thread.sleep(2000);
		Bm.ClickOnSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

	}

	@Test(enabled = false)

	public void EditBankData() throws Exception {

		Bank_Master Bm = new Bank_Master(driver);

		// For Edit Bank

		Bm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Thread.sleep(2000);
		Bm.ClickonBankmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Bank Master");
		Bm.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - " + "Pin Entered");
		Bm.ClickonSubmitPin();
		logg.info(getClass().getName() + " - " + "Pin Submited");
		Thread.sleep(2000);
		Bm.Dropdown();
		logg.info(getClass().getName() + " - " + "Dropdown Clicked For Show Entries");
		Bm.ClickonEditBank();
		logg.info(getClass().getName() + " - " + "Clicked On Bank Name");
		Bm.EditBranch("Hyderabad");
		logg.info(getClass().getName() + " - " + "Branch name Edited");
		Bm.EditIfsc("SBIN0014511");
		logg.info(getClass().getName() + " - " + " Ifsc Edited");
		Thread.sleep(2000);
		Bm.EditAddress("Borabanda ");
		logg.info(getClass().getName() + " - " + "Address Edited");
		Bm.EditCLimit("12005");
		logg.info(getClass().getName() + " - " + "Credit Limit Entered");
		Thread.sleep(2000);
		Bm.ClickOnEditSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Bank Master-BankAccount Edited - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

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
