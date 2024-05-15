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

import testPageObjects.LoginPage;
import testPageObjects.Staff_Master;

public class Tc_007_StaffMaster extends BaseClass {

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
	public void StaffMasterAdd() throws Exception {
		Staff_Master Sm = new Staff_Master(driver);

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Sm.ClickonStaffmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Staff Master");
		Thread.sleep(2000);
		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode("Abc123");
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj(Todaydate);
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		Sm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Staff master- Staff Added-" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}
	
	@Test(priority = 2)
	public void Multiple_StaffMasterAdd() throws Exception {
		
		
		
		Staff_Master Sm = new Staff_Master(driver);

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Sm.ClickonStaffmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Staff Master");
		Thread.sleep(2000);
		
		
		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode(Rd.randomstring());
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj("03/03/2024");
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		
		//2nd Staff
		
		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode2(Rd.randomstring());
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName2("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob2("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation2("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole2();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj2("03/03/2024");
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		
		//3rd Staff
		
		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode3(Rd.randomstring());
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName3("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob3("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation3("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole3();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj3("03/03/2024");
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		
		//4th Staff
		
		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode4(Rd.randomstring());
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName4("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob4("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation4("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole4();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj4("03/03/2024");
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		
		
		
		Sm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Staff master- Staff Added-" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}

	@Test(enabled = false)
	public void StaffMasterDeleteAdd() throws Exception {

		Staff_Master Sm = new Staff_Master(driver);

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Sm.ClickonStaffmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Staff Master");
		Thread.sleep(2000);
		Sm.ClickonDelete();
		logg.info(getClass().getName() + " - " + "Clicked On Delete");
		Sm.ClickonConfrmDelete();
		logg.info(getClass().getName() + " - " + "Clicked On Confirm Delete");
		Thread.sleep(2000);
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Staff master- Staff Deleted-" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		Sm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Thread.sleep(2000);
		Sm.EnterEmpCode("Abc123");
		logg.info(getClass().getName() + " - " + "Entered Emp Code");
		Sm.EnterEmpName("TestQa");
		logg.info(getClass().getName() + " - " + "Entered Emp Name");
		Sm.EnterDob("03/01/2000");
		logg.info(getClass().getName() + " - " + "Entered Dob");
		Thread.sleep(2000);
		Sm.EnterDesignation("Qa Engineer");
		logg.info(getClass().getName() + " - " + "Entered Designation");
		Sm.SelectRole();
		logg.info(getClass().getName() + " - " + "Select  Role");
		Thread.sleep(2000);
		Sm.EnterDoj("03/03/2024");
		logg.info(getClass().getName() + " - " + "Entered DOJ");
		Thread.sleep(2000);
		Sm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(System.getProperty("user.dir") + "/Screenshots/"
				+ "Staff Master-Vehicle ReAdded After Delete- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");

	}

	@Test(enabled = false)
	public void StaffMasterEditData() throws Exception {
		Staff_Master Sm = new Staff_Master(driver);

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Sm.ClickonStaffmaster();
		logg.info(getClass().getName() + " - " + "Clicked On Staff Master");
		Sm.EditEmployee();
		logg.info(getClass().getName() + " - " + "Edited Employee Data");
		Sm.EnterAadhar("123456789741");
		logg.info(getClass().getName() + " - " + "Edited Employee Aadhar");
		Sm.EnterPan("abcdf1234a");
		logg.info(getClass().getName() + " - " + "Edited Employee Pan");
		Sm.EnterBankacc("1234567891021452");
		logg.info(getClass().getName() + " - " + "Edited Employee Bank Acc");
		Sm.EnterContact("6458452147");
		logg.info(getClass().getName() + " - " + "Edited Employee Contact Data");
		Sm.EnterUan("111111111111");
		logg.info(getClass().getName() + " - " + "Edited Employee UAN");
		Thread.sleep(2000);
		Sm.SelectBloodGrp();
		logg.info(getClass().getName() + " - " + "Edited Employee Blood Grp");
		Sm.EnterEmeNum("65644644465");
		logg.info(getClass().getName() + " - " + "Edited Employee Emergency Contact");
		Sm.EnterEmail("Test@test.com");
		logg.info(getClass().getName() + " - " + "Edited Employee Email");
		Sm.EnterAddress("uvasfdhhvsfhvsvfvshfjvjsvjfvsjjfvsjdvjhvfdsvfjsdfjvjhfdvsjdfdsfvjhdsvf");
		logg.info(getClass().getName() + " - " + "Edited Employee Address");
		Sm.ClickonEsicheck();
		logg.info(getClass().getName() + " - " + "Clicked On Esi Check");
		Thread.sleep(2000);
		Sm.EnterEsic("55555555555555555");
		logg.info(getClass().getName() + " - " + "Edited Esic Number");
		// Sm.ClickonPfcheck();
		Thread.sleep(2000);
		// Sm.EnterPf("4654564564654654665456");
		Sm.EditSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Staff master- Staff Data Edited-" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}

	@AfterMethod()
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
