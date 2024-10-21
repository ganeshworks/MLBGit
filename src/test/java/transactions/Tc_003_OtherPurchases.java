package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testCases.TodayDate;
import testPageObjects.LoginPage;
import testUtilities.SqlQuery;
import testUtilities.Sql_Insert;

public class Tc_003_OtherPurchases extends BaseClass {

	Sql_Insert sqlInsert = new Sql_Insert();

	SqlQuery Sql = new SqlQuery();

	@Test(enabled = false)
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

	@Test(priority = 1)
	public void expencesYesItcYes() throws Exception {

		Other_Purchases Op = new Other_Purchases(driver);
		driver.navigate().refresh();

		Thread.sleep(5000);
		Op.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		Op.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Op.ClickonOtherPurch();
		logg.info(getClass().getName() + " - " + "Clicked On Other Purchases");
		Thread.sleep(2000);
		Op.ClickonExpYes();
		logg.info(getClass().getName() + " - " + "Clicked On Yes For Expenses Taxable Or Not");
		Op.ClickonItcYes();
		logg.info(getClass().getName() + " - " + "Clicked On Yes For Itc Eligible");
		Thread.sleep(2000);
		Op.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Op.EnterInvNo(RandomInt);
		logg.info(getClass().getName() + " - " + "Entered Invoice Reference Number");
		Op.EnterInvDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");

		Thread.sleep(10000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "var dataList = document.getElementById('custvend');\n"
				+ "var options = dataList.getElementsByTagName('option');\n" + "var values = [];\n"
				+ "for (var i = 0; i < options.length; i++) {\n" + "    values.push(options[i].value);\n" + "}\n"
				+ "return values;";
		@SuppressWarnings("unchecked")
		List<String> result = (List<String>) js.executeScript(script);

		// Print the result
		for (String value : result) {
			System.out.println(value);
		}

		Op.EnterVendName(result.get(2));
		logg.info(getClass().getName() + " - " + "Entered VendorName");
		Op.SelectRevCharge();

		Op.ClickOnPurchType();

		Thread.sleep(2000);
		Op.EnterProdName("QaTester");
		logg.info(getClass().getName() + " - " + "Entered Product Name");
		Op.EnterHsn(Sqldata);
		logg.info(getClass().getName() + " - " + "Entered Hsn Number");
		Op.SelectGstDrop();
		logg.info(getClass().getName() + " - " + "Selected Gst From List");
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop();
		logg.info(getClass().getName() + " - " + "Selected Minor Head");
		Op.SelectAccheadDrop();
		Op.EnterQanty("15");
		logg.info(getClass().getName() + " - " + "Entered Qunatity");
		Op.SelectUomfromlist();
		logg.info(getClass().getName() + " - " + "Select units From List");
		Thread.sleep(2000);
		Op.EnterUnitRate("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Thread.sleep(2000);

		/*
		 * // For the 2nd object Op.ClickonAddRow();
		 * 
		 * Op.EnterProdName2("QaTester"); logg.info(getClass().getName() + " - " +
		 * "Entered Product Name for 2nd object"); Op.EnterHsn2(Sqldata);
		 * logg.info(getClass().getName() + " - " +
		 * "Entered Hsn Number for 2nd object"); Op.SelectGstDrop2();
		 * logg.info(getClass().getName() + " - " +
		 * "Selected Gst From List for 2nd object"); Thread.sleep(2000);
		 * Op.SelectMinorHeadDrop2(); logg.info(getClass().getName() + " - " +
		 * "Selected Minor Head for 2nd object"); Op.EnterQanty2("15");
		 * logg.info(getClass().getName() + " - " + "Entered Quantity for 2nd object");
		 * Op.SelectUomfromlist2(); logg.info(getClass().getName() + " - " +
		 * "Selected Units From List for 2nd object"); Thread.sleep(2000);
		 * Op.EnterUnitRate2("154"); logg.info(getClass().getName() + " - " +
		 * "Entered Unit rate for 2nd object"); Thread.sleep(2000);
		 * Op.ClickonCalculate(); logg.info(getClass().getName() + " - " +
		 * "Clicked On Calculate for 2nd object"); Thread.sleep(2000);
		 * 
		 * // For the 3rd object Op.ClickonAddRow();
		 * 
		 * Op.EnterProdName3("QaTester"); logg.info(getClass().getName() + " - " +
		 * "Entered Product Name for 3rd object"); Op.EnterHsn3(Sqldata);
		 * logg.info(getClass().getName() + " - " +
		 * "Entered Hsn Number for 3rd object"); Op.SelectGstDrop3();
		 * logg.info(getClass().getName() + " - " +
		 * "Selected Gst From List for 3rd object"); Thread.sleep(2000);
		 * Op.SelectMinorHeadDrop3(); logg.info(getClass().getName() + " - " +
		 * "Selected Minor Head for 3rd object"); Op.EnterQanty3("15");
		 * logg.info(getClass().getName() + " - " + "Entered Quantity for 3rd object");
		 * Op.SelectUomfromlist3(); logg.info(getClass().getName() + " - " +
		 * "Selected Units From List for 3rd object"); Thread.sleep(2000);
		 * Op.EnterUnitRate3("154"); logg.info(getClass().getName() + " - " +
		 * "Entered Unit rate for 3rd object"); Thread.sleep(2000);
		 * Op.ClickonCalculate(); logg.info(getClass().getName() + " - " +
		 * "Clicked On Calculate for 3rd object"); Thread.sleep(2000);
		 * 
		 * // For the 4th object Op.ClickonAddRow();
		 * 
		 * Op.EnterProdName4("QaTester"); logg.info(getClass().getName() + " - " +
		 * "Entered Product Name for 4th object"); Op.EnterHsn4(Sqldata);
		 * logg.info(getClass().getName() + " - " +
		 * "Entered Hsn Number for 4th object"); Op.SelectGstDrop4();
		 * logg.info(getClass().getName() + " - " +
		 * "Selected Gst From List for 4th object"); Thread.sleep(2000);
		 * Op.SelectMinorHeadDrop4(); logg.info(getClass().getName() + " - " +
		 * "Selected Minor Head for 4th object"); Op.EnterQanty4("15");
		 * logg.info(getClass().getName() + " - " + "Entered Quantity for 4th object");
		 * Op.SelectUomfromlist4(); logg.info(getClass().getName() + " - " +
		 * "Selected Units From List for 4th object"); Thread.sleep(2000);
		 * Op.EnterUnitRate4("154"); logg.info(getClass().getName() + " - " +
		 * "Entered Unit rate for 4th object"); Thread.sleep(2000);
		 * Op.ClickonCalculate(); logg.info(getClass().getName() + " - " +
		 * "Clicked On Calculate for 4th object"); Thread.sleep(2000);
		 * 
		 * String modulename = "OtherPurchases ITC Eligible"; String invoicedate =
		 * Todaydate; String invoicenumber = RandomInt; String vendorname =
		 * result.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		 * String productName = "QaTester"; String hsn = Sqldata; int quantity = 540;
		 * String units = "Bags"; int unitrate = 100;
		 * 
		 * // Usage for the 2nd object String modulename2 =
		 * "OtherPurchases ITC Eligible 2"; String invoicedate2 = Todaydate; String
		 * invoicenumber2 = RandomInt; String vendorname2 = result.get(2); // Assuming
		 * 'custname' maps to 'vendorname' in the table String productName2 =
		 * "QaTester"; String hsn2 = Sqldata; int quantity2 = 540; String units2 =
		 * "Bags"; int unitrate2 = 100;
		 * 
		 * // Usage for the 3rd object String modulename3 =
		 * "OtherPurchases ITC Eligible 3"; String invoicedate3 = Todaydate; String
		 * invoicenumber3 = RandomInt; String vendorname3 = result.get(2); // Assuming
		 * 'custname' maps to 'vendorname' in the table String productName3 =
		 * "QaTester"; String hsn3 = Sqldata; int quantity3 = 540; String units3 =
		 * "Bags"; int unitrate3 = 100;
		 * 
		 * // Usage for the 4th object String modulename4 =
		 * "OtherPurchases ITC Eligible 4"; String invoicedate4 = Todaydate; String
		 * invoicenumber4 = RandomInt; String vendorname4 = result.get(2); // Assuming
		 * 'custname' maps to 'vendorname' in the table String productName4 =
		 * "QaTester"; String hsn4 = Sqldata; int quantity4 = 540; String units4 =
		 * "Bags"; int unitrate4 = 100;
		 */

		/*
		 * sqlInsert.insertDataToOtherPurchases(modulename, invoicedate, invoicenumber,
		 * vendorname, productName, hsn, quantity, units, unitrate);
		 * sqlInsert.insertDataToOtherPurchases(modulename2, invoicedate2,
		 * invoicenumber2, vendorname2, productName2, hsn2, quantity2, units2,
		 * unitrate2); sqlInsert.insertDataToOtherPurchases(modulename3, invoicedate3,
		 * invoicenumber3, vendorname3, productName3, hsn3, quantity3, units3,
		 * unitrate3); sqlInsert.insertDataToOtherPurchases(modulename4, invoicedate4,
		 * invoicenumber4, vendorname4, productName4, hsn4, quantity4, units4,
		 * unitrate4);
		 */

		Op.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);
	}

	@Test(priority = 2)

	public void expensesYesItcNo() throws Exception {
		Other_Purchases Op = new Other_Purchases(driver);

		WebDriverWait w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Transactions')]"))));

		Op.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		Op.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Op.ClickonOtherPurch();
		logg.info(getClass().getName() + " - " + "Clicked On Other Purchases");
		Thread.sleep(2000);
		Op.ClickonExpYes();
		logg.info(getClass().getName() + " - " + "Clicked On Yes For Expenses Taxable Or Not");
		Op.ClickonItcNo();
		logg.info(getClass().getName() + " - " + "Clicked On No For Itc Eligible");
		Thread.sleep(2000);
		Op.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Op.EnterInvNo(Randomstring);
		logg.info(getClass().getName() + " - " + "Entered Invoice Reference Number");
		Op.EnterInvDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "var dataList = document.getElementById('custvend');\n"
				+ "var options = dataList.getElementsByTagName('option');\n" + "var values = [];\n"
				+ "for (var i = 0; i < options.length; i++) {\n" + "    values.push(options[i].value);\n" + "}\n"
				+ "return values;";
		@SuppressWarnings("unchecked")

		String script1 = "var dataList = document.getElementById('custvend');\n"
				+ "var options = dataList.getElementsByTagName('option');\n" + "var texts = [];\n"
				+ "for (var i = 0; i < options.length; i++) {\n" + "    texts.push(options[i].textContent);\n" // Using
																												// textContent
																												// to
																												// get
																												// the
																												// text
																												// of
																												// the
																												// option
				+ "}\n" + "return texts;";

		List<String> result = (List<String>) js.executeScript(script);

		List<String> result1 = (List<String>) js.executeScript(script1);

		// Print the result
		for (String value : result) {
			System.out.println(value);
		}

		for (String value : result1) {
			System.out.println(value);
		}

		Op.EnterVendName(result.get(3));
		logg.info(getClass().getName() + " - " + "Entered VendorName");

		// Op.SelectRevCharge();
		Op.ClickOnPurchType();

		Thread.sleep(2000);
		Op.EnterProdName("QaTester");

		Op.EnterProdName("QaTester");
		logg.info(getClass().getName() + " - " + "Entered Product Name");
		Op.EnterHsn(Sql.Pref());
		logg.info(getClass().getName() + " - " + "Entered Hsn Number");
		Op.SelectGstDrop();
		logg.info(getClass().getName() + " - " + "Selected Gst From List");
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop();
		logg.info(getClass().getName() + " - " + "Selected Minor Head");
		Op.SelectAccheadDrop();
		Op.EnterQanty("15");
		logg.info(getClass().getName() + " - " + "Entered Qunatity");
		Op.SelectUomfromlist();
		logg.info(getClass().getName() + " - " + "Select units From List");
		Thread.sleep(2000);
		Op.EnterUnitRate("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Thread.sleep(2000);

		// For the 2nd object
		Op.ClickonAddRow();

		Op.EnterProdName2("QaTester");
		logg.info(getClass().getName() + " - " + "Entered Product Name for 2nd object");
		Op.EnterHsn2(Sqldata);
		logg.info(getClass().getName() + " - " + "Entered Hsn Number for 2nd object");
		Op.SelectGstDrop2();
		logg.info(getClass().getName() + " - " + "Selected Gst From List for 2nd object");
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop2();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 2nd object");
		Op.EnterQanty2("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 2nd object");
		Op.SelectUomfromlist2();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 2nd object");
		Thread.sleep(2000);
		Op.EnterUnitRate2("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 2nd object");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate for 2nd object");
		Thread.sleep(2000);

		// For the 3rd object
		Op.ClickonAddRow();

		Op.EnterProdName3("QaTester");
		logg.info(getClass().getName() + " - " + "Entered Product Name for 3rd object");
		Op.EnterHsn3(Sqldata);
		logg.info(getClass().getName() + " - " + "Entered Hsn Number for 3rd object");
		Op.SelectGstDrop3();
		logg.info(getClass().getName() + " - " + "Selected Gst From List for 3rd object");
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop3();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 3rd object");
		Op.EnterQanty3("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 3rd object");
		Op.SelectUomfromlist3();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 3rd object");
		Thread.sleep(2000);
		Op.EnterUnitRate3("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 3rd object");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate for 3rd object");
		Thread.sleep(2000);

		// For the 4th object
		Op.ClickonAddRow();

		Op.EnterProdName4("QaTester");
		logg.info(getClass().getName() + " - " + "Entered Product Name for 4th object");
		Op.EnterHsn4(Sqldata);
		logg.info(getClass().getName() + " - " + "Entered Hsn Number for 4th object");
		Op.SelectGstDrop4();
		logg.info(getClass().getName() + " - " + "Selected Gst From List for 4th object");
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop4();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 4th object");
		Op.EnterQanty4("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 4th object");
		Op.SelectUomfromlist4();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 4th object");
		Thread.sleep(2000);
		Op.EnterUnitRate4("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 4th object");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate for 4th object");
		Thread.sleep(2000);

		String modulename = "OtherPurchases ITC InEligible";
		String invoicedate = Todaydate;
		String invoicenumber = RandomInt;
		String vendorname = result1.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		String productName = "QaTesterTest";
		String hsn = Sqldata;
		int quantity = 540;
		String units = "Bags";
		int unitrate = 100;

		// Usage for the 2nd object
		String modulename2 = "OtherPurchases ITC InEligible2";
		String invoicedate2 = Todaydate;
		String invoicenumber2 = RandomInt;
		String vendorname2 = result1.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		String productName2 = "QaTester";
		String hsn2 = Sqldata;
		int quantity2 = 540;
		String units2 = "Bags";
		int unitrate2 = 100;

		// Usage for the 3rd object
		String modulename3 = "OtherPurchases ITC InEligible 3";
		String invoicedate3 = Todaydate;
		String invoicenumber3 = RandomInt;
		String vendorname3 = result1.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		String productName3 = "QaTester";
		String hsn3 = Sqldata;
		int quantity3 = 540;
		String units3 = "Bags";
		int unitrate3 = 100;

		// Usage for the 4th object
		String modulename4 = "OtherPurchases ITC InEligible 4";
		String invoicedate4 = Todaydate;
		String invoicenumber4 = RandomInt;
		String vendorname4 = result1.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		String productName4 = "QaTester";
		String hsn4 = Sqldata;
		int quantity4 = 540;
		String units4 = "Bags";
		int unitrate4 = 100;

		sqlInsert.insertDataToOtherPurchases(modulename, invoicedate, invoicenumber, vendorname, productName, hsn,
				quantity, units, unitrate);
		sqlInsert.insertDataToOtherPurchases(modulename2, invoicedate2, invoicenumber2, vendorname2, productName2, hsn2,
				quantity2, units2, unitrate2);
		sqlInsert.insertDataToOtherPurchases(modulename3, invoicedate3, invoicenumber3, vendorname3, productName3, hsn3,
				quantity3, units3, unitrate3);
		sqlInsert.insertDataToOtherPurchases(modulename4, invoicedate4, invoicenumber4, vendorname4, productName4, hsn4,
				quantity4, units4, unitrate4);

		// Op.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

	}

	@Test(enabled = false)

	public void expensesNo() throws Exception {
		Other_Purchases Op = new Other_Purchases(driver);

		WebDriverWait w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Transactions')]"))));

		Op.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(2000);
		Op.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Op.ClickonOtherPurch();
		logg.info(getClass().getName() + " - " + "Clicked On Other Purchases");
		Thread.sleep(2000);
		Op.ClickonExpNo();
		logg.info(getClass().getName() + " - " + "Clicked On No For Expenses Taxable Or Not");
		Op.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Op.EntervouchDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Enter Voucher Date");
		Op.ClickonFetch();
		logg.info(getClass().getName() + " - " + "Clicked On Fetch Button");
		Op.SelectTDSApp();
		Op.EnterExpeName("Expence1");
		logg.info(getClass().getName() + " - " + "Entered Expense Name");
		Op.SelectMinorHeadDropd();
		logg.info(getClass().getName() + " - " + "Selected Minor Head");
		Op.SelectAccheadDropd();
		Op.EnterQuntity("15");
		logg.info(getClass().getName() + " - " + "Entered Qunatity");
		Op.SelectUomdropd();
		logg.info(getClass().getName() + " - " + "Select units From List");
		Thread.sleep(2000);
		Op.EnterUnitRte("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate");
		Op.ClickonCalculte();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Op.SelectPayTerms();
		logg.info(getClass().getName() + " - " + "Selected Payterms");
		Op.Selectbank();
		logg.info(getClass().getName() + " - " + "Selected Bank");
		Op.SelectRecevdBy();
		Op.EnterNarration("TestQAEngineer");

		// For the 2nd object
		Op.ClickonAddRow();

		Op.EnterExpeName2("Expense1");
		logg.info(getClass().getName() + " - " + "Entered Expense Name for 2nd object");
		Op.SelectMinorHeadDropd2();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 2nd object");
		Op.EnterQuntity2("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 2nd object");
		Op.SelectUomdropd2();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 2nd object");
		Thread.sleep(2000);
		Op.EnterUnitRte2("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 2nd object");
		Op.ClickonCalculte();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button for 2nd object");
		Op.SelectPayTerms2();
		logg.info(getClass().getName() + " - " + "Selected Payterms for 2nd object");
		Op.Selectbank2();
		logg.info(getClass().getName() + " - " + "Selected Bank for 2nd object");
		Op.SelectRecevdBy2();
		Op.EnterNarration2("TestQAEngineer");
		logg.info(getClass().getName() + " - " + "Entered Narration for 2nd object");

		// For the 3rd object
		Op.ClickonAddRow();
		Op.EnterExpeName3("Expense1");
		logg.info(getClass().getName() + " - " + "Entered Expense Name for 3rd object");
		Op.SelectMinorHeadDropd3();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 3rd object");
		Op.EnterQuntity3("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 3rd object");
		Op.SelectUomdropd3();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 3rd object");
		Thread.sleep(2000);
		Op.EnterUnitRte3("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 3rd object");
		Op.ClickonCalculte();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button for 3rd object");
		Op.SelectPayTerms3();
		logg.info(getClass().getName() + " - " + "Selected Payterms for 3rd object");
		Op.Selectbank3();
		logg.info(getClass().getName() + " - " + "Selected Bank for 3rd object");
		Op.SelectRecevdBy3();
		Op.EnterNarration3("TestQAEngineer");
		logg.info(getClass().getName() + " - " + "Entered Narration for 3rd object");

		// For the 4th object
		Op.ClickonAddRow();
		Op.EnterExpeName4("Expense1");
		logg.info(getClass().getName() + " - " + "Entered Expense Name for 4th object");
		Op.SelectMinorHeadDropd4();
		logg.info(getClass().getName() + " - " + "Selected Minor Head for 4th object");
		Op.EnterQuntity4("15");
		logg.info(getClass().getName() + " - " + "Entered Quantity for 4th object");
		Op.SelectUomdropd4();
		logg.info(getClass().getName() + " - " + "Selected Units From List for 4th object");
		Thread.sleep(2000);
		Op.EnterUnitRte4("154");
		logg.info(getClass().getName() + " - " + "Entered Unit rate for 4th object");
		Op.ClickonCalculte();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button for 4th object");
		Op.SelectPayTerms4();
		logg.info(getClass().getName() + " - " + "Selected Payterms for 4th object");
		Op.Selectbank4();
		logg.info(getClass().getName() + " - " + "Selected Bank for 4th object");
		Op.SelectRecevdBy4();
		Op.EnterNarration4("TestQAEngineer");
		logg.info(getClass().getName() + " - " + "Entered Narration for 4th object");

		String modulename = "OtherPurchases NO";
		String invoicedate = Todaydate;
		String invoicenumber = RandomInt;
		String vendorname = "Expenses"; // Assuming 'custname' maps to 'vendorname' in the table
		String productName = "QaTesterTest";
		int quantity = 540;
		String units = "Bags";
		int unitrate = 100;
		String narration = "TestQAEngineer";

		// For the 2nd object
		String modulename2 = "OtherPurchases NO";
		String invoicedate2 = Todaydate;
		String invoicenumber2 = RandomInt;
		String vendorname2 = "Expenses";
		String productName2 = "QaTesterTest";
		int quantity2 = 100;
		String units2 = "Bags";
		int unitrate2 = 100;
		String narration2 = "TestQAEngineer";

		// For the 3rd object
		String modulename3 = "OtherPurchases NO";
		String invoicedate3 = Todaydate;
		String invoicenumber3 = RandomInt;
		String vendorname3 = "Expenses";
		String productName3 = "QaTesterTest";
		int quantity3 = 45;
		String units3 = "Bags";
		int unitrate3 = 100;
		String narration3 = "TestQAEngineer";

		// For the 4th object
		String modulename4 = "OtherPurchases NO";
		String invoicedate4 = Todaydate;
		String invoicenumber4 = RandomInt;
		String vendorname4 = "Expenses";
		String productName4 = "QaTesterTest";
		int quantity4 = 34;
		String units4 = "Bags";
		int unitrate4 = 100;
		String narration4 = "TestQAEngineer";

		sqlInsert.insertDataToOtherPurchasesNO(modulename, invoicedate, invoicenumber, vendorname, productName,
				quantity, units, unitrate, narration);
		// For the 2nd object
		sqlInsert.insertDataToOtherPurchasesNO(modulename2, invoicedate2, invoicenumber2, vendorname2, productName2,
				quantity2, units2, unitrate2, narration2);

		// For the 3rd object
		sqlInsert.insertDataToOtherPurchasesNO(modulename3, invoicedate3, invoicenumber3, vendorname3, productName3,
				quantity3, units3, unitrate3, narration3);

		// For the 4th object
		sqlInsert.insertDataToOtherPurchasesNO(modulename4, invoicedate4, invoicenumber4, vendorname4, productName4,
				quantity4, units4, unitrate4, narration4);

		// Op.ClickonSaveexp();
		logg.info(getClass().getName() + " - " + "Clicked On Save Expenses Button");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Other Purchase- Purchase Added Expense-No-" + timestamp + ".png");
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
