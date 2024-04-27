package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import testUtilities.Sql_Insert;

public class Tc_002_ArbPurchase extends BaseClass {

	Sql_Insert sqlInsert = new Sql_Insert();

	@Test(priority = 1)
	public void login() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	public void ArbPurchse() throws Exception {

		TodayDate td = new TodayDate();

		String formattedDate = TodayDate.getFormattedDate();

		ARB_Purchase Ap = new ARB_Purchase(driver);

		Ap.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Ap.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Ap.ClickonArbPurch();
		logg.info(getClass().getName() + " - " + "Clicked On Arb Purchases");
		Ap.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);

		Ap.EnterInvNo(RandomInt);
		logg.info(getClass().getName() + " - " + "Entered Invoice Number");
		Ap.EnterInvDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");
		Thread.sleep(2000);
		Ap.EnterStckRecDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Stock Received Date");
		Ap.SelectVendorfromlist();
		logg.info(getClass().getName() + " - " + "Select Vendor  From List");
		// Ap.SelectRevCharge();
		// logg.info(getClass().getName() + " - "+"Select Reverse Charge");
		// Ap.SelectPODrop();

		// Ap.EnterPODate("03/06/2024");
		// logg.info(getClass().getName() + " - "+"Entered PO Date");
		Ap.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Select Prouct  From List");
		Thread.sleep(2000);
		// Ap.ClickOnFetchGst();
		// logg.info(getClass().getName() + " - "+"Clicked On FetchGSt");
		Ap.EnterUnitRate("120");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Ap.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Ap.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clciked On Calculate");
		Ap.EnterTruck(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Truck Number");
		Ap.EnterDrivername("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver name");
		Thread.sleep(2000);
		Ap.SelectRecdBy();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

		Ap.ClickonAddRow();
		// 2nd

		Ap.SelectProdfromlist2();
		logg.info(getClass().getName() + " - " + "Select Prouct  From List");
		Thread.sleep(2000);
		Ap.EnterUnitRate2("120");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Ap.EnterQanty2("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Ap.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clciked On Calculate");
		Ap.EnterTruck2(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Truck Number");
		Ap.EnterDrivername2("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver name");
		Thread.sleep(2000);
		Ap.SelectRecdBy2();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);
		Ap.ClickonAddRow();
		// 3rd

		Ap.SelectProdfromlist3();
		logg.info(getClass().getName() + " - " + "Select Prouct  From List");
		Thread.sleep(2000);
		Ap.EnterUnitRate3("120");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Ap.EnterQanty3("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Ap.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clciked On Calculate");
		Ap.EnterTruck3(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Truck Number");
		Ap.EnterDrivername3("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver name");
		Thread.sleep(2000);
		Ap.SelectRecdBy3();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);
		Ap.ClickonAddRow();
		// 4th

		Ap.SelectProdfromlist4();
		logg.info(getClass().getName() + " - " + "Select Prouct  From List");
		Thread.sleep(2000);
		Ap.EnterUnitRate4("120");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Ap.EnterQanty4("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Ap.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clciked On Calculate");
		Ap.EnterTruck4(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Truck Number");
		Ap.EnterDrivername4("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver name");
		Thread.sleep(2000);
		Ap.SelectRecdBy4();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

		String moduleName = "NFR PO";
		String invoicenumber = RandomInt;
		String invoicedate = Todaydate;
		String stockrecvddate = Todaydate;
		String vendorname = Ap.Vendorname();
		String reversecharge = "test";
		String ponumber = RandomInt;
		String podate = threems;
		String productName = Ap.firstprod();
		int unitrate1 = 100;
		int quantity = 200;
		String trucknumber1 = Vehiclenum;
		String drivername1 = "TestQa";
		String receivedby1 = Ap.firstrecvdby();
		
		// 2nd set of data
		
		String moduleName2 = "NFR PO";
		String invoicenumber2 = RandomInt;
		String invoicedate2 = Todaydate;
		String stockrecvddate2 = Todaydate;
		String vendorname2 = Ap.Vendorname();
		String reversecharge2 = "test";
		String ponumber2 = RandomInt;
		String podate2 = threems;
		String productName2 = Ap.secondprod();
		int unitrate12 = 100;
		int quantity2 = 200;
		String trucknumber12 = Vehiclenum;
		String drivername12 = "TestQa";
		String receivedby12 = Ap.secondrecvdby();

		// 3rd set of data
		String moduleName3 = "NFR PO";
		String invoicenumber3 = RandomInt;
		String invoicedate3 = Todaydate;
		String stockrecvddate3 = Todaydate;
		String vendorname3 = Ap.Vendorname();
		String reversecharge3 = "test";
		String ponumber3 = RandomInt;
		String podate3 = threems;
		String productName3 = Ap.Thirdprod();
		int unitrate13 = 100;
		int quantity3 = 200;
		String trucknumber13 = Vehiclenum;
		String drivername13 = "TestQa";
		String receivedby13 = Ap.thirdrecvdby();

		// 4th set of data
		String moduleName4 = "NFR PO";
		String invoicenumber4 = RandomInt;
		String invoicedate4 = Todaydate;
		String stockrecvddate4 = Todaydate;
		String vendorname4 = Ap.Vendorname();
		String reversecharge4 = "test";
		String ponumber4 = RandomInt;
		String podate4 = threems;
		String productName4 = Ap.fourthprod();
		int unitrate14 = 100;
		int quantity4 = 200;
		String trucknumber14 = Vehiclenum;
		String drivername14 = "TestQa";
		String receivedby14 = Ap.fourthrecvdby();
		
		

		sqlInsert.insertDataToNFRPO1(moduleName, invoicenumber, invoicedate, stockrecvddate, vendorname, reversecharge,
				ponumber, podate, productName, unitrate1, quantity, trucknumber1, drivername1, receivedby1);
		sqlInsert.insertDataToNFRPO1(moduleName2, invoicenumber2, invoicedate2, stockrecvddate2, vendorname2, reversecharge2, ponumber2, podate2, productName2, unitrate12, quantity2, trucknumber12, drivername12, receivedby12);
		sqlInsert.insertDataToNFRPO1(moduleName3, invoicenumber3, invoicedate3, stockrecvddate3, vendorname3, reversecharge3, ponumber3, podate3, productName3, unitrate13, quantity3, trucknumber13, drivername13, receivedby13);
		sqlInsert.insertDataToNFRPO1(moduleName4, invoicenumber4,	 invoicedate4, stockrecvddate4, vendorname4, reversecharge4, ponumber4, podate4, productName4, unitrate14, quantity4, trucknumber14, drivername14, receivedby14);

		Ap.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");

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
