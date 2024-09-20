package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Nc_Dbc_Transactions {

	WebDriver driver;

	public Nc_Dbc_Transactions(WebDriver d) {
		driver = d;
	}

	By Transactions = By.xpath("//div[contains(text(),'Transactions')]");
	By Nc_Dbc = By.xpath(
			"//div[contains(text(),'NC / DBC / RC / TV')]");
	By NcDbc = By.xpath("//div[@class='list-title fs12'][normalize-space()='NC / DBC']");
	By ItemDrop = By.xpath("//select[@class='drop-select']");
	By AddNcDbc = By.xpath("//div[@class='flex aic jcsb gap10']//div[2]");
	By invoiceDate = By.xpath("//input[@placeholder='INVOICE DATE']");
	By invoiceAmt = By.xpath("//div[@class='flex aic gap10']//div[3]//select[1]");
	By CustName = By.xpath("//input[@placeholder='CUST NO / CUST NAME']");
	By CashRevd = By.xpath("//input[@placeholder='CASH RECEIVED']");
	By AmntRecdOnline = By.xpath("//input[@placeholder='AMOUNT RECEIVED ONLINE']");
	By BankAcnt = By.xpath("//div[4]//select[1]");
	By FetchDep = By.xpath("//div[normalize-space()='FETCH DEPOSITS AND CHARGES']");
	By Calculate = By.xpath("//div[normalize-space()='CALCULATE']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonNcDbc() {
		driver.findElement(Nc_Dbc).click();
	}

	public void ClickonNcDbcSub() {
		driver.findElement(NcDbc).click();
	}
	public void SelectPackage() {
		driver.findElement(ItemDrop).click();
		WebElement ss = driver.findElement(ItemDrop);
		Select s = new Select(ss);
<<<<<<< HEAD
		s.selectByIndex(3);
=======
		s.selectByIndex(1);
>>>>>>> a192858e0b1d6d8928e2db07eaf691695b681a20
	}
	public void ClickOnAdd() {
		driver.findElement(AddNcDbc).click();
	}


	public void EnterInvoiceDate(String date) {
		driver.findElement(invoiceDate).sendKeys(date);
	}

	

	public void SelectInvoiceAmt() {
		driver.findElement(invoiceAmt).click();
		WebElement ss = driver.findElement(invoiceAmt);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterCustName(String name) {
		driver.findElement(CustName).sendKeys(name);
	}

	public void EnterCashRecvd(String num) {
		driver.findElement(CashRevd).sendKeys(num);
	}

	public void EnterAmtRecvdOnline(String num) {
		driver.findElement(AmntRecdOnline).sendKeys(num);
	}

	public void SelectBank() {
		driver.findElement(BankAcnt).click();
		WebElement ss = driver.findElement(BankAcnt);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void ClickOnFetchDepAndCharges() {
		driver.findElement(FetchDep).click();
	}

	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}

	public void ClickonSave() {
		driver.findElement(Save).click();
	}


}
