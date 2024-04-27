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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.ARB_Sales;
import testPageObjects.LoginPage;
import testUtilities.Sql_Insert;

public class Tc_010_ARBSales extends BaseClass {
	
	Sql_Insert sqlInsert=new Sql_Insert();

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
	public void Com_Sales() throws Exception {
		ARB_Sales Arb = new ARB_Sales(driver);

		Arb.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Arb.ClickonSales();
		logg.info(getClass().getName() + " - " + "Clicked On Sales");
		Thread.sleep(2000);
		Arb.ClickonArbSales();
		logg.info(getClass().getName() + " - " + "Clicked On Blpg/Arb/Nfr Sales");
		Thread.sleep(2000);
		Arb.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Arb.EnterSalesDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Sales Date Entered ");
		Thread.sleep(2000);
		Arb.SelectCustName();
		logg.info(getClass().getName() + " - " + "Customer Selected");

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
		Thread.sleep(4000);
		Arb.EnterCustName(result.get(2));

		Arb.ClickOnFetchInv();
		Arb.SelectPODrop();
		//Arb.SelectPayterms();
		logg.info(getClass().getName() + " - " + "Payment Terms Selected");
		Arb.SelectStaff();
		logg.info(getClass().getName() + " - " + "Staff Selected For Responsible");
		Arb.Selectvehicle();
		logg.info(getClass().getName() + " - " + "Vehicle Selected For Transportation");
		Arb.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Product Is Selected From List");
		Arb.Enterdisc("1");
		logg.info(getClass().getName() + " - " + "Discount Entered");
		Arb.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Quantity Entered");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Bank Selected From List");
		Thread.sleep(2000);
		Arb.ClickOnFetchPrice();
		logg.info(getClass().getName() + " - " + "Clicked On fetch Price Button");
		Thread.sleep(2000);
		Arb.ClickonCalculate();
		
		//2nd 
		Arb.ClickonAddRow();
		Arb.SelectProdfromlist2();
		logg.info(getClass().getName() + " - " + "Product Is Selected From List");
		Arb.Enterdisc2("1");
		logg.info(getClass().getName() + " - " + "Discount Entered");
		Arb.EnterQanty2("100");
		logg.info(getClass().getName() + " - " + "Quantity Entered");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Bank Selected From List");
		Thread.sleep(2000);
		Arb.ClickOnFetchPrice();
		logg.info(getClass().getName() + " - " + "Clicked On fetch Price Button");
		Thread.sleep(2000);
		Arb.ClickonCalculate();
		
		// For the 3rd row
		Arb.ClickonAddRow();
		Arb.SelectProdfromlist3();
		logg.info(getClass().getName() + " - " + "Product Is Selected From List (3rd row)");
		Arb.Enterdisc3("1");
		logg.info(getClass().getName() + " - " + "Discount Entered (3rd row)");
		Arb.EnterQanty3("100");
		logg.info(getClass().getName() + " - " + "Quantity Entered (3rd row)");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Bank Selected From List (3rd row)");
		Thread.sleep(2000);
		Arb.ClickOnFetchPrice();
		logg.info(getClass().getName() + " - " + "Clicked On fetch Price Button (3rd row)");
		Thread.sleep(2000);
		Arb.ClickonCalculate();

		// For the 4th row
		Arb.ClickonAddRow();
		Arb.SelectProdfromlist4();
		logg.info(getClass().getName() + " - " + "Product Is Selected From List (4th row)");
		Arb.Enterdisc4("1");
		logg.info(getClass().getName() + " - " + "Discount Entered (4th row)");
		Arb.EnterQanty4("100");
		logg.info(getClass().getName() + " - " + "Quantity Entered (4th row)");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Bank Selected From List (4th row)");
		Thread.sleep(2000);
		Arb.ClickOnFetchPrice();
		logg.info(getClass().getName() + " - " + "Clicked On fetch Price Button (4th row)");
		Thread.sleep(2000);
		Arb.ClickonCalculate();

		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);
		
		String modulename = "Nfr/Arb Sales";
		String invoicedate = Todaydate;
		String invoicenumber = RandomInt;
		String custname = result.get(2); // Assuming 'custname' maps to 'vendorname' in the table
		String ponumber = Arb.Poname();
		String poterms = "credit";
		String staffname = Arb.Staff();
		String trucknumber = Arb.Vehicle();
		String productName = Arb.Productname();
		int discount = 1;
		int quantity = 100;
		
		//2nd
		
		String modulename2 = "Nfr/Arb Sales";
		String invoicedate2 = Todaydate;
		String invoicenumber2 = RandomInt;
		String custname2 = result.get(3); // Assuming 'custname' maps to 'vendorname' in the table
		String ponumber2 = Arb.Poname();
		String poterms2 = "credit";
		String staffname2 = Arb.Staff();
		String trucknumber2 = Arb.Vehicle();
		String productName2 = Arb.Productname();
		int discount2 = 1;
		int quantity2 = 100;

		//3rd
		
		String modulename3 = "Nfr/Arb Sales";
		String invoicedate3 = Todaydate;
		String invoicenumber3 = RandomInt;
		String custname3 = result.get(4); // Assuming 'custname' maps to 'vendorname' in the table
		String ponumber3 = Arb.Poname();
		String poterms3 = "credit";
		String staffname3 = Arb.Staff();
		String trucknumber3 = Arb.Vehicle();
		String productName3 = Arb.Productname();
		int discount3 = 1;
		int quantity3 = 100;

		//4th
		
		String modulename4 = "Nfr/Arb Sales";
		String invoicedate4 = Todaydate;
		String invoicenumber4 = RandomInt;
		String custname4 = result.get(5); // Assuming 'custname' maps to 'vendorname' in the table
		String ponumber4 = Arb.Poname();
		String poterms4 = "credit";
		String staffname4 = Arb.Staff();
		String trucknumber4 = Arb.Vehicle();
		String productName4 = Arb.Productname();
		int discount4 = 1;
		int quantity4 = 100;



		sqlInsert.insertDataToNFRSales01(modulename, invoicenumber, invoicedate, custname,ponumber, poterms,
			    staffname, trucknumber, productName, discount, quantity);
		sqlInsert.insertDataToNFRSales01(modulename2, invoicenumber2, invoicedate2, custname2, ponumber2, poterms2,
			    staffname2, trucknumber2, productName2, discount2, quantity2);
		sqlInsert.insertDataToNFRSales01(modulename3, invoicenumber3, invoicedate3, custname3, ponumber3, poterms3,
			    staffname3, trucknumber3, productName3, discount3, quantity3);
		sqlInsert.insertDataToNFRSales01(modulename4, invoicenumber4, invoicedate4, custname4, ponumber4, poterms4,
			    staffname4, trucknumber4, productName4, discount4, quantity4);


		Arb.ClickonSaveAndPreviw();
		Arb.ClickonSave();
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
