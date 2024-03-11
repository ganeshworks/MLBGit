package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;
import testPageObjects.Vendor_PO;

public class Tc_005_Vendor_PO  extends BaseClass {

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
	public void VendorPO() throws Exception {
	
		Vendor_PO Vp=new Vendor_PO(driver);
		
		
		Vp.ClickonTransactions();
		Vp.ClickonPurchases();
		Vp.ClickonVendorPO();
		Vp.ClickOnAdd();
		Vp.EnterPONo("PO/23-0001");
		Vp.EnterPODate("03/06/2024");
		Vp.EnterVendName();
		Vp.EnterQuoteNo("21331321");
		Vp.EnterQuoteDate("03/06/2024");
		Vp.SelectRevCharge();
		Vp.EnterNarration("Qa");
		Vp.SelectProdfromlist();
		Vp.EnterQanty("10");
		Vp.EnterOtherCharge("10.4");
		Vp.ValidUpto("03/12/2024");
		Vp.ClickOnCalculate();
		Vp.ClickonSave();
		
		
		Thread.sleep(5000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Vendor Po -Add Data" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}}
