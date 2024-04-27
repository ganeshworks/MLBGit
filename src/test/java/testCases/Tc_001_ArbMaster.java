package testCases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import testPageObjects.Arb_Master;
import testPageObjects.LoginPage;

public class Tc_001_ArbMaster extends BaseClass {

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
	}

	@Test(priority = 2)
	public void AddArbMaster() throws Exception {
		Arb_Master Ar = new Arb_Master(driver);

		Ar.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Ar.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");

		Ar.ClickOnBlpg();

		logg.info(getClass().getName() + "Clicked On Blpg/Nfr/Arb master");
		//Ar.dropdownselect();

		Thread.sleep(5000);

		Ar.ClickOnAdd();
		Thread.sleep(5000);
		Ar.Selectitemfromlist();
		Thread.sleep(5000);
		logg.info(getClass().getName() + "Selected Item From List");
		Ar.AddBrandName("QaaTest"+RandomString.make(5));
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName("TestQa"+RandomString.make(2));
		logg.info(getClass().getName() + "Added Product name");
		Ar.AddHsn(Sql.Pref());
		logg.info(getClass().getName() + "Added Hsn Code");
		Ar.Selectunitfromlist();
		logg.info(getClass().getName() + "Units Selected From List");
		Ar.GstFromList();
		logg.info(getClass().getName() + "Gst Selected From List");
		Ar.AddPurchasePrice("157");
		logg.info(getClass().getName() + "Purchase Price Added");
		Ar.AddOpStock("120");
		logg.info(getClass().getName() + "Op Stock Added");
		Ar.EnterDate("03/02/2024");
		logg.info(getClass().getName() + "Date Added");
		Thread.sleep(5000);

		
		
		Ar.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		// Find the third <tr> element

	}
	@Test(enabled = false)
	public void MultipleAddArbMaster() throws Exception {
		Arb_Master Ar = new Arb_Master(driver);

		Ar.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Thread.sleep(5000);
		Ar.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");
		Thread.sleep(5000);
		Ar.ClickOnBlpg();

		logg.info(getClass().getName() + "Clicked On Blpg/Nfr/Arb master");
		//Ar.dropdownselect();

		Thread.sleep(5000);

		Ar.ClickOnAdd();
		Ar.Selectitemfromlist();
		logg.info(getClass().getName() + "Selected Item From List");
		Ar.AddBrandName("QaaaTest"+RandomString.make(5));
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName("TestQa"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Product name");
		Ar.AddHsn(Sql.Pref());
		logg.info(getClass().getName() + "Added Hsn Code");
		Ar.Selectunitfromlist();
		logg.info(getClass().getName() + "Units Selected From List");
		Ar.GstFromList();
		logg.info(getClass().getName() + "Gst Selected From List");
		Ar.AddPurchasePrice("157");
		logg.info(getClass().getName() + "Purchase Price Added");
		Ar.AddOpStock("120");
		logg.info(getClass().getName() + "Op Stock Added");
		Ar.EnterDate("03/02/2024");
		logg.info(getClass().getName() + "Date Added");
		Thread.sleep(5000);

		//For 2nd Item
		
	

		Ar.ClickOnAdd();
		Ar.Selectitemfromlist2();
		logg.info(getClass().getName() + "Selected Item From List");
		Ar.AddBrandName2("AQaTest"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName2("TesQa"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Product name");
		Ar.AddHsn2("27111900");
		logg.info(getClass().getName() + "Added Hsn Code");
		Thread.sleep(2000);
		Ar.Selectunitfromlist2();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		Ar.GstFromList2();
		logg.info(getClass().getName() + "Gst Selected From List");
		Ar.AddPurchasePrice2("157");
		logg.info(getClass().getName() + "Purchase Price Added");
		Ar.AddOpStock2("120");
		logg.info(getClass().getName() + "Op Stock Added");
		Ar.EnterDate2("03/02/2024");
		logg.info(getClass().getName() + "Date Added");
		Thread.sleep(5000);
		
		//for3rd add
		
		Ar.ClickOnAdd();
		Ar.Selectitemfromlist3();
		logg.info(getClass().getName() + "Selected Item From List");
		Ar.AddBrandName3("AaTest"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName3("TesQa"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Product name");
		//Ar.AddHsn3("27111900");
		logg.info(getClass().getName() + "Added Hsn Code");
		Thread.sleep(2000);
		//Ar.Selectunitfromlist3();
		Thread.sleep(2000);
		logg.info(getClass().getName() + "Units Selected From List");
		//Ar.GstFromList3();
		logg.info(getClass().getName() + "Gst Selected From List");
		Ar.AddPurchasePrice3("157");
		logg.info(getClass().getName() + "Purchase Price Added");
		Ar.AddOpStock3("120");
		logg.info(getClass().getName() + "Op Stock Added");
		Ar.EnterDate3("03/02/2024");
		logg.info(getClass().getName() + "Date Added");
		Thread.sleep(5000);
		
		//for 4th add
		
		Ar.ClickOnAdd();
		Ar.Selectitemfromlist4();
		logg.info(getClass().getName() + "Selected Item From List");
		Ar.AddBrandName4("AQTest"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName4("TesQa"+RandomString.make(1));
		logg.info(getClass().getName() + "Added Product name");
		//Ar.AddHsn4("27111900");
		logg.info(getClass().getName() + "Added Hsn Code");
		Thread.sleep(2000);
		//Ar.Selectunitfromlist4();
		logg.info(getClass().getName() + "Units Selected From List");
		Thread.sleep(2000);
		//Ar.GstFromList4();
		logg.info(getClass().getName() + "Gst Selected From List");
		Ar.AddPurchasePrice4("157");
		logg.info(getClass().getName() + "Purchase Price Added");
		Ar.AddOpStock4("120");
		logg.info(getClass().getName() + "Op Stock Added");
		Ar.EnterDate4("03/02/2024");
		logg.info(getClass().getName() + "Date Added");
		Thread.sleep(5000);
		
		Ar.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		// Find the third <tr> element

	}

	@Test(enabled = false)

	public void DeleteAddback() throws Exception {
		
		Arb_Master Ar = new Arb_Master(driver);
		Thread.sleep(1000);
		
		Ar.ClickonMasterData();
		logg.info(getClass().getName() + "Clicked On MasterData");
		Ar.ClickonProductmaster();
		logg.info(getClass().getName() + "Clicked On Product Master");

		Ar.ClickOnBlpg();

		logg.info(getClass().getName() + "Clicked On Blpg/Nfr/Arb master");

		WebElement trElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[3]/div/table/tr[2]"));

		// Find the first <td> element within the third <tr> element
		WebElement tdElement = trElement.findElement(By.xpath("./td[1]"));

		// Get the text of the first <td> element
		String tdText = tdElement.getText();

		System.out.println(tdText);

		driver.findElement(By.xpath("//tr[2]//td[10]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Delete']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		logg.info(getClass().getName() + "Blpg/Nfr/Arb Item Deleted");
		/*
		 * Ar.DeleteProductFromList(); Ar.ConfirmDeleteClick(); Thread.sleep(2000);
		 * driver.switchTo().alert().accept(); Thread.sleep(2000);
		 */
		Ar.ClickOnAdd();
		logg.info(getClass().getName() + "Product Added Back");
		Ar.Selectitemfromlist();
		Select ss = new Select(driver.findElement(By.xpath("//td[1]//div[1]//select[1]")));
		ss.selectByVisibleText(tdText);
		logg.info(getClass().getName() + "Product Selected From List");
		Ar.AddBrandName("QaTest");
		logg.info(getClass().getName() + "Added Brandname");
		Ar.AddProdName("TestQa");
		logg.info(getClass().getName() + "Added Product name");
		Ar.DeleteHsn();
		
		//logg.info(getClass().getName() + "Added Hsn Code");
		Thread.sleep(4000);
		Ar.ClickOnSave();
		logg.info(getClass().getName() + "Clicked On Save");

		Thread.sleep(2000);
	}
}
