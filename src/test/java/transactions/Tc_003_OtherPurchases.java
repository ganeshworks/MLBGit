package transactions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testCases.BaseClass;
import testPageObjects.LoginPage;

public class Tc_003_OtherPurchases extends BaseClass {

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
	public void expencesYesItcYes() throws Exception {
		
		Other_Purchases Op=new Other_Purchases(driver);
		
		Op.ClickonTransactions();
		Op.ClickonPurchases();
		Op.ClickonOtherPurch();
		Thread.sleep(2000);
		Op.ClickonExpYes();
		Op.ClickonItcYes();
		Thread.sleep(2000);
		Op.ClickOnAdd();
		Op.EnterInvNo("6465464464");
		Op.EnterInvDate("03/06/2024");
		Op.EnterVendName("Qatest");
		Op.SelectRevCharge();
		Op.ClickOnPurchType();
		Thread.sleep(2000);
		Op.EnterProdName("QaTester");
		Op.EnterHsn("27111900");
		Op.SelectGstDrop();
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop();
		Op.SelectAccheadDrop();
		Op.EnterQanty("15");
		Op.SelectUomfromlist();
		Thread.sleep(2000);
		Op.EnterUnitRate("154");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		Thread.sleep(2000);
		Op.ClickonSave();
		
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Other Purchase- Purchase Added Expense-yes-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
	}
	
	@Test(enabled = false)
	
	public void expensesYesItcNo() throws Exception {
		Other_Purchases Op=new Other_Purchases(driver);
		
		WebDriverWait w=new WebDriverWait(driver, 15);
			w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Transactions')]"))));
			
		Op.ClickonTransactions();
		Thread.sleep(5000);
		Op.ClickonPurchases();
		Thread.sleep(5000);
		Op.ClickonOtherPurch();
		Thread.sleep(2000);
		Op.ClickonExpYes();
		Op.ClickonItcNo();
		Thread.sleep(2000);
		Op.ClickOnAdd();
		Op.EnterInvNo("6465464464");
		Op.EnterInvDate("03/06/2024");
		Op.EnterVendName("Qatest");
		//Op.SelectRevCharge();
		Op.ClickOnPurchType();
		Thread.sleep(2000);
		Op.EnterProdName("QaTester");
		Op.EnterHsn("27111900");
		Op.SelectGstDrop();
		Thread.sleep(2000);
		Op.SelectMinorHeadDrop();
		Op.SelectAccheadDrop();
		Op.EnterQanty("15");
		Op.SelectUomfromlist();
		Thread.sleep(2000);
		Op.EnterUnitRate("154");
		Thread.sleep(2000);
		Op.ClickonCalculate();
		Thread.sleep(2000);
		Op.ClickonSave();
		
		Thread.sleep(2000);
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(
				System.getProperty("user.dir") + "/Screenshots/" + "Other Purchase- Purchase Added Expense-No-" + timestamp + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
	}
	
	
@Test(priority = 2)
	
	public void expensesNo() throws Exception {
		Other_Purchases Op=new Other_Purchases(driver);
		
		WebDriverWait w=new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Transactions')]"))));
		
	Op.ClickonTransactions();
	Thread.sleep(5000);
	Op.ClickonPurchases();
	Thread.sleep(5000);
	Op.ClickonOtherPurch();
	Thread.sleep(2000);
	Op.ClickonExpNo();
	Op.ClickOnAdd();
	Op.EntervouchDate("03/06/2024");
	Op.ClickonFetch();
	Op.EnterExpeName("Expence1");
	Op.SelectMinorHeadDropd();
	Op.SelectAccheadDropd();
	Op.EnterQuntity("105");
	Op.SelectUomdropd();
	Op.EnterUnitRte("105");
	Op.ClickonCalculte();
	Op.SelectPayTerms();
	Op.Selectbank();
	Op.ClickonSaveexp();
	
	Thread.sleep(2000);
	
	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(
			System.getProperty("user.dir") + "/Screenshots/" + "Other Purchase- Purchase Added Expense-No-" + timestamp + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("screenshot taken");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
