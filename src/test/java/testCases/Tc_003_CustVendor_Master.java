package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.Cust_Vendor_Master;
import testPageObjects.LoginPage;

public class Tc_003_CustVendor_Master extends BaseClass {

	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);

		l.AgencyId(username);
		logg.info("Agencyid Entered");
		l.password(password);
		logg.info("Password Enter");
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
	public void CustVendor() throws Exception {
		Cust_Vendor_Master Cv = new Cust_Vendor_Master(driver);

		Thread.sleep(5000);
		Cv.ClickonMasterData();
		logg.info(getClass().getName() + " - " + "Clicked On Master Data");
		Thread.sleep(5000);
		Cv.ClickonCustVendmaster();
		logg.info(getClass().getName() + " - " + "Clicked On CustVend Master");

		Cv.ClickonAddButton();
		logg.info(getClass().getName() + " - " + "Clicked On Add Button");
		Cv.Selectparttypefromlist();
		logg.info(getClass().getName() + " - " + "Selected PartyType From List");

		String s22 = driver.findElement(By.xpath("//div[contains(@class,'credit-limit')]//div[1]//div[1]//select[1]"))
				.getText();
		Cv.SelectGstfromlist();
		logg.info(getClass().getName() + " - " + "Selected Gst yes/No");
		Thread.sleep(5000);
		Cv.EnterGst("36AANFV1846Q1" + RandomString.make(2));
		// Cv.EnterGst("36AANFV1846Q1ZA");
		logg.info(getClass().getName() + " - " + "Entered Gst");

		Cv.EnterPan("ABCDE1212Q");
		Cv.EnterPartyname("OmcThree");
		Cv.EnterOpBalance("22542");
		// Cv.TurnOvergreat10cr();
		Cv.TurnOverLess10cr();
		logg.info(getClass().getName() + " - " + "Financial turnOver Selected");

		Cv.SelectPreferedSales();

		// Cv.SelectGreat50();
		Cv.SelectLess50();
		Cv.EnterAddress("Flat No-301,Art LAkshm Residency,Borabanda,Hyderabad,Telangana");
		Cv.Selectstatefromlist();
		Cv.SelectDistctfromlist();
		Cv.EnterPincode("500018");
		logg.info(getClass().getName() + " - " + "Pincode Entered");
		Thread.sleep(4000);
		Cv.EnterLocation();
		logg.info(getClass().getName() + " - " + "Selected Location from List");
		Cv.Enteremail("test@test.com");
		logg.info(getClass().getName() + " - " + "Email Id Entered");
		Cv.EnterMobile("7646454564");
		logg.info(getClass().getName() + " - " + "Mobile No Entered"); //
		//Cv.Entercheck();

		Cv.EnterUnitname("TestQa");
		Cv.EnterBillAddress("Flat No-301,Art LAkshm Residency,Borabanda,Hyderabad,Telangana");
		Cv.SelectBillstatefromlist();
		Cv.SelectBillDistctfromlist();
		Cv.EnterBillPincode("500018");
		Thread.sleep(4000);
		Cv.EnterBillLocation();
		Thread.sleep(3000);
		Cv.ClickonAddRow();
		
		
		
		Cv.EnterUnitname2("TestQa"+RandomString.make(2));
		Cv.EnterBillAddress2("Flat No-301,Art LAkshm Residency,Borabanda,Hyderabad,Telangana");
		Cv.SelectBillstatefromlist2();
		Cv.SelectBillDistctfromlist2();
		Cv.EnterBillPincode2("500018");
		Thread.sleep(4000);
		Cv.EnterBillLocation2();
		Thread.sleep(3000);
		Cv.ClickonAddRow();
		
		
		Cv.EnterUnitname3("TestQa"+RandomString.make(2));
		Cv.EnterBillAddress3("Flat No-301,Art LAkshm Residency,Borabanda,Hyderabad,Telangana");
		Cv.SelectBillstatefromlist3();
		Cv.SelectBillDistctfromlist3();
		Cv.EnterBillPincode3("500018");
		Thread.sleep(4000);
		Cv.EnterBillLocation3();
		Thread.sleep(3000);
		Cv.ClickonAddRow();
		
		
		Cv.EnterUnitname4("TestQa"+RandomString.make(2));
		Cv.EnterBillAddress4("Flat No-301,Art LAkshm Residency,Borabanda,Hyderabad,Telangana");
		Cv.SelectBillstatefromlist4();
		Cv.SelectBillDistctfromlist4();
		Cv.EnterBillPincode4("500018");
		Thread.sleep(4000);
		Cv.EnterBillLocation4();
		
		
		Cv.ClickonSave();
		logg.info(getClass().getName() + " - " + "Clicked On Save");

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

	// Cv.EnterGst("36"+RandomString.make(5)+"1234"+RandomString.make(1)+RandomString.make(1)+RandomString.make(2));
	// Cv.EnterGst(RandomStringUtils.random(37)+RandomStringUtils.randomAlphabetic(5)+RandomStringUtils.random(4)+RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.random(1)+RandomStringUtils.randomAlphabetic(2));
	// Cv.EnterGst("36"+RandomString.make(5)+"1532Q1" + RandomString.make(2));
	/*
	 * String Str=driver.findElement(By.xpath(
	 * "//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[2]/div/div[1]/div[3]/div/div[2]"
	 * )).getText(); String substring = Str.substring(2, 12); // Start index: 2, End
	 * index: 7 System.out.println(substring);
	 */
}
