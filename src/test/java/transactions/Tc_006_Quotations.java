package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testCases.TodayDate;
import testPageObjects.LoginPage;
import testPageObjects.Quotations;
import testUtilities.Sql_Insert;

public class Tc_006_Quotations extends BaseClass {

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
	public void Quotations() throws Exception {

		Quotations Q = new Quotations(driver);
		// TodayDate td = new TodayDate();
		Thread.sleep(5000);
		driver.navigate().refresh();

		Q.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(2000);
		Q.ClickonSales();
		logg.info(getClass().getName() + " - " + "Clicked On Sales");
		Thread.sleep(2000);
		Q.ClickonQuotations();
		logg.info(getClass().getName() + " - " + "Clicked On Quotations");
		Q.EnterSecretPin("1234");
		logg.info(getClass().getName() + " - " + "Secret Pin Entered");
		Q.ClickonSubmitPin();
		logg.info(getClass().getName() + " - " + "Clicked On Submit Pin");
		Q.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Q.EnterQuteDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Quotation Date Entered");
		Q.SelectCustReg();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "var dataList = document.getElementById('cust');\n"
				+ "var options = dataList.getElementsByTagName('option');\n" + "var values = [];\n"
				+ "for (var i = 0; i < options.length; i++) {\n" + "    values.push(options[i].value);\n" + "}\n"
				+ "return values;";
		@SuppressWarnings("unchecked")
		List<String> result = (List<String>) js.executeScript(script);

		// Print the result
		for (String value : result) {
			System.out.println(value);
		}

		Q.EnterCustName(result.get(4));
		logg.info(getClass().getName() + " - " + "Entered Customer Name");
		Thread.sleep(2000);
		// Q.EnterAddrss("iudsfbsdbfiubdsbidsbfbuidsbufibdsuifbuibsduifbdsiubuifbuifidsiufuifbiubdsufbfibsdf");
		// Q.EnterGstIn("36aanan1234a1a1");

		Q.SelectStafffromlist2();
		logg.info(getClass().getName() + " - " + "Selected Staff Responsible");
		Q.EnterFootnotes("Qa");
		logg.info(getClass().getName() + " - " + "Entered FootNotes");
		Thread.sleep(2000);
		Q.ClickonSaleType();
		logg.info(getClass().getName() + " - " + "Clicked On Sale Type");
		Q.SelectProdCatfromlist();
		logg.info(getClass().getName() + " - " + "Select Product Category From List");
		Q.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Select Product From List");
		Thread.sleep(2000);
		Q.Enterdisc("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Q.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Q.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On Fetch Gst Button");
		Thread.sleep(2000);
		Q.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		// 2nd
		Q.ClickonAddRow();
		Q.SelectProdCatfromlist2();
		logg.info(getClass().getName() + " - " + "Select Product Category From List");
		Q.SelectProdfromlist2();
		logg.info(getClass().getName() + " - " + "Select Product From List");
		Thread.sleep(2000);
		Q.Enterdisc2("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Q.EnterQanty2("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Q.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On Fetch Gst Button");
		Q.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		// 3rd
		Q.ClickonAddRow();
		Q.SelectProdCatfromlist3();
		logg.info(getClass().getName() + " - " + "Select Product Category From List");
		Q.SelectProdfromlist3();
		logg.info(getClass().getName() + " - " + "Select Product From List");
		Thread.sleep(2000);
		Q.Enterdisc3("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Q.EnterQanty3("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Q.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On Fetch Gst Button");
		Q.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		// 4th

		Q.ClickonAddRow();
		Q.SelectProdCatfromlist4();
		logg.info(getClass().getName() + " - " + "Select Product Category From List");
		Q.SelectProdfromlist4();
		logg.info(getClass().getName() + " - " + "Select Product From List");
		Thread.sleep(2000);
		Q.Enterdisc4("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Q.EnterQanty4("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Q.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On Fetch Gst Button");
		Q.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		String moduleName = "Quotation Module";
		String quotationdate = Todaydate;
		String custname = result.get(4); // Assuming 'custname' maps to 'vendorname' in the table
		String staffname = "TestQa";
		String narration = "Sample narration";
		String productcategory = Q.ProductCat();
		String productName = Q.Productname();
		int discount = 1;
		int quantity = 50;

		String moduleName2 = "Quotation Module";
		String quotationdate2 = Todaydate;
		String custname2 = result.get(4); // Assuming 'custname' maps to 'vendorname' in the table
		String staffname2 = "TestQa";
		String narration2 = "Sample narration";
		String productcategory2 = Q.ProductCat2();
		String productName2 = Q.Productname2();
		int discount2 = 1;
		int quantity2 = 50;

		String moduleName3 = "Quotation Module";
		String quotationdate3 = Todaydate;
		String custname3 = result.get(4); // Assuming 'custname' maps to 'vendorname' in the table
		String staffname3 = "TestQa";
		String narration3 = "Sample narration";
		String productcategory3 = Q.ProductCat3();
		String productName3 = Q.Productname3();
		int discount3 = 1;
		int quantity3 = 50;

		String moduleName4 = "Quotation Module";
		String quotationdate4 = Todaydate;
		String custname4 = result.get(4); // Assuming 'custname' maps to 'vendorname' in the table
		String staffname4 = "TestQa";
		String narration4 = "Sample narration";
		String productcategory4 = Q.ProductCat4();
		String productName4 = Q.Productname4();
		int discount4 = 1;
		int quantity4 = 50;

		sqlInsert.insertDataToQuotations(moduleName, quotationdate, custname, staffname, narration, productcategory,
				productName, discount, quantity);
		sqlInsert.insertDataToQuotations(moduleName2, quotationdate2, custname2, staffname2, narration2,
				productcategory2, productName2, discount2, quantity2);
		sqlInsert.insertDataToQuotations(moduleName3, quotationdate3, custname3, staffname3, narration3,
				productcategory3, productName3, discount3, quantity3);
		sqlInsert.insertDataToQuotations(moduleName4, quotationdate4, custname4, staffname4, narration4,
				productcategory4, productName4, discount4, quantity4);

		//Q.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save Button");

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
