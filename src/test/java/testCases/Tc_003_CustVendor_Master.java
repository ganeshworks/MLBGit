package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	public void CustVendor() throws Exception {
		Cust_Vendor_Master Cv = new Cust_Vendor_Master(driver);

		Thread.sleep(5000);
		Cv.ClickonMasterData();
		Thread.sleep(5000);
		Cv.ClickonCustVendmaster();
		Cv.ClickonAddButton();
		Cv.Selectparttypefromlist();
		String s22 = driver.findElement(By.xpath("//div[contains(@class,'credit-limit')]//div[1]//div[1]//select[1]"))
				.getText();
		Cv.SelectGstfromlist();
		Thread.sleep(5000);
		Cv.EnterGst("03AAWCS1532Q1" + RandomString.make(2));
		Cv.EnterPan("AAACL9475L");
		Cv.EnterPartyname(s22);
		Cv.EnterOpBalance("22542");
		Cv.ClickLess10cr();
		Cv.EnterAddress("ibfhsdbhsbdvjjhdbhbshdbhbcshdbvhbsdvbhjbhj bhjsbdvhjbdsbvhjsdbvhjhjdsbjh");
		Cv.Selectstatefromlist();
		Cv.SelectDistctfromlist();
		Cv.EnterPincode("500018");
		Thread.sleep(2000);
		Cv.EnterLocation();
		Cv.Enteremail("test@test.com");
		Cv.EnterMobile("7646454564");
		Cv.Entercheck();

		/*
		 * Cv.EnterUnitname("TestQa"); Cv.
		 * EnterBillAddress("ibfhsdbhsbdvjjhdbhbshdbhbcshdbvhbsdvbhjbhj bhjsbdvhjbdsbvhjsdbvhjhjdsbjh"
		 * ); Cv.SelectBillstatefromlist(); Cv.SelectBillDistctfromlist();
		 * Cv.EnterBillPincode("500018"); Thread.sleep(4000); Cv.EnterBillLocation();
		 */
		

		Cv.ClickonSave();
	}

}
