package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.BomNcMaster;
import testPageObjects.LoginPage;

public class Tc_001_BomNc extends BaseClass {

	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);

		l.AgencyId(username);
		logg.info(getClass().getName() + "Agencyid Entered");
		l.password(password);
		logg.info(getClass().getName() + "Password Entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.submitclick();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		logg.info(getClass().getName() + "Clicked On Submit");
		/*
		 * l.ClickOnProfile();
		 * 
		 * logg.info("Clicked On Profile"); driver.manage().timeouts().implicitlyWait(5,
		 * TimeUnit.SECONDS);
		 * 
		 * l.ClickOnSinout(); logg.info("Clicked On Signout");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * l.ClickingOnSinout(); logg.info("Confirm For Signout");
		 */
	}

	@Test(priority = 2)

	public void Bom_Nc_Master() throws Exception {

		BomNcMaster Bom = new BomNcMaster(driver);

		// For Creating Bom Package and For Duplicate

		Bom.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(2000);
		Bom.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Bom.ClickOnBomMaster();
		logg.info(getClass().getName() + "Clicked On BomNc Master");
		Bom.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Thread.sleep(2000);
		Bom.EquipmentListSelect();
		logg.info(getClass().getName() + "Equipment Selected From List");
		Thread.sleep(2000);
		Bom.ClickOnAddEqupmnt();
		logg.info(getClass().getName() + "Clicked On Add Equipment");
		Bom.RegulatorListSelect();
		logg.info(getClass().getName() + "Regulator Selected From List");
		Bom.ClickOnAddRegultr();
		logg.info(getClass().getName() + "Clicked On Add Regulator");
		// Bom.ClickOnConTypeGenDbcBpl();
		Bom.ClickOnConTypeLoanCash();
		logg.info(getClass().getName() + "Connection Type Selected ");
		Thread.sleep(2000);
		/*
		 * Bom.ServicesListSelect(); logg.info(getClass().getName() +
		 * "Service Selected From List"); Bom.ClickOnAddService();
		 * logg.info(getClass().getName() + "Clicked On Add Service");
		 */
		Bom.ArbListSelect();
		logg.info(getClass().getName() + "Arb Item Selected From List");
		Bom.ClickOnAddArb();
		logg.info(getClass().getName() + "Clicked On Add Arb");
		Thread.sleep(2000);
		Bom.AddBomName("GenNc Con Name" + RandomString.make(2));
		// System.out.println();
		Bom.DepRequiredEqp();
		Thread.sleep(2000);
		Bom.DepRequiredReg();
		Thread.sleep(2000);
		Bom.ClickOnSaveBtn();

		Thread.sleep(4000);

	}

	@Test(enabled = false)

	public void Delete() throws Exception {
		BomNcMaster Bom = new BomNcMaster(driver);
		// For Deleting Bom Package

		Bom.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(2000);
		Bom.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Bom.ClickOnBomMaster();
		logg.info(getClass().getName() + "Clicked On BomNc Master");

		Thread.sleep(2000);
		Bom.ClickOnDelete();
		logg.info(getClass().getName() + "Clicked On Delete Button");
		Thread.sleep(2000);
		Bom.ClickOnConfirmDelete();
		logg.info(getClass().getName() + "Clicked On Confirm Delete Button");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Bom Master Deleted - " +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
		 */

	}
}
