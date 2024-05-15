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
import testCases.TodayDate;
import testPageObjects.LoginPage;
import testPageObjects.Vendor_PO;
import testUtilities.Sql_Insert;

public class Tc_005_Vendor_PO extends BaseClass {

	Sql_Insert sqlInsert = new Sql_Insert();

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
	public void VendorPO() throws Exception {

		Vendor_PO Vp = new Vendor_PO(driver);
		// TodayDate td = new TodayDate();

		Thread.sleep(2000);
		Vp.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(2000);
		Vp.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Vp.ClickonVendorPO();
		logg.info(getClass().getName() + " - " + "Clicked On Vendor Po");
		Vp.ClickOnAdd();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		// Vp.EnterPONo("PO/23-0001");
		// logg.info(getClass().getName() + " - "+"Entered Po Number");
		Vp.EnterPODate(Todaydate);
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Entered Po Date");
		Vp.SelectVendName();
		logg.info(getClass().getName() + " - " + "Entered Vendor Name");
		Vp.EnterQuoteNo(RandomInt);
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Entered Quotation Number");
		Vp.EnterQuoteDate(Todaydate);
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Entered Quotation Date");
		// Vp.SelectRevCharge();
		Vp.EnterNarration("Qa");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Entered Narration");
		Vp.EnterValidUpto(threems);
		Vp.EnterPOTerms("sbjkdb");
		Thread.sleep(2000);
		Vp.SelectProdfromlist();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Vp.Unitprice1("100");
		Vp.EnterQanty("10");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Vp.EnterOtherCharge("10.4");
		logg.info(getClass().getName() + " - " + "Entered Other Charges");
		Vp.ClickOnFetchPO();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "PO Number Fetched");
		Vp.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");

		// 2nd

		Vp.ClickOnAddRow();
		Vp.SelectProdfromlist2();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Vp.Unitprice2("100");
		Vp.EnterQanty2("10");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Vp.EnterOtherCharge2(RandomInt.substring(0, 3));
		logg.info(getClass().getName() + " - " + "Entered Other Charges");
		Vp.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");

		// 3rd

		Vp.ClickOnAddRow();
		Vp.SelectProdfromlist3();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Vp.Unitprice3("100");
		Vp.EnterQanty3("10");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Vp.EnterOtherCharge3("10.4");
		logg.info(getClass().getName() + " - " + "Entered Other Charges");
		Vp.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");

		// 4th

		Vp.ClickOnAddRow();
		Vp.SelectProdfromlist4();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Vp.Unitprice4("100");
		Vp.EnterQanty4("10");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Vp.EnterOtherCharge4("10.4");
		logg.info(getClass().getName() + " - " + "Entered Other Charges");
		Vp.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");

		

		Thread.sleep(5000);

		String moduleName = "Vendor Po";
		String podate = Todaydate;
		String ponumber = RandomInt;
		String vendorname = Vp.VendorName();
		String quotationnumber = RandomInt;
		String quotationdate = Todaydate;
		String narration = "narration";
		String validupto = threems;
		String poterms = "terms";
		String productname = Vp.firstprod();
		int unitrate = 120;
		int quantity = 150;
		int othercharges = 10;

		// Second set of data
		String moduleName2 = "Vendor Po";
		String podate2 = Todaydate;
		String ponumber2 = RandomInt;
		String vendorname2 = Vp.VendorName();
		String quotationnumber2 = RandomInt;
		String quotationdate2 = Todaydate;
		String narration2 = "narration";
		String validupto2 = threems;
		String poterms2 = "terms";
		String productname2 = Vp.Secondprod();
		int unitrate2 = 120;
		int quantity2 = 150;
		int othercharges2 = 10;

		// Third set of data
		String moduleName3 = "Vendor Po";
		String podate3 = Todaydate;
		String ponumber3 = RandomInt;
		String vendorname3 = Vp.VendorName();
		String quotationnumber3 = RandomInt;
		String quotationdate3 = Todaydate;
		String narration3 = "narration";
		String validupto3 = threems;
		String poterms3 = "terms";
		String productname3 = Vp.thirdprod();
		int unitrate3 = 120;
		int quantity3 = 150;
		int othercharges3 = 10;

		// Fourth set of data
		String moduleName4 = "Vendor Po";
		String podate4 = Todaydate;
		String ponumber4 = RandomInt;
		String vendorname4 = Vp.VendorName();
		String quotationnumber4 = RandomInt;
		String quotationdate4 = Todaydate;
		String narration4 = "narration";
		String validupto4 = threems;
		String poterms4 = "terms";
		String productname4 = Vp.forthprod();
		int unitrate4 = 120;
		int quantity4 = 150;
		int othercharges4 = 10;

		sqlInsert.insertDataToVendorPO1(moduleName, podate, ponumber, vendorname, quotationnumber, quotationdate,
				narration, validupto, poterms, productname, unitrate, quantity, othercharges);
		sqlInsert.insertDataToVendorPO2(moduleName2, podate2, ponumber2, vendorname2, quotationnumber2, quotationdate2,
				narration2, validupto2, poterms2, productname2, unitrate2, quantity2, othercharges2);
		sqlInsert.insertDataToVendorPO3(moduleName3, podate3, ponumber3, vendorname3, quotationnumber3, quotationdate3,
				narration3, validupto3, poterms3, productname3, unitrate3, quantity3, othercharges3);
		sqlInsert.insertDataToVendorPO4(moduleName4, podate4, ponumber4, vendorname4, quotationnumber4, quotationdate4,
				narration4, validupto4, poterms4, productname4, unitrate4, quantity4, othercharges4);
		
		Vp.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save Button");

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Vendor Po -Add Data" +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
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
