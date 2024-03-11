package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testPageObjects.LoginPage;
import testPageObjects.Set_CreditLimit;

	public class Tc_004_SetCreditLimit extends BaseClass{

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
	public void SetCreditLimit() throws Exception {
		Set_CreditLimit Sc=new Set_CreditLimit(driver);
		
		Sc.ClickonMasterData();
		Sc.ClickonSetCreditLimit();
		Thread.sleep(2000);
		Sc.EnterSecretPin("1234");
		Sc.ClickonSubmitPin();
		Thread.sleep(2000);
		Sc.ClickOnAdd();
		Sc.SelectCust();
		Sc.EnterCreditLimit("16545446");
		Sc.SelectControl1();
		Sc.EnterCreditDay("180");
		Sc.SelectControl2();
		Thread.sleep(2000);
		Sc.SelectFromProdList();
		Sc.EnterDiscount("105");
		Sc.EnterDate("03/05/2024");
		Sc.ClickOnSave();
		
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Set Credit Limit- Added Customer- " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
}
