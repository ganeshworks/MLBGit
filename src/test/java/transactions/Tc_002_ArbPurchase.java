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

public class Tc_002_ArbPurchase extends BaseClass {

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
	public void ArbPurchse() throws Exception {
		ARB_Purchase Ap=new ARB_Purchase(driver);
		
		
		Ap.ClickonTransactions();
		Ap.ClickonPurchases();
		Ap.ClickonArbPurch();
		Ap.ClickOnAdd();
		Thread.sleep(2000);
		
		Ap.EnterInvNo("55664564654");
		Ap.EnterInvDate("03/06/2024");
		Thread.sleep(2000);
		Ap.EnterStckRecDate("03/06/2024");
		Ap.SelectVendorfromlist();
		Ap.SelectRevCharge();
		Ap.SelectPODrop();
		Ap.EnterPODate("03/06/2024");
		Ap.SelectProdfromlist();
		Thread.sleep(2000);
		Ap.ClickOnFetchGst();
		Ap.EnterUnitRate("120");
		Thread.sleep(2000);
		Ap.EnterQanty("100");
		Ap.ClickonCalculate();
		Ap.EnterTruck("Ts36ab1234");
		Ap.EnterDrivername("TestQa");
		Thread.sleep(2000);
		Ap.SelectRecdBy();
		Thread.sleep(2000);
		Ap.ClickonSave();
		
		
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Arb Purchase- Purchase Added-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
