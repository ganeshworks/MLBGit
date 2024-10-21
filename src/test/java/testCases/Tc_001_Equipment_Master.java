package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.protobuf.Duration;

import okio.Timeout;
import testPageObjects.Equipment_Master;
import testPageObjects.LoginPage;

public class Tc_001_Equipment_Master extends BaseClass {

	@Test(priority = 1)
	public void login() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);

		l.AgencyId(username);
		logg.info(getClass().getName() + "Agencyid Entered");
		l.password(password);
		logg.info(getClass().getName() + "Password Entered");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		l.submitclick();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		logg.info(getClass().getName() + "Clicked On Submit");
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
		//List<WebElement> tst=new ArrayList<>(driver.findElements(By.tagName(RandomInt)));
		
		
	}

	@Test(priority = 2)

	public void Equipment() throws Exception {
		Equipment_Master Eq = new Equipment_Master(driver);

		Eq.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();
		logg.info(getClass().getName() + "Clicked On Equipment master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Eq.dropdownselect();

		Eq.ClickOnAdd();
		logg.info(getClass().getName() + "Clicked On Add ");
		Thread.sleep(3000);
		

		Eq.Selectitemfromlist();

		
		//ss.selectByVisibleText(tdText);

		logg.info(getClass().getName() + "Equipment Selected From List");
		Thread.sleep(3000);
		Eq.Selectunitfromlist();
		logg.info(getClass().getName() + "Units Selected From List");

		Thread.sleep(3000);
		/*
		 * Eq.EnterFulls("150"); logg.info(getClass().getName() + "Fulls Added");
		 * Thread.sleep(3000); Eq.EnterEmpties("10"); logg.info(getClass().getName() +
		 * "Empties Added"); Eq.EnterDate("02/27/2024"); logg.info(getClass().getName()
		 * + "Date Added"); Thread.sleep(3000);
		 */
		
		
		Eq.ClickOnAdd();
		Eq.Selectitemfromlist2();
		Eq.Selectunitfromlist2();
		/*
		 * Eq.EnterFulls2("100"); Eq.EnterEmpties2("100"); Eq.EnterDate2("03/16/2024");
		 */
		Thread.sleep(3000);
		Eq.ClickOnAdd();
		Eq.Selectitemfromlist3();
		Eq.Selectunitfromlist3();
		/*
		 * Eq.EnterFulls3("100"); Eq.EnterEmpties3("100"); Eq.EnterDate3("03/16/2024");
		 */
		Thread.sleep(3000);
		Eq.ClickOnAdd();
		Eq.Selectitemfromlist4();
		Eq.Selectunitfromlist4();
		/*
		 * Eq.EnterFulls4("100"); Eq.EnterEmpties4("100"); Eq.EnterDate4("03/16/2024");
		 */
		Thread.sleep(3000);
		Eq.ClickOnAdd();
		Eq.Selectitemfromlist5();
		Eq.Selectunitfromlist();
		/*
		 * Eq.EnterFulls("100"); Eq.EnterEmpties("100"); Eq.EnterDate("03/16/2024");
		 */
		Thread.sleep(3000);
		Eq.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");
		Thread.sleep(5000);
		
		/*
		 * String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		 * Date()); TakesScreenshot ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); File target = new File(
		 * System.getProperty("user.dir") + "/Screenshots/" + "Deleted And Refetched" +
		 * timestamp + ".png"); FileUtils.copyFile(source, target);
		 * System.out.println("screenshot taken");
		 */

	}

	@Test(enabled = false)

	public void DeleteAddback() throws Exception {
		Equipment_Master Eq = new Equipment_Master(driver);

		Eq.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Eq.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Eq.ClickonEquipmentMaster();
		logg.info(getClass().getName() + "Clicked On Equipment master");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Find the third <tr> element
		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/table/tr[3]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[3]//td[9]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		// driver.switchTo().alert().accept();
		logg.info(getClass().getName() + "Equipment Deleted");

		Eq.ClickOnAdd();
		logg.info(getClass().getName() + "Equipment Added Back");
		Thread.sleep(3000);

		Eq.Selectitemfromlist();

		Select ss = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		ss.selectByVisibleText(tdText);
		logg.info(getClass().getName() + "Equipment Selected From List");
		Thread.sleep(3000);
		Eq.Selectunitfromlist();
		logg.info(getClass().getName() + "Units Selected From List");
		Thread.sleep(3000);

		// Eq.deleteAddedRow();

		Eq.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		Thread.sleep(3000);
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		
	}
	
	@AfterMethod(enabled = false)
	public void Aftermthd(ITestResult Tr) throws Exception {
		if (ITestResult.FAILURE == Tr.getStatus()) {
			Thread.sleep(2000);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/SS/" +Tr.getClass()+ Tr.getName() + timestamp + ".png");
			FileUtils.copyFile(source, target);
		}}

}
