package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testCases.TodayDate;
import testPageObjects.Cylinder_Purchases;
import testPageObjects.LoginPage;
import testUtilities.Sql_Insert;

public class Tc_001_Cylinder_Purchases extends BaseClass {
	
	 Sql_Insert sqlInsert = new Sql_Insert();

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
		
		//Cp.secondprod();
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
