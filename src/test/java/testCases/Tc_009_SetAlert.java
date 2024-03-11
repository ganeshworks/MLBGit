package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import testPageObjects.LoginPage;
import testPageObjects.Set_Alert;

public class Tc_009_SetAlert extends BaseClass{

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
	@Test(enabled = false)
	
	public void SetAlert() throws Exception {
		Set_Alert Sa=new Set_Alert(driver);
		
		Sa.ClickonMasterData();
		Sa.ClickonSetAlert();
		Thread.sleep(2000);
		Sa.ClickonAdd();
		Thread.sleep(2000);
		Sa.SelectItem();
		Sa.EnterRefNo("514565456464");
		Sa.EnterDate("04/04/2024");
		Thread.sleep(2000);
		Sa.SelectRemindDays();
		Sa.EnterRemarks("Expery On Way");
		Sa.ClickonSave();
		
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Added- " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
	@Test(enabled = false)
	
	public void SetAlertDelete() throws Exception {
		Set_Alert Sa=new Set_Alert(driver);
		
		Sa.ClickonMasterData();
		Sa.ClickonSetAlert();
		Thread.sleep(2000);
		Sa.ClickonDelete();
		Sa.ClickonConfrmDelete();
		Thread.sleep(2000);
		String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File sourcee = tss.getScreenshotAs(OutputType.FILE);
		File targete = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Deleted " + timestampp + ".png");
		FileUtils.copyFile(sourcee, targete);
		System.out.println("screenshot taken");
		
		Sa.ClickonMasterData();
		Sa.ClickonSetAlert();
		Thread.sleep(2000);
		Sa.ClickonAdd();
		Thread.sleep(2000);
		Sa.SelectItem();
		Sa.EnterRefNo("514565456464");
		Sa.EnterDate("04/04/2024");
		Thread.sleep(2000);
		Sa.SelectRemindDays();
		Sa.EnterRemarks("Expery On Way");
		Sa.ClickonSave();
		
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Added After Deleting- " + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}

@Test(priority = 2)

public void SetAlertDuplicate() throws Exception {
	Set_Alert Sa=new Set_Alert(driver);
	
	
	Sa.ClickonMasterData();
	Sa.ClickonSetAlert();
	Thread.sleep(2000);
	Sa.ClickonAdd();
	Thread.sleep(2000);
	Sa.SelectItem();
	Sa.EnterRefNo("514565456464");
	Sa.EnterDate("04/04/2024");
	Thread.sleep(2000);
	Sa.SelectRemindDays();
	Sa.EnterRemarks("Expery On Way");
	Sa.ClickonSave();
	
	Thread.sleep(2000);
	
	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(
			System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Added After Deleting- " + timestamp + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("screenshot taken");
}


}
