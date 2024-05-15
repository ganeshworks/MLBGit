package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

import javax.print.attribute.standard.DateTimeAtCreation;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.random.RandomData;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.Arb_Master;
import testPageObjects.AreaCode_Master;
import testPageObjects.BomNcMaster;
import testPageObjects.Equipment_Master;
import testPageObjects.LoginPage;
import testPageObjects.Services_Master;

public class Tc_001_Product_Master extends BaseClass {

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

	public void Equipment() throws Exception {
		Equipment_Master Eq = new Equipment_Master(driver);

		Eq.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();
		logg.info(getClass().getName() + "Clicked On Equipment master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*
		 * // Eq.dropdownselect();
		 * 
		 * Eq.ClickOnAdd(); logg.info(getClass().getName() + "Clicked On Add ");
		 * Thread.sleep(3000);
		 * 
		 * WebElement trElement = driver .findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/table/tr[3]"));
		 * 
		 * // Find the first <td> element within the third <tr> element WebElement
		 * tdElement = trElement.findElement(By.xpath("./td[1]"));
		 * 
		 * // Get the text of the first <td> element String tdText =
		 * tdElement.getText();
		 * 
		 * Eq.Selectitemfromlist();
		 * 
		 * Select ss = new
		 * Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		 * 
		 * ss.selectByVisibleText(tdText);
		 * 
		 * logg.info(getClass().getName() + "Equipment Selected From List");
		 * Thread.sleep(3000); Eq.Selectunitfromlist(); logg.info(getClass().getName() +
		 * "Units Selected From List");
		 * 
		 * Thread.sleep(3000); Eq.EnterFulls("150"); logg.info(getClass().getName() +
		 * "Fulls Added"); Thread.sleep(3000); Eq.EnterEmpties("10");
		 * logg.info(getClass().getName() + "Empties Added");
		 * Eq.EnterDate("02/27/2024"); logg.info(getClass().getName() + "Date Added");
		 * Thread.sleep(3000); Eq.ClickOnSave(); logg.info(getClass().getName() +
		 * "Clicked On Save"); Thread.sleep(5000);
		 */

		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/table/tr[3]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[3]//td[9]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		// driver.switchTo().alert().accept();
		logg.info(getClass().getName() + "Equipment Deleted");

		Eq.ClickOnAdd();
		logg.info(getClass().getName() + "Equipment Added Back");
		Thread.sleep(3000);

		Eq.Selectitemfromlist();

		Select ss = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		ss.selectByVisibleText(tdText);
		logg.info(getClass().getName() + "Equipment Selected From List");
		Thread.sleep(3000);
		Eq.Selectunitfromlist();
		logg.info(getClass().getName() + "Units Selected From List");
		Thread.sleep(3000);

		// Eq.deleteAddedRow();

		Eq.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		Thread.sleep(3000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Deleted And Refetched" +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
		 */

	}

	@Test(enabled = false)
	public void ArbMaster() throws Exception {
		Arb_Master Ar = new Arb_Master(driver);

		Ar.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Ar.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");

		Ar.ClickOnBlpg();

		logg.info(getClass().getName() + "Clicked On Blpg/Nfr/Arb master");
		// Ar.dropdownselect();
		/*
		 * Thread.sleep(5000);
		 * 
		 * Ar.ClickOnAdd(); Ar.Selectitemfromlist(); logg.info(getClass().getName() +
		 * "Selected Item From List"); Ar.AddBrandName("QaTest");
		 * logg.info(getClass().getName() + "Added Brandname");
		 * Ar.AddProdName("TestQa"); logg.info(getClass().getName() +
		 * "Added Product name"); Ar.AddHsn("27111900"); logg.info(getClass().getName()
		 * + "Added Hsn Code"); Ar.Selectunitfromlist(); logg.info(getClass().getName()
		 * + "Units Selected From List"); Ar.GstFromList();
		 * logg.info(getClass().getName() + "Gst Selected From List");
		 * Ar.AddPurchasePrice("157"); logg.info(getClass().getName() +
		 * "Purchase Price Added"); Ar.AddOpStock("120"); logg.info(getClass().getName()
		 * + "Op Stock Added"); Ar.EnterDate("03/02/2024");
		 * logg.info(getClass().getName() + "Date Added"); Thread.sleep(5000);
		 * 
		 * Ar.ClickOnSave(); logg.info(getClass().getName() + "Clicked On Save");
		 */
		
		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/table/tr[2]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[2]//td[10]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		logg.info(getClass().getName() + "Blpg/Nfr/Arb Item Deleted");
		/*
		 * Ar.DeleteProductFromList(); Ar.ConfirmDeleteClick(); Thread.sleep(2000);
		 * driver.switchTo().alert().accept(); Thread.sleep(2000);
		 */
		Ar.ClickOnAdd();
		logg.info(getClass().getName() + "Product Added Back");
		Ar.Selectitemfromlist();
		Select ss = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		ss.selectByVisibleText(tdText);
		logg.info(getClass().getName() + "Product Selected From List");
		Ar.AddBrandName("QaTest");
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName("TestQa");
		logg.info(getClass().getName() + "Added Product name");
		Ar.DeleteHsn();
		logg.info(getClass().getName() + "Added Hsn Code");
		Thread.sleep(4000);
		Ar.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Blpg Product Duplicate Assertions" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}

	@Test(enabled = false)
	public void services_master() throws Exception {

		Services_Master Sm = new Services_Master(driver);

		// For Adding Services And Duplicates Also

		/*
		 * Sm.ClickonMasterData(); Sm.ClickonProductmaster(); Sm.ClickOnServiceMaster();
		 * Sm.dropdownselect(); Sm.ClickOnSubmit(); Thread.sleep(2000);
		 * 
		 * Sm.ClickOnAdd(); Sm.SetServiceName("QaTestService");
		 * Sm.SetSACCode("99895547"); Sm.dropdownUOM(); Sm.SetCharges("1254");
		 * Sm.dropdownGST(); Sm.ClickOnCalculate(); Sm.SetDate("03/04/2024");
		 * Sm.ClickOnSaveButton(); Thread.sleep(2000);
		 * 
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Services Master Added Updated" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		// For Deleting Services

		/*
		 * Sm.ClickonMasterData(); Sm.ClickonProductmaster(); Sm.ClickOnServiceMaster();
		 * Sm.dropdownselect(); Sm.ClickOnSubmit(); Thread.sleep(2000);
		 * 
		 * Sm.DeleteService(); Sm.ConfrmDeleteService(); Thread.sleep(2000); String
		 * timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 * TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "Services Master Deleted Service" + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		// For Edit Data

		Sm.ClickonMasterData();
		Sm.ClickonProductmaster();
		Sm.ClickOnServiceMaster();
		Sm.dropdownselect();
		Sm.ClickOnSubmit();
		Thread.sleep(2000);

		Sm.EditServices();
		Sm.EditServiceNames("QatestedService");
		Sm.EditSACCODE("99875541");
		Sm.EditDropdownUOM();
		Sm.EditCharge("1544");
		Sm.EditGst();
		Sm.ClickCalculateEdit();
		Sm.ClickOnEditSaveButton();

		Thread.sleep(2000);

		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + "Services Master Edited Service"
				+ timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}

	@Test(enabled = false)
	public void AreaCodeMaster() throws Exception {

		AreaCode_Master Am = new AreaCode_Master(driver);

		// For Adding Area Code And Duplicate Purpose

		/*
		 * Am.ClickonMasterData(); Am.ClickonProductmaster();
		 * Am.ClickOnAreaCodeMaster(); Am.ClickOnAdd(); Am.EnterPincode("500018");
		 * Am.EnterAreacode("Abc12250"); Am.EnterAreaNames("Borabanda");
		 * Am.EnterOnewayDistance("10"); Am.EnterTansCharges("99");
		 * Am.SetDate("03/04/2024"); Am.ClickOnSaveButton();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new
		 * File(System.getProperty("user.dir") + "/Screenshots/" +
		 * "AreaCode Master Added - " + timestamp + ".png"); FileUtils.copyFile(source,
		 * target); System.out.println("screenshot taken");
		 */
		// For Deleting And ReAdd

		Am.ClickonMasterData();
		Thread.sleep(2000);
		Am.ClickonProductmaster();
		Am.ClickOnAreaCodeMaster();

		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[2]//td[7]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		Thread.sleep(2000);

		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "AreaCode Master Deleted - " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */

		Am.ClickOnAdd();
		// Am.EnterPincode("500018");

		driver.findElement(By.xpath("//input[contains(@placeholder,'PIN CODE')]")).sendKeys(tdText);
		Am.EnterAreacode("Abc12250");
		Am.EnterAreaNames("Borabanda");
		Am.EnterOnewayDistance("10");
		Am.EnterTansCharges("99");
		Am.SetDate("03/04/2024");
		Am.ClickOnSaveButton();
		Thread.sleep(2000);

		/*
		 * String timestamps = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts1 = (TakesScreenshot) driver; File sourcee =
		 * ts.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "AreaCode Master Re Added - " + timestamp + ".png");
		 * FileUtils.copyFile(sourcee, targete); System.out.println("screenshot taken");
		 */
	}

	@Test(priority = 2)

	public void Bom_Nc_Master() throws Exception {

		BomNcMaster Bom = new BomNcMaster(driver);

		// For Creating Bom Package and For Duplicate

		Bom.ClickonMasterData();
		Thread.sleep(2000);
		Bom.ClickonProductmaster();
		Bom.ClickOnBomMaster();
		Bom.ClickOnAdd();
		Thread.sleep(2000);
		Bom.EquipmentListSelect();
		Thread.sleep(2000);
		Bom.ClickOnAddEqupmnt();
		Bom.RegulatorListSelect();
		Bom.ClickOnAddRegultr();
		// Bom.ClickOnConTypeGenDbcBpl();
		Bom.ClickOnConTypeLoanCash();
		Thread.sleep(2000);
		// Bom.ServicesListSelect();
		// Bom.ClickOnAddService();
		Bom.ArbListSelect();
		Bom.ClickOnAddArb();
		Thread.sleep(2000);
		Bom.AddBomName("GenNc Con Name" + RandomString.make(2));
		// System.out.println();
		Bom.DepRequiredEqp();
		Thread.sleep(2000);
		Bom.DepRequiredReg();
		Thread.sleep(2000);
		Bom.ClickOnSaveBtn();

		Thread.sleep(4000);

		// For Deleting Bom Package

		/*
		 * Bom.ClickonMasterData(); Thread.sleep(2000); Bom.ClickonProductmaster();
		 * Bom.ClickOnBomMaster();
		 * 
		 * Thread.sleep(2000); Bom.ClickOnDelete(); Thread.sleep(2000);
		 * Bom.ClickOnConfirmDelete();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Bom Master Deleted - " +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
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
