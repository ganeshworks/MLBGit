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
import testPageObjects.Vehicle_Master;

public class Tc_006_vehicleMaster extends BaseClass {

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
	
	public void vehicleMstr() throws Exception {
		Vehicle_Master Vm=new Vehicle_Master(driver);
		
		//For Add Vehicle
		
		/*
		 * Vm.ClickonMasterData(); Vm.ClickonVehiclemaster(); Thread.sleep(2000);
		 * Vm.ClickonAdd(); Vm.EnterVehicleNo("Ts12Ab1234"); Vm.VehicleMake("TestQa");
		 * Vm.SelectVehicleType(); Thread.sleep(2000); Vm.SelectVehicleUse();
		 * Thread.sleep(2000); Vm.ClickonSave();
		 * 
		 * Thread.sleep(2000); String timestamp = new
		 * SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); TakesScreenshot
		 * ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Vehicle Master-Vehicle Duplicate- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
		
		//For Delete And Add Back
		
		Vm.ClickonMasterData();
		Vm.ClickonVehiclemaster();
		Thread.sleep(2000);
		Vm.ClickOnDelete();
		Vm.ClickOnConfrmDelete();
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Vehicle Master-Vehicle Delete- " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		Thread.sleep(10000);
		
		Vm.ClickonAdd();
		Vm.EnterVehicleNo("Ts12Ab1234");
		Vm.VehicleMake("TestQa");
		Vm.SelectVehicleType();
		Thread.sleep(2000);
		Vm.SelectVehicleUse();
		Thread.sleep(2000);
		Vm.ClickonSave();
		
		Thread.sleep(2000);
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Vehicle Master-Vehicle ReAdded After Delete- " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
	}

}
