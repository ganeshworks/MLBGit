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
import testPageObjects.Cylinder_Purchases;
import testPageObjects.LoginPage;

public class Tc_001_Cylinder_Purchases extends BaseClass {

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
	public void cyl_Purchase() throws Exception {
		
		Cylinder_Purchases Cp=new Cylinder_Purchases(driver);
		
		Cp.ClickonTransactions();
		Cp.ClickonPurchases();
		Cp.ClickonCylPurc();
		Cp.ClickOnAdd();
		Thread.sleep(2000);
		Cp.SelectOmcfromlist();
		Cp.EnterRefNo("55664564654");
		Cp.EnterInvDate("03/06/2024");
		Thread.sleep(2000);
		Cp.EnterStckRecDate("03/06/2024");
		Cp.SelectProdfromlist();
		Thread.sleep(2000);
		Cp.SelectLoadType();
		Cp.EnterUnitRate("120");
		Thread.sleep(2000);
		Cp.EnterQanty("100");
		Cp.ClickonCalculate();
		Cp.EnterTruck("Ts36ab1234");
		Cp.EnterDrivername("TestQa");
		Cp.SelectGodown();
		Thread.sleep(2000);
		Cp.SelectRecdBy();
		Thread.sleep(2000);
		Cp.ClickonSave();

		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Cylinder Purchase- Purchase Added-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
	
	
	
	
	
	
	
	
	
}
