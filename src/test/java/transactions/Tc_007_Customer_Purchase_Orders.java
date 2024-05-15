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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;
import testPageObjects.Purchase_Orders;

public class Tc_007_Customer_Purchase_Orders extends BaseClass {

	@Test(priority = 1)
	public void login() throws Exception {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);

		l.AgencyId(username);
		logg.info("Agencyid Entered");
		l.password(password);
		logg.info("Password Entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		l.submitclick();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
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
	public void Purchase_Order() throws Exception {

		Purchase_Orders Po = new Purchase_Orders(driver);

		driver.navigate().refresh();
		Po.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Po.ClickonSales();
		logg.info(getClass().getName() + " - " + "Clicked On Sales");
		Po.ClickonPO();
		logg.info(getClass().getName() + " - " + "Clicked On Sales");
		Po.ClickOnAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Po.EnterPoNum("PO/23-0001");
		logg.info(getClass().getName() + " - " + "Entered PUrchase Order Number");
		Po.EnterPODate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Purchase Order Date");

		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "var dataList = document.getElementById('cust');\n"
				+ "var options = dataList.getElementsByTagName('option');\n"
				+ "var values = [];\n"
				+ "for (var i = 0; i < options.length; i++) {\n" 
				+ "    values.push(options[i].value);\n" + 
				"}\n" + "return values;";
		@SuppressWarnings("unchecked")
		List<String> result = (List<String>) js.executeScript(script);

		// Print the result
		for (String value : result) {
			System.out.println(value);
		}

		if (!result.isEmpty()) {
		    Po.EnterCustName(result.get(5)); // Assuming you want the first element
		    logg.info(getClass().getName() + " - " + "Entered Purchase Order Name");
		} else {
		    logg.error("No options found in the datalist");
		}

		//logg.info(getClass().getName() + " - " + "Entered Purchase Order Name");
		Thread.sleep(2000);
		Po.EnterValidUpto(threems);
		Po.EnterQtNum(RandomInt);
		Po.SelectPriceFlex();

		Po.EnterFootnotes("Qa");

		logg.info(getClass().getName() + " - " + "Entered FootNotes");
		Thread.sleep(2000);
		logg.info(getClass().getName() + " - " + "Selected Sale Type");
		Po.SelectProdCatfromlist();
		logg.info(getClass().getName() + " - " + "Selected Product Category From List");
		Po.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Thread.sleep(2000);
		Po.Enterdisc("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Po.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Po.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Po.ClickonCalculate();

		// 2nd

		Po.ClickonAddRow();
		Po.SelectProdCatfromlist2();
		logg.info(getClass().getName() + " - " + "Selected Product Category From List");
		Po.SelectProdfromlist2();
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Thread.sleep(2000);
		Po.Enterdisc2("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Po.EnterQanty2("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Po.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Po.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		// 3rd

		Po.ClickonAddRow();
		Po.SelectProdCatfromlist3();
		logg.info(getClass().getName() + " - " + "Selected Product Category From List");
		Po.SelectProdfromlist3();
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Thread.sleep(2000);
		Po.Enterdisc3("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Po.EnterQanty3("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Po.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Po.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		// 4th

		Po.ClickonAddRow();
		Po.SelectProdCatfromlist4();
		logg.info(getClass().getName() + " - " + "Selected Product Category From List");
		Po.SelectProdfromlist4();
		logg.info(getClass().getName() + " - " + "Selected Product From List");
		Thread.sleep(2000);
		Po.Enterdisc4("10");
		logg.info(getClass().getName() + " - " + "Entered Discount");
		Po.EnterQanty4("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Thread.sleep(2000);
		Po.ClickOnFetchGst();
		logg.info(getClass().getName() + " - " + "Clicked On FetchGst Button");
		Po.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate Button");
		Thread.sleep(2000);

		Po.ClickonSave();
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
