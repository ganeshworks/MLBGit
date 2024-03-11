package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dom_Cyl_Sales {

	WebDriver driver;
	
	public  Dom_Cyl_Sales(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By sales=By.xpath("//div[contains(text(),'Sales')]");
	By DomSales=By.xpath("//div[contains(text(),'Domestic CYL Sales')]");
	By AddBtn=By.xpath("//div[@class='btn btn-success']");
	By SalesDate=By.xpath("//input[@type='date']");
	By CustName=By.xpath("//div[contains(@class,'layout-body')]//div[3]//select[1]");
	By Payterms=By.xpath("//div[@class='Modal_centered__qwdvX']//div[4]//select[1]");
	By Proddrop= By.xpath("//td[1]//div[1]//select[1]");
	By Dicont=By.xpath("//input[@placeholder='DISCOUNT ON UNIT PRICE']");
	By Qanty=By.xpath("//input[@placeholder='Quantity']");
	By Digi=By.xpath("//input[@placeholder='PREPAID CYLINDERS']");
	By Psv=By.xpath("//input[@placeholder='PSV QUANTITY']");
	By DeleverdBy=By.xpath("//td[8]//div[1]//select[1]");
	By BankAcount=By.xpath("//td[9]//div[1]//select[1]");
	By AreaCode=By.xpath("//td[10]//div[1]//select[1]");
	By FetchInvoioce=By.xpath("//div[normalize-space()='FETCH INVOICE NUMBER']");
	By FetchPrice=By.xpath("//div[normalize-space()='FETCH PRICE']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonDomSales() {
		driver.findElement(DomSales).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterSalesDate(String date) {
		driver.findElement(SalesDate).sendKeys(date);
	}

	public void SelectCustName() {
		driver.findElement(CustName).click();
		WebElement ss = driver.findElement(CustName);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}

	public void SelectPayterms() {
		driver.findElement(Payterms).click();
		WebElement ss = driver.findElement(Payterms);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void Enterdisc(String num) {
		driver.findElement(Dicont).sendKeys(num);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}
	public void EnterDigi(String num) {
		driver.findElement(Digi).sendKeys(num);
	}
	public void EnterPsv(String num) {
		driver.findElement(Psv).sendKeys(num);
	}
	public void SelectDeliverdBy() {
		driver.findElement(DeleverdBy).click();
		WebElement ss = driver.findElement(DeleverdBy);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void SelectBankfromlist() {
		driver.findElement(BankAcount).click();
		WebElement ss = driver.findElement(BankAcount);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void SelectAreaCodefromlist() {
		driver.findElement(AreaCode).click();
		WebElement ss = driver.findElement(AreaCode);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void ClickOnFetchInvoice() {
		driver.findElement(FetchInvoioce).click();
	}
	public void ClickOnFetchPrice() {
		driver.findElement(FetchPrice).click();
	}
	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	

}
