package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.LoginPage;
import testPageObjects.Services_Master;

public class Tc_001_ServicesMaster extends BaseClass {

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

	@Test(enabled = false)
	public void services_master() throws Exception {

		Services_Master Sm = new Services_Master(driver);

		// For Adding Services And Duplicates Also

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Sm.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Sm.ClickOnServiceMaster();
		logg.info(getClass().getName() + "Clicked On Services Master");
		Sm.dropdownselect();
		logg.info(getClass().getName() + "Offer Dropdown Selected");
		Sm.ClickOnSubmit();
		logg.info(getClass().getName() + "Clicked On Submit");
		Thread.sleep(2000);

		Sm.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add");
		Sm.SetServiceName("QaTestService");
		logg.info(getClass().getName() + "Service Name Added");
		Sm.SetSACCode("45564");
		logg.info(getClass().getName() + "Sac Code Added");
		Sm.dropdownUOM();
		logg.info(getClass().getName() + "Units Selected From List");
		Sm.SetCharges("1254");
		logg.info(getClass().getName() + "Added Charges");
		Sm.dropdownGST();
		logg.info(getClass().getName() + "Selected Gst From List");
		Sm.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked on Calculate");
		Sm.SetDate("03/04/2024");
		logg.info(getClass().getName() + "Effective Date Added");
		Sm.ClickOnSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Services Master Added Updated" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}

	@Test(priority = 2)
	public void MultipleAdd_services_master() throws Exception {

		Services_Master Sm = new Services_Master(driver);

		// For Adding Services And Duplicates Also

		Sm.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Sm.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Sm.ClickOnServiceMaster();
		logg.info(getClass().getName() + "Clicked On Services Master");
		Sm.dropdownselect();
		logg.info(getClass().getName() + "Offer Dropdown Selected");
		Sm.ClickOnSubmit();
		logg.info(getClass().getName() + "Clicked On Submit");
		Thread.sleep(2000);

		Sm.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add");
		Sm.SetServiceName("QaTestService");
		logg.info(getClass().getName() + "Service Name Added");
		Sm.SetSACCode(Ed.getTextFromExcel());
		logg.info(getClass().getName() + "Sac Code Added");
		Sm.dropdownUOM();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		Sm.SetCharges("1254");
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Added Charges");
		Sm.dropdownGST();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Selected Gst From List");
		Sm.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked on Calculate");
		Sm.SetDate("03/04/2024");
		logg.info(getClass().getName() + "Effective Date Added");

		// For 2nd Add

		Sm.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add");
		Sm.SetServiceName2("QaTestService"+RandomString.make(1));
		logg.info(getClass().getName() + "Service Name Added");
		Sm.SetSACCode2(Ed.getTextFromExcel());
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Sac Code Added");
		Sm.dropdownUOM2();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		Sm.SetCharges2("1254");
		logg.info(getClass().getName() + "Added Charges");
		Sm.dropdownGST2();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Selected Gst From List");
		Sm.ClickOnCalculate();
		logg.info(getClass().getName() + "Clicked on Calculate");
		Sm.SetDate2("03/16/2024");
		logg.info(getClass().getName() + "Effective Date Added");

		// For 3rd Add

		Sm.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add");
		Sm.SetServiceName3("QaTestService"+RandomString.make(1));
		logg.info(getClass().getName() + "Service Name Added");
		Sm.SetSACCode3(Ed.getTextFromExcel());
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Sac Code Added");
		Sm.dropdownUOM3();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		Sm.SetCharges3("1254");
		logg.info(getClass().getName() + "Added Charges");
		Sm.dropdownGST3();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Selected Gst From List");
		Sm.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Clicked on Calculate");
		Sm.SetDate3("03/12/2024");
		logg.info(getClass().getName() + "Effective Date Added");

		// For 4th Add

		Sm.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add");
		Sm.SetServiceName4("QaTestService"+RandomString.make(1));
		logg.info(getClass().getName() + "Service Name Added");
		Sm.SetSACCode4(Ed.getTextFromExcel());
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Sac Code Added");
		Sm.dropdownUOM4();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		Sm.SetCharges4("1254");
		logg.info(getClass().getName() + "Added Charges");
		Sm.dropdownGST4();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Selected Gst From List");
		Sm.ClickOnCalculate();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Clicked on Calculate");
		Sm.SetDate4("03/15/2024");
		logg.info(getClass().getName() + "Effective Date Added");

		Sm.ClickOnSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void DeleteData() throws Exception {

		Services_Master Sm = new Services_Master(driver);
		// For Deleting Services
		Sm.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(2000);
		Sm.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Sm.ClickOnServiceMaster();
		logg.info(getClass().getName() + "Clicked On Services Master");
		Sm.dropdownselect();
		logg.info(getClass().getName() + "Offer Dropdown Selected");
		Sm.ClickOnSubmit();
		logg.info(getClass().getName() + "Clicked On Submit");
		Thread.sleep(2000);
		
		for(int i=0;i<8;i++) {
		Sm.DeleteService();
		logg.info(getClass().getName() + "Clicked On Delete");

		Sm.ConfrmDeleteService();
		logg.info(getClass().getName() + "Clicked On Confirm Delete");
		Thread.sleep(2000);}
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Services Master Deleted Service" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

	}

	@Test(enabled = false)

	public void EditData() throws Exception {

		Services_Master Sm = new Services_Master(driver);
		// For Edit Data

		logg.info(getClass().getName() + "Clicked On MasterData");
		Sm.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Sm.ClickOnServiceMaster();
		logg.info(getClass().getName() + "Clicked On Services Master");
		Sm.dropdownselect();
		logg.info(getClass().getName() + "Offer Dropdown Selected");
		Sm.ClickOnSubmit();
		logg.info(getClass().getName() + "Clicked On Submit");
		Thread.sleep(2000);

		Sm.EditServices();
		logg.info(getClass().getName() + "Clicked On Service To Edit");
		Sm.EditServiceNames("QatestedService");
		logg.info(getClass().getName() + "Service Name Edited");
		Sm.EditSACCODE("99875541");
		logg.info(getClass().getName() + "Service Sac Code Edited");
		Sm.EditDropdownUOM();
		logg.info(getClass().getName() + "Service Units Edited");
		Sm.EditCharge("1544");
		logg.info(getClass().getName() + "Service Charge Edited");
		Sm.EditGst();
		logg.info(getClass().getName() + "Service Gst Edited");
		Sm.ClickCalculateEdit();
		logg.info(getClass().getName() + "Clicked On Calculate");
		Sm.ClickOnEditSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");

		Thread.sleep(2000);
	}
}
