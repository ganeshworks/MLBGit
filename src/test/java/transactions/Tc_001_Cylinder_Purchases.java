package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
=======
>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import testCases.BaseClass;
import testCases.TodayDate;
import testPageObjects.Cylinder_Purchases;
import testPageObjects.Equipment_Master;
import testPageObjects.LoginPage;
<<<<<<< HEAD
import testUtilities.Sql_Delete_Insert;
=======
>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20
import testUtilities.Sql_Insert;

public class Tc_001_Cylinder_Purchases extends BaseClass {
	
	 Sql_Insert sqlInsert = new Sql_Insert();

	Sql_Insert sqlInsert = new Sql_Insert();
	Sql_Delete_Insert SqlDelete = new Sql_Delete_Insert();

	@Test(priority = 1)
	public void login() throws Exception {
		driver.get(baseurl);
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.manage().deleteAllCookies();

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
	public void cyl_Purchase() throws Exception {
		TodayDate td = new TodayDate();

		String formattedDate = TodayDate.getFormattedDate();

		Cylinder_Purchases Cp = new Cylinder_Purchases(driver);

		Cp.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		Cp.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Cp.ClickonCylPurc();
		logg.info(getClass().getName() + " - " + "Clicked On Cyl Purchases");
		Cp.ClickOnAdd();
		Thread.sleep(5000);
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Cp.SelectOmcfromlist();
		logg.info(getClass().getName() + " - " + "Select Omc Plant From List");
		Cp.EnterRefNo("@-*ab123");
		logg.info(getClass().getName() + " - " + "Entered Reference Number");
		Cp.EnterInvDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");
		Thread.sleep(2000);
		Cp.EnterStckRecDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Stock Received Date");
		Cp.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Select Product From list");
		Thread.sleep(2000);
		Cp.SelectLoadType();
		logg.info(getClass().getName() + " - " + "Select Load type");
		Cp.EnterUnitRate(RandomInt);
		logg.info(getClass().getName() + " - " + "Entered UnitRate");
		Thread.sleep(2000);
		Cp.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Cp.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Cp.EnterTruck("Ts36ab1234");
		logg.info(getClass().getName() + " - " + "Entered Vehicle Number");
		Cp.EnterDrivername("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver Name");
		Cp.SelectGodown();
		logg.info(getClass().getName() + " - " + "Selected Godown");
		Thread.sleep(2000);
		Cp.SelectRecdBy();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);
		Cp.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
<<<<<<< HEAD
		Cp.ClickonLoadSub();
=======
>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20

		/*
		 * String
		 * Exp=driver.findElement(By.xpath("//*[@id=\"2\"]/div[1]/div")).getText();
		 * String Act="cylinder purchase Created";
		 * 
		 * Assert.assertEquals(Exp, Act);
		 * 
		 * System.out.println("Cyl Purchase Created Suucessfully");
		 */

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Cylinder Purchase- Purchase Added-" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}

	@Test(priority = 2)
	public void multi_cyl_Purchase() throws Exception {
		TodayDate td = new TodayDate();

		String formattedDate = TodayDate.getFormattedDate();

		Cylinder_Purchases Cp = new Cylinder_Purchases(driver);

		Cp.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		Cp.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Cp.ClickonCylPurc();
		logg.info(getClass().getName() + " - " + "Clicked On Cyl Purchases");
		Cp.ClickOnAdd();
		Thread.sleep(5000);
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Cp.SelectOmcfromlist();
		logg.info(getClass().getName() + " - " + "Select Omc Plant From List");
		Cp.EnterRefNo(RandomInt);
		logg.info(getClass().getName() + " - " + "Entered Reference Number");
		Cp.EnterInvDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Invoice Date");
		Thread.sleep(2000);
		Cp.EnterStckRecDate(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered Stock Received Date");
		Cp.SelectProdfromlist();
		logg.info(getClass().getName() + " - " + "Select Product From list");
		Thread.sleep(2000);
		Cp.SelectLoadType();
		logg.info(getClass().getName() + " - " + "Select Load type");
		Cp.EnterUnitRate("120");
		logg.info(getClass().getName() + " - " + "Entered UnitRate");
		Thread.sleep(2000);
		Cp.EnterQanty("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Cp.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Cp.EnterTruck(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Number");
		Cp.EnterDrivername("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver Name");
		Cp.SelectGodown();
		logg.info(getClass().getName() + " - " + "Selected Godown");
		Thread.sleep(2000);
		Cp.SelectRecdBy();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

		// 2nd
		Cp.ClickonAddRow();
		Cp.SelectProdfromlist2();
		logg.info(getClass().getName() + " - " + "Select Product From list");
		Thread.sleep(2000);
<<<<<<< HEAD

		// Cp.secondprod();
=======
		
		//Cp.secondprod();
>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20
		Cp.SelectLoadType2();
		logg.info(getClass().getName() + " - " + "Select Load type");
		Cp.EnterUnitRate2("120");
		logg.info(getClass().getName() + " - " + "Entered UnitRate");
		Thread.sleep(2000);
		Cp.EnterQanty2("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Cp.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Cp.EnterTruck2(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Number");
		Cp.EnterDrivername2("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver Name");
		Cp.SelectGodown2();
		logg.info(getClass().getName() + " - " + "Selected Godown");
		Thread.sleep(2000);
		Cp.SelectRecdBy2();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

		// 3rd
		Cp.ClickonAddRow();
		Cp.SelectProdfromlist3();
		logg.info(getClass().getName() + " - " + "Select Product From list");
		Thread.sleep(2000);
		Cp.SelectLoadType3();
		logg.info(getClass().getName() + " - " + "Select Load type");
		Cp.EnterUnitRate3("120");
		logg.info(getClass().getName() + " - " + "Entered UnitRate");
		Thread.sleep(2000);
		Cp.EnterQanty3("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Cp.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Cp.EnterTruck3(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Number");
		Cp.EnterDrivername3("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver Name");
		Cp.SelectGodown3();
		logg.info(getClass().getName() + " - " + "Selected Godown");
		Thread.sleep(2000);
		Cp.SelectRecdBy3();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

		// 4th
		Cp.ClickonAddRow();
		Cp.SelectProdfromlist4();
		logg.info(getClass().getName() + " - " + "Select Product From list");
		Thread.sleep(2000);
		Cp.SelectLoadType4();
		logg.info(getClass().getName() + " - " + "Select Load type");
		Cp.EnterUnitRate4("120");
		logg.info(getClass().getName() + " - " + "Entered UnitRate");
		Thread.sleep(2000);
		Cp.EnterQanty4("100");
		logg.info(getClass().getName() + " - " + "Entered Quantity");
		Cp.ClickonCalculate();
		logg.info(getClass().getName() + " - " + "Clicked On Calculate");
		Cp.EnterTruck4(Vehiclenum);
		logg.info(getClass().getName() + " - " + "Entered Vehicle Number");
		Cp.EnterDrivername4("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Driver Name");
		Cp.SelectGodown4();
		logg.info(getClass().getName() + " - " + "Selected Godown");
		Thread.sleep(2000);
		Cp.SelectRecdBy4();
		logg.info(getClass().getName() + " - " + "Selected Received By Staff");
		Thread.sleep(2000);

<<<<<<< HEAD
		String modulename1 = "Cylinder Purchase";
		String invoicenumber1 = RandomInt;
		String invoicedate1 = Todaydate;
		String stockrecvddate1 = Todaydate;
		String productName1 = Cp.firstprod();
		String loadtype1 = Cp.firstload();
		int unitrate1 = 100;
		String trucknumber1 = Vehiclenum;
		String drivername1 = "TestQa";
		String godown1 = Cp.secondgodwn();
		String receivedby1 = Cp.secondrecvdBy();

		String modulename2 = "Cylinder Purchase";
		String invoicenumber2 = RandomInt;
		String invoicedate2 = Todaydate;
		String stockrecvddate2 = Todaydate;
		String productName2 = Cp.secondprod();
		String loadtype2 = Cp.secondload();
		int unitrate2 = 100;
		String trucknumber2 = Vehiclenum;
		String drivername2 = "TestQa";
		String godown2 = Cp.secondgodwn();
		String receivedby2 = Cp.secondrecvdBy();

		String modulename3 = "Cylinder Purchase";
		String invoicenumber3 = RandomInt;
		String invoicedate3 = Todaydate;
		String stockrecvddate3 = Todaydate;
		String productName3 = Cp.thirdprod();
		String loadtype3 = Cp.thirdload();
		int unitrate3 = 100;
		String trucknumber3 = Vehiclenum;
		String drivername3 = "TestQa";
		String godown3 = Cp.secondgodwn();
		String receivedby3 = Cp.thirdrecvdBy();

		String modulename4 = "Cylinder Purchase";
		String invoicenumber4 = RandomInt;
		String invoicedate4 = Todaydate;
		String stockrecvddate4 = Todaydate;
		String productName4 = Cp.fourthprod();
		String loadtype4 = Cp.fourthload();
		int unitrate4 = 100;
		String trucknumber4 = Vehiclenum;
		String drivername4 = "TestQa";
		String godown4 = Cp.secondgodwn();
		String receivedby4 = Cp.fourthrecvdBy();

		// Call the insertDataToMySQL method with sample data
		// For the first data table
		sqlInsert.insertDataToMySQL1(modulename1, invoicenumber1, invoicedate1, stockrecvddate1, productName1,
				loadtype1, unitrate1, trucknumber1, drivername1, godown1, receivedby1);

		// For the second data table
		sqlInsert.insertDataToMySQL2(modulename2, invoicenumber2, invoicedate2, stockrecvddate2, productName2,
				loadtype2, unitrate2, trucknumber2, drivername2, godown2, receivedby2);

		// For the third data table
		sqlInsert.insertDataToMySQL3(modulename3, invoicenumber3, invoicedate3, stockrecvddate3, productName3,
				loadtype3, unitrate3, trucknumber3, drivername3, godown3, receivedby3);

		// For the fourth data table
		sqlInsert.insertDataToMySQL4(modulename4, invoicenumber4, invoicedate4, stockrecvddate4, productName4,
				loadtype4, unitrate4, trucknumber4, drivername4, godown4, receivedby4);

		Cp.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		 Cp.ClickonLoadSub();

	}

	@Test(priority = 3)
	public void Delete() throws Exception {
		TodayDate td = new TodayDate();

		String formattedDate = TodayDate.getFormattedDate();

		Cylinder_Purchases Cp = new Cylinder_Purchases(driver);

		Equipment_Master Eq = new Equipment_Master(driver);

		Eq.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();

		Eq.dropdownselect();

		WebElement table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (!columns.isEmpty()) {

				String PRODNAME = columns.get(0).getText();
				String UNITS = columns.get(1).getText();
				String GST = columns.get(2).getText();
				String HSNCODE = columns.get(3).getText();
				String SECDEP = columns.get(4).getText();
				String OPFULLS = columns.get(5).getText();
				String OPEMPTIES = columns.get(6).getText();
				String CURFULLS = columns.get(7).getText();
				String CUREMP = columns.get(8).getText();
				String EFFDATE = columns.get(9).getText();
				String flag = "0";
				SqlDelete.insertDataToMySQL(PRODNAME, UNITS, GST, HSNCODE, SECDEP, OPFULLS, OPEMPTIES, CURFULLS, CUREMP,
						EFFDATE, flag);
			}
			for (WebElement column : columns) {
				System.out.print(column.getText() + "\t");
			}
			System.out.println();
		}

		WebElement table1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div"));
		List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
		StringBuilder tableData = new StringBuilder();

		for (WebElement row : rows1) {
			List<WebElement> columns = row.findElements(By.tagName("td"));

			for (WebElement column : columns) {
				tableData.append(column.getText()).append("\t");
			}
			tableData.append("\n");
		}

		Cp.ClickonTransactions();
		logg.info(getClass().getName() + " - " + "Clicked On Transactions");
		Thread.sleep(5000);
		Cp.ClickonPurchases();
		logg.info(getClass().getName() + " - " + "Clicked On Purchases");
		Cp.ClickonCylPurc();
		logg.info(getClass().getName() + " - " + "Clicked On Cyl Purchases");

		Cp.ClickonView();

		WebElement tablecp = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div/table"));

		List<WebElement> Rows1to4 = tablecp.findElements(By.tagName("tr"));

		List<String> extractedValues = new ArrayList<>();

		for (WebElement row : Rows1to4) {
			List<WebElement> columns = row.findElements(By.tagName("td"));

			if (!columns.isEmpty()) {
				WebElement firstColumn = columns.get(0);
				String productName = firstColumn.getText();
				// System.out.println(firstColumn.getText());
				extractedValues.add(productName);
				System.out.println("Extracted Values Are-"+productName);
			}

		}
		System.out.println("testvalues-------"+extractedValues);
		 
		

		driver.findElement(By.xpath("//button[@class='Modal_closeBtn__UVUsp']//*[name()='svg']")).click();
		Thread.sleep(5000);
		Cp.ClickonDeleteCard();
		Cp.ClickonSubmitdelete();

		Eq.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();

		Eq.dropdownselect();

		WebElement table11 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div"));

		List<WebElement> rows11 = table11.findElements(By.tagName("tr"));

		for (WebElement row : rows11) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			if (!columns.isEmpty()) {

				String PRODNAME = columns.get(0).getText();
				String UNITS = columns.get(1).getText();
				String GST = columns.get(2).getText();
				String HSNCODE = columns.get(3).getText();
				String SECDEP = columns.get(4).getText();
				String OPFULLS = columns.get(5).getText();
				String OPEMPTIES = columns.get(6).getText();
				String CURFULLS = columns.get(7).getText();
				String CUREMP = columns.get(8).getText();
				String EFFDATE = columns.get(9).getText();
				String flag = "1";
				SqlDelete.insertDataToMySQL(PRODNAME, UNITS, GST, HSNCODE, SECDEP, OPFULLS, OPEMPTIES, CURFULLS, CUREMP,
						EFFDATE, flag);
			}
			for (WebElement column : columns) {
				System.out.print(column.getText() + "\t");
			}
			System.out.println();
		}

		WebElement table111 = driver.findElement(By.xpath("//*[@id='root']/div[1]/div[3]/div[2]/div/div[3]/div"));
		List<WebElement> rows111 = table111.findElements(By.tagName("tr"));

		// Process rows from the second table
		for (WebElement row : rows111) {
			List<WebElement> columns = row.findElements(By.tagName("td"));

			if (!columns.isEmpty()) {
				String PRODNAME = columns.get(0).getText();
				System.out.println("prods---"+PRODNAME);

				
				// Check if the product name is in the extractedValues list
				if (extractedValues.contains(PRODNAME)) {
					System.out.println("nene");
					String UNITS = columns.get(1).getText();
					String GST = columns.get(2).getText();
					String HSNCODE = columns.get(3).getText();
					String SECDEP = columns.get(4).getText();
					String OPFULLS = columns.get(5).getText();
					String OPEMPTIES = columns.get(6).getText();
					String CURFULLS = columns.get(7).getText();
					String CUREMP = columns.get(8).getText();
					String EFFDATE = columns.get(9).getText();
					String flag = "2";

					// Insert the filtered data into the MySQL database
					SqlDelete.insertDataToMySQL(PRODNAME, UNITS, GST, HSNCODE, SECDEP, OPFULLS, OPEMPTIES, CURFULLS,
							CUREMP, EFFDATE, flag);
				}

				for (WebElement column : columns) {
					System.out.print(column.getText() + "\t");
				}
			}
			System.out.println();
		}

		WebElement table1111 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div"));
		List<WebElement> rows1111 = table1111.findElements(By.tagName("tr"));
		StringBuilder tableData1 = new StringBuilder();

		for (WebElement row1 : rows1111) {
			List<WebElement> columns2 = row1.findElements(By.tagName("td"));

			for (WebElement column : columns2) {
				tableData1.append(column.getText()).append("\t");
			}
			tableData1.append("\n");
			// Add a new line for each row
		}
		String Exp = tableData.toString();
		String act = tableData1.toString();

		Assert.assertEquals(Exp, act);
=======
		
		Cp.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		
			String modulename1="Cylinder Purchase";
			String invoicenumber1 = RandomInt;
	        String invoicedate1 = Todaydate;
	        String stockrecvddate1 = Todaydate;
	        String productName1 = Cp.firstprod();
	        String loadtype1 = Cp.firstload();
	        int unitrate1 = 100;
	        String trucknumber1 = Vehiclenum;
	        String drivername1 = "TestQa";
	        String godown1 = Cp.secondgodwn();
	        String receivedby1 = Cp.secondrecvdBy();
	        
	        
	        String modulename2="Cylinder Purchase";
			String invoicenumber2 = RandomInt;
	        String invoicedate2 = Todaydate;
	        String stockrecvddate2 = Todaydate;
	        String productName2 = Cp.secondprod();
	        String loadtype2 = Cp.secondload();
	        int unitrate2 = 100;
	        String trucknumber2 = Vehiclenum;
	        String drivername2 = "TestQa";
	        String godown2 = Cp.secondgodwn();
	        String receivedby2 = Cp.secondrecvdBy();
	        
	        String modulename3="Cylinder Purchase";
			String invoicenumber3 = RandomInt;
	        String invoicedate3 = Todaydate;
	        String stockrecvddate3 = Todaydate;
	        String productName3 = Cp.thirdprod();
	        String loadtype3 = Cp.thirdload();
	        int unitrate3 = 100;
	        String trucknumber3 = Vehiclenum;
	        String drivername3 = "TestQa";
	        String godown3 = Cp.secondgodwn();
	        String receivedby3 = Cp.thirdrecvdBy();
	        
	        String modulename4="Cylinder Purchase";
			String invoicenumber4 = RandomInt;
	        String invoicedate4 = Todaydate;
	        String stockrecvddate4 = Todaydate;
	        String productName4 = Cp.fourthprod();
	        String loadtype4 = Cp.fourthload();
	        int unitrate4 = 100;
	        String trucknumber4 = Vehiclenum;
	        String drivername4 = "TestQa";
	        String godown4 = Cp.secondgodwn();
	        String receivedby4 = Cp.fourthrecvdBy();

	        // Call the insertDataToMySQL method with sample data
	     // For the first data table
	        sqlInsert.insertDataToMySQL1(modulename1, invoicenumber1, invoicedate1, stockrecvddate1, productName1, loadtype1, unitrate1,
	                        trucknumber1, drivername1, godown1, receivedby1);

	        // For the second data table
	        sqlInsert.insertDataToMySQL2(modulename2, invoicenumber2, invoicedate2, stockrecvddate2, productName2, loadtype2, unitrate2,
	                        trucknumber2, drivername2, godown2, receivedby2);

	        // For the third data table
	        sqlInsert.insertDataToMySQL3(modulename3, invoicenumber3, invoicedate3, stockrecvddate3, productName3, loadtype3, unitrate3,
	                        trucknumber3, drivername3, godown3, receivedby3);

	        // For the fourth data table
	        sqlInsert.insertDataToMySQL4(modulename4, invoicenumber4, invoicedate4, stockrecvddate4, productName4, loadtype4, unitrate4,
	                        trucknumber4, drivername4, godown4, receivedby4);


>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20
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
