package transactions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;

public class Tc_004_Def_ReturnData  extends BaseClass {

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
	public void DefReturn() throws Exception {
		
		Def_Return_Data Dr=new Def_Return_Data(driver);
		
		Dr.ClickonTransactions();
		Thread.sleep(2000);
		Dr.ClickonPurchases();
		Thread.sleep(2000);
		Dr.ClickonDefRetrn();
		Thread.sleep(2000);
		Dr.ClickOnAdd();
		Dr.EnterInvNo("Po31564564");
		Dr.EnterInvDate("03/06/2024");
		Dr.EnterVendName();
		Dr.EnterNarration("Qa");
		Dr.SelectProdDrop();
		Dr.EnterRetrnQnty("10");
		Dr.EnterNetQnty("10");
		Dr.EntervehclName("Ts36ab1234");
		Dr.ClickOnFetchGst();
		Dr.ClickOnCalculate();
		Dr.ClickOnsave();
		
		Thread.sleep(2000);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Def-Return Purchase-Add Data" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
