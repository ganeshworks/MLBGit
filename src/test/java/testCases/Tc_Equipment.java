package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import testPageObjects.Equipment_Master;
import testPageObjects.LoginPage;

public class Tc_Equipment extends BaseClass {
	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);
		l.submitclick();
		l.AgencyId(username);
		logg.info(getClass().getName()+"Agencyid Entered");
		l.password(password);
		logg.info(getClass().getName()+"Password Entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// l.submitclick();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		logg.info("Clicked On Submit");
		/*
		 * l.ClickOnProfile();
		 * 
		 * logg.info("Clicked On Profile"); driver.manage().timeouts().implicitlyWait(5,
		 * TimeUnit.SECONDS);
		 * 
		 * l.ClickOnSinout(); logg.info("Clicked On Signout");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * l.ClickingOnSinout(); logg.info("Confirm For Signout");
		 */

	}

	@Test(priority = 2)
	public void testEquip() throws Exception {

		Equipment_Master Eq = new Equipment_Master(driver);

		Eq.ClickonMasterData();
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		List<WebElement> elements = driver
				.findElements(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr"));
		int length = elements.size();
		System.out.println(length);

		/*
		 * String s1=driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div")).getText(); String[]
		 * s2=s1.split("/n");
		 */

		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[3]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[3]//td[9]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();

		Thread.sleep(3000);

		Eq.ClickOnAdd();
		Thread.sleep(3000);

		Eq.Selectitemfromlist();
		Select s12 = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		s12.selectByVisibleText(tdText);
		Thread.sleep(3000);
		Eq.Selectunitfromlist();
		Thread.sleep(3000);
		Eq.ClickOnSave();
		/*
		 * for(int i=0;i<s2.length;i++) { if
		 * (s2[i].contains("COMMERCIAL - 47.5 Kg VOT")) { Eq.delete3();
		 * Thread.sleep(4000); Eq.confirmdelete(); }
		 */
		// System.out.println(s2[i]);
	}

	@AfterMethod(enabled = false)
	public void Aftermthd(ITestResult Tr) throws Exception {
		if (ITestResult.FAILURE == Tr.getStatus()) {
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(
					System.getProperty("user.dir") + "/SS/" + Tr.getName() + timestamp + ".png");
			FileUtils.copyFile(source, target);
		}
	}
}
