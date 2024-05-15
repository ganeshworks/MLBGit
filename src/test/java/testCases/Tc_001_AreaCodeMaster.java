package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.AreaCode_Master;
import testPageObjects.LoginPage;

public class Tc_001_AreaCodeMaster extends BaseClass {

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
	public void AddAreaCodeMaster() throws Exception {

		AreaCode_Master Am = new AreaCode_Master(driver);

		// For Adding Area Code And Duplicate Purpose

		Am.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Am.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Am.ClickOnAreaCodeMaster();
		logg.info(getClass().getName() + "Clicked On Area Code Master");
		Am.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Am.EnterPincode("500018");
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode("Abc12250");
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames("Borabanda");
		logg.info(getClass().getName() + "Entered Areaa name");
		Am.EnterOnewayDistance("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate("03/04/2024");
		logg.info(getClass().getName() + "Entered Date");
		Am.ClickOnSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");

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
	public void MultipleAddAreaCodeMaster() throws Exception {

		AreaCode_Master Am = new AreaCode_Master(driver);

		// For Adding Area Code And Duplicate Purpose

		Am.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Am.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Am.ClickOnAreaCodeMaster();
		logg.info(getClass().getName() + "Clicked On Area Code Master");
		Am.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Am.EnterPincode("500018");
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode("Abc122"+RandomString.make(1));
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames("Borabanda");
		logg.info(getClass().getName() + "Entered Areaa name");
		Am.EnterOnewayDistance("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate("03/04/2024");
		logg.info(getClass().getName() + "Entered Date");
		
		//for 2nd Time
		
		
		Am.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Am.EnterPincode2("500018");
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode2("Abc12250"+RandomString.make(1));
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames2("Borabanda");
		logg.info(getClass().getName() + "Entered Areaa name");
		Am.EnterOnewayDistance2("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges2("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate2("03/16/2024");
		logg.info(getClass().getName() + "Entered Date");
		
		//For 3rd Add
		
		Am.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Am.EnterPincode3("500018");
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode3("Abc122"+RandomString.make(1));
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames3("Borabanda");
		logg.info(getClass().getName() + "Entered Areaa name");
		Am.EnterOnewayDistance3("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges3("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate3("03/16/2024");
		logg.info(getClass().getName() + "Entered Date");
		
		//For 4th Add
		
		Am.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add Button");
		Am.EnterPincode4("500018");
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode4("Abc12"+RandomString.make(1));
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames4("Borabanda");
		logg.info(getClass().getName() + "Entered Areaa name");
		Am.EnterOnewayDistance4("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges4("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate4("03/16/2024");
		logg.info(getClass().getName() + "Entered Date");
		
		
		Am.ClickOnSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");

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

	@Test(enabled = false)
	public void DeleteAddBack() throws Exception {
		// For Deleting And ReAdd

		AreaCode_Master Am = new AreaCode_Master(driver);

		Am.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Am.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Am.ClickOnAreaCodeMaster();
		logg.info(getClass().getName() + "Clicked On Area Code Master");
		

		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[2]//td[7]")).click();
		logg.info(getClass().getName() + "Clicked On Deletebutton");
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		logg.info(getClass().getName() + "Clicked On Confirm Deletebutton");
		Thread.sleep(2000);

		

		Am.ClickOnAdd();
		// Am.EnterPincode("500018");
		logg.info(getClass().getName() + "Clicked On Add Button");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'PIN CODE')]")).sendKeys(tdText);
		logg.info(getClass().getName() + "Entered Pincode");
		Am.EnterAreacode("Abc12250");
		logg.info(getClass().getName() + "Entered AreaCode");
		Am.EnterAreaNames("Borabanda");
		logg.info(getClass().getName() + "Entered Area Name");
		Am.EnterOnewayDistance("10");
		logg.info(getClass().getName() + "Entered Distance");
		Am.EnterTansCharges("99");
		logg.info(getClass().getName() + "Entered Transport Charges");
		Am.SetDate("03/04/2024");
		logg.info(getClass().getName() + "Entered Date");
		Am.ClickOnSaveButton();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(2000);
	}
}
