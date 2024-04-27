package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.random.RandomData;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
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

	@Test(enabled = false)

	public void vehicleMstr() throws Exception {
		Vehicle_Master Vm = new Vehicle_Master(driver);

		// For Add Vehicle

		Vm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Vm.ClickonVehiclemaster();
		logg.info(getClass().getName() + " - " + "Clicked On Vehicle Master");
		Thread.sleep(2000);
		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo("");
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake("TestQa");
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);
		Vm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");

		Thread.sleep(2000);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "Vehicle Master-Vehicle Duplicate- "
				+ timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");

		// For Delete And Add Back
	}

	@Test(priority = 2)

	public void Multiple_vehicleMstr() throws Exception {
		Vehicle_Master Vm = new Vehicle_Master(driver);
		
		Random random = new Random();

        // Generate a random integer between 1000 and 9999 (inclusive)
        int randomNumber = random.nextInt(9000) + 1000;
        int randomNumber2 = random.nextInt(9000) + 1000;
        int randomNumber3 = random.nextInt(9000) + 1000;
        int randomNumber4 = random.nextInt(9000) + 1000;

		// For 1st Add Vehicle

		Vm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Vm.ClickonVehiclemaster();
		logg.info(getClass().getName() + " - " + "Clicked On Vehicle Master");
		Thread.sleep(2000);
		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo("Ts12Ab"+randomNumber);
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake("TestQa");
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);

		// For 2nd Add Vehicle

		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo2("Ts12Ab" + +randomNumber2);
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake2("TestQa" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType2();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse2();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);

// For 3rd Add Vehicle

		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo3("Ts15Ab" + +randomNumber3);
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake3("TestQa" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType3();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse3();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);

// For 4th Add Vehicle

		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo4("Ts26Ab"+randomNumber4 );
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake4("TestQa" + RandomString.make(2));
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType4();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse4();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);

		Vm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");

	}

	@Test(enabled = false)
	public void DeleteAddBack() throws Exception {
		Vehicle_Master Vm = new Vehicle_Master(driver);

		Vm.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Vm.ClickonVehiclemaster();
		logg.info(getClass().getName() + " - " + "Clicked On Vehicle Master");
		Thread.sleep(2000);
		Vm.ClickOnDelete();
		logg.info(getClass().getName() + " - " + "Clicked On Delete");
		Vm.ClickOnConfrmDelete();
		logg.info(getClass().getName() + " - " + "Clicked On Confrim Delete");

		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Vehicle Master-Vehicle Delete- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		Thread.sleep(10000);

		Vm.ClickonAdd();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Vm.EnterVehicleNo("Ts12Ab1234");
		logg.info(getClass().getName() + " - " + "Vehicle Number Entered");
		Vm.VehicleMake("TestQa");
		logg.info(getClass().getName() + " - " + "Vehicle Make Entered");
		Vm.SelectVehicleType();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Type");
		Thread.sleep(2000);
		Vm.SelectVehicleUse();
		logg.info(getClass().getName() + " - " + "Selected Vehicle Use");
		Thread.sleep(2000);
		Vm.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");

		Thread.sleep(2000);
		/*
		 * String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot tss = (TakesScreenshot) driver; File sourcee =
		 * tss.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Vehicle Master-Vehicle ReAdded After Delete- " + timestampp + ".png");
		 * FileUtils.copyFile(sourcee, targete); System.out.println("screenshot taken");
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
