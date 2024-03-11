package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		Staff_Master Sm=new Staff_Master(driver);
		
		Sm.ClickonMasterData();
		Sm.ClickonStaffmaster();
		Thread.sleep(2000);
		Sm.ClickonAdd();
		Thread.sleep(2000);
		Sm.EnterEmpCode("Abc123");
		Sm.EnterEmpName("TestQa");
		Sm.EnterDob("03/01/2000");
		Thread.sleep(2000);
		Sm.EnterDesignation("Qa Engineer");
		Sm.SelectRole();
		Thread.sleep(2000);
		Sm.EnterDoj("03/03/2024");
		Thread.sleep(2000);
		Sm.ClickonSave();
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Staff master- Staff Added-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		
		
	}
	@Test(enabled = false)
	public void StaffMasterDeleteAdd() throws Exception {
		Staff_Master Sm=new Staff_Master(driver);
		Sm.ClickonMasterData();
		Sm.ClickonStaffmaster();
		Thread.sleep(2000);
		Sm.ClickonDelete();
		Sm.ClickonConfrmDelete();
		Thread.sleep(2000);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Staff master- Staff Deleted-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		Sm.ClickonMasterData();
		Sm.ClickonStaffmaster();
		Thread.sleep(2000);
		Sm.ClickonAdd();
		Thread.sleep(2000);
		Sm.EnterEmpCode("Abc123");
		Sm.EnterEmpName("TestQa");
		Sm.EnterDob("03/01/2000");
		Thread.sleep(2000);
		Sm.EnterDesignation("Qa Engineer");
		Sm.SelectRole();
		Thread.sleep(2000);
		Sm.EnterDoj("03/03/2024");
		Thread.sleep(2000);
		Sm.ClickonSave();
		Thread.sleep(2000);
		
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Staff Master-Vehicle ReAdded After Delete- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
		
		
	}
	@Test(priority = 2)
	public void StaffMasterEditData() throws Exception {
		Staff_Master Sm=new Staff_Master(driver);
		Sm.ClickonMasterData();
		Sm.ClickonStaffmaster();
		Sm.EditEmployee();
		Sm.EnterAadhar("123456789741");
		Sm.EnterPan("abcdf1234a");
		Sm.EnterBankacc("1234567891021452");
		Sm.EnterContact("6458452147");
		Sm.EnterUan("111111111111");
		Thread.sleep(2000);
		Sm.SelectBloodGrp();
		Sm.EnterEmeNum("65644644465");
		Sm.EnterEmail("Test@test.com");
		Sm.EnterAddress("uvasfdhhvsfhvsvfvshfjvjsvjfvsjjfvsjdvjhvfdsvfjsdfjvjhfdvsjdfdsfvjhdsvf");
		Sm.ClickonEsicheck();
		Thread.sleep(2000);
		Sm.EnterEsic("55555555555555555");
		//Sm.ClickonPfcheck();
		Thread.sleep(2000);
		//Sm.EnterPf("4654564564654654665456");
		Sm.EditSave();
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Staff master- Staff Data Edited-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	
}
	}
