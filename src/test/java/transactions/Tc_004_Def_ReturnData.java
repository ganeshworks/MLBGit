package transactions;

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

import testCases.BaseClass;
import testPageObjects.LoginPage;

public class Tc_004_Def_ReturnData extends BaseClass {

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
	public void DefReturn() throws Exception {

		Def_Return_Data Dr = new Def_Return_Data(driver);

		Dr.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Dr.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Thread.sleep(2000);
		Dr.ClickonDefRetrn();
		logg.info(getClass().getName() + " - " + "Clicked On Defective Purchase Return ");
		Thread.sleep(2000);
		Dr.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Dr.SelectPO();
		logg.info(getClass().getName() + " - " + "Entered Invoice Number");
		// Dr.EnterInvDate("03/06/2024");
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");
		// Dr.EnterVendName();
		logg.info(getClass().getName() + " - " + "Entered Vendor Name");
		Dr.EnterNarration("Qa");
		logg.info(getClass().getName() + " - " + "Entered Narration");
		Dr.EnterReturnDate(Todaydate);
		Dr.SelectProdDrop();
		logg.info(getClass().getName() + " - " + "Selected Product From DropDown");

		Dr.EnterRetrnQnty("10");
		logg.info(getClass().getName() + " - " + "Entered Return Quantity");
		Dr.EnterCylTareWt("10");
		Dr.EnterCylGrossWt("10");
		Dr.EnterCylSrNo("10");
		Dr.EnterNetWeight("10");
		logg.info(getClass().getName() + " - " + "Entered Net Quantity");
		Dr.EntervehclName(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Numbeer");
		// Dr.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Dr.ClickOnCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Dr.ClickOnAddRow();

		// For 2nd

		Dr.SelectProdDrop2();
		logg.info(getClass().getName() + " - " + "Selected Product From DropDown");

		Dr.EnterRetrnQnty2("10");
		logg.info(getClass().getName() + " - " + "Entered Return Quantity");
		Dr.EnterCylTareWt2("10");
		Dr.EnterCylGrossWt2("10");
		Dr.EnterCylSrNo2("10");
		Dr.EnterNetWeight2("10");
		logg.info(getClass().getName() + " - " + "Entered Net Quantity");
		Dr.EntervehclName2(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Numbeer");
		// Dr.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Dr.ClickOnCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Dr.ClickOnAddRow();

		// For 3rd

		Dr.SelectProdDrop3();
		logg.info(getClass().getName() + " - " + "Selected Product From DropDown");

		Dr.EnterRetrnQnty3("10");
		logg.info(getClass().getName() + " - " + "Entered Return Quantity");
		Dr.EnterCylTareWt3("10");
		Dr.EnterCylGrossWt3("10");
		Dr.EnterCylSrNo3("10");
		Dr.EnterNetWeight3("10");
		logg.info(getClass().getName() + " - " + "Entered Net Quantity");
		Dr.EntervehclName3(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Numbeer");
		// Dr.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Dr.ClickOnCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Dr.ClickOnAddRow();

		// For 2nd

		Dr.SelectProdDrop4();
		logg.info(getClass().getName() + " - " + "Selected Product From DropDown");

		Dr.EnterRetrnQnty4("10");
		logg.info(getClass().getName() + " - " + "Entered Return Quantity");
		Dr.EnterCylTareWt4("10");
		Dr.EnterCylGrossWt4("10");
		Dr.EnterCylSrNo4("10");
		Dr.EnterNetWeight4("10");
		logg.info(getClass().getName() + " - " + "Entered Net Quantity");
		Dr.EntervehclName4(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Numbeer");
		// Dr.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Dr.ClickOnCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");

		//Dr.ClickOnsave();
		logg.info(getClass().getName() + " - " + "Clicked On Save Button");

		Thread.sleep(2000);
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Def-Return Purchase-Add Data" + timestamp + ".png");
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
