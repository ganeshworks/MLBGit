package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sa.ClickonSetAlert();
		logg.info(getClass().getName() + " - "+"Clicked On Set Alert");
		Thread.sleep(2000);
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo("514565456464");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		Sa.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		Thread.sleep(2000);
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Added- " +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
		 */
	}
@Test(priority = 2)
	
	public void Multiple_SetAlert() throws Exception {
		
		Set_Alert Sa=new Set_Alert(driver);
		
		Sa.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sa.ClickonSetAlert();
		logg.info(getClass().getName() + " - "+"Clicked On Set Alert");
		Thread.sleep(2000);
		
		
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo("514565456464");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		
		//2nd
		
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem2();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo2("5145654564645");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate2("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays2();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks2("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		
		//3rd
		
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem3();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo3("514575456464");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate3("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays3();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks3("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		
		//4th
		
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem4();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo4("517565456464");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate4("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays4();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks4("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		
		
		
		Sa.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		Thread.sleep(2000);
		
	}
	@Test(enabled = false)
	
	public void SetAlertDelete() throws Exception {
		Set_Alert Sa=new Set_Alert(driver);
		
		Sa.ClickonMasterData();
		logg.info(getClass().getName() + " - "+"Clicked On Master Data");
		Sa.ClickonSetAlert();
		logg.info(getClass().getName() + " - "+"Clicked On Set Alert");
		Thread.sleep(2000);
		Sa.ClickonDelete();
		logg.info(getClass().getName() + " - "+"Clicked On Delete");
		Sa.ClickonConfrmDelete();
		logg.info(getClass().getName() + " - "+"Clicked On Confirm Delete");
		Thread.sleep(2000);
		
		/*
		 * String timestampp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot tss = (TakesScreenshot) driver; File sourcee =
		 * tss.getScreenshotAs(OutputType.FILE); File targete = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Set Alert-Item Deleted "
		 * + timestampp + ".png"); FileUtils.copyFile(sourcee, targete);
		 * System.out.println("screenshot taken");
		 */
		
		//Sa.ClickonMasterData();
		//Sa.ClickonSetAlert();
		Thread.sleep(2000);
		Sa.ClickonAdd();
		logg.info(getClass().getName() + " - "+"Clicked On Add Button");
		Thread.sleep(2000);
		Sa.SelectItem();
		logg.info(getClass().getName() + " - "+"Item Selected From List");
		Sa.EnterRefNo("514565456464");
		logg.info(getClass().getName() + " - "+"Entered Ref Num");
		Sa.EnterDate("04/04/2024");
		logg.info(getClass().getName() + " - "+"Entered Date");
		Thread.sleep(2000);
		Sa.SelectRemindDays();
		logg.info(getClass().getName() + " - "+"Selected Remind Days");
		Sa.EnterRemarks("Expery On Way");
		logg.info(getClass().getName() + " - "+"Remarks Entered");
		Sa.ClickonSave();
		logg.info(getClass().getName() + " - "+"Clicked On Save");
		
		Thread.sleep(2000);
		
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" +
		 * "Set Alert-Item Added After Deleting- " + timestamp + ".png");
		 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
		 */
	}

@Test(enabled = false)

public void SetAlertDuplicate() throws Exception {
	Set_Alert Sa=new Set_Alert(driver);
	
	
	Sa.ClickonMasterData();
	logg.info(getClass().getName() + " - "+"Clicked On Master Data");
	Sa.ClickonSetAlert();
	logg.info(getClass().getName() + " - "+"Clicked On Set Alert");
	Thread.sleep(2000);
	Sa.ClickonAdd();
	logg.info(getClass().getName() + " - "+"Clicked On Add Button");
	Thread.sleep(2000);
	Sa.SelectItem();
	logg.info(getClass().getName() + " - "+"Item Selected From List");
	Sa.EnterRefNo("514565456464");
	logg.info(getClass().getName() + " - "+"Entered Ref Num");
	Sa.EnterDate("04/04/2024");
	logg.info(getClass().getName() + " - "+"Entered Date");
	Thread.sleep(2000);
	Sa.SelectRemindDays();
	logg.info(getClass().getName() + " - "+"Selected Remind Days");
	Sa.EnterRemarks("Expery On Way");
	logg.info(getClass().getName() + " - "+"Remarks Entered");
	Sa.ClickonSave();
	logg.info(getClass().getName() + " - "+"Clicked On Save");
	Thread.sleep(2000);
	
	
	/*
	 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
	 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
	 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
	 * System.getProperty("user.dir") + "/Screenshots/" +
	 * "Set Alert-Item Added After Deleting- " + timestamp + ".png");
	 * FileUtils.copyFile(source, target); System.out.println("screenshot taken");
	 */
	
}
@AfterMethod(enabled = false)
public void Aftermthd(ITestResult Tr) throws Exception {
	if (ITestResult.FAILURE == Tr.getStatus()) {
		Thread.sleep(2000);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/SS/" + Tr.getName() + timestamp + ".png");
		FileUtils.copyFile(source, target);
	}
}

}
