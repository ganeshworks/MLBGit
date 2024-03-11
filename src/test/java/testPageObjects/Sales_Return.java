package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sales_Return {

	WebDriver driver;
	
	public  Sales_Return(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By sales=By.xpath("//div[contains(text(),'Sales')]");
	By SaleRtn=By.xpath("//section//div[7]");
	By AddBtn=By.xpath("//div[contains(@class,'btn btn-success')]");
	By SaleInvNo=By.xpath("//input[@placeholder='SALES INVOICE NO']");
	By invoiceDate=By.xpath("//input[contains(@type,'date')]");
	By CustName=By.xpath("//body/div[@id='root']/div[@class='layout-main']/div[@class='layout-body']/div[@class='layout-outlet']/div[@class='container']/div[@class='Modal_centered__qwdvX']/div[@class='Modal_modal__EqaZW']/div[@class='Modal_modalContent__rRYZG']/div/div[@class='flex aic gap10']/div/select[1]");
	By Payterms=By.xpath("//div[contains(@class,'flex aic gap10 mt10')]//div//select[contains(@class,'drop-select')]");
	By Narration=By.xpath("//input[contains(@placeholder,'NARRATION')]");
	By Proddrop= By.xpath("//td[1]//div[1]//select[1]");
	By RetnQanty=By.xpath("//input[contains(@placeholder,'Quantity')]");
	By NetWt=By.xpath("//input[@placeholder='NET WEIGHT']");
	By BankAc=By.xpath("//td[11]//div[1]//select[1]");
	By FetchGst=By.xpath("//div[normalize-space()='FETCH GST']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonSalesReturn() {
		driver.findElement(SaleRtn).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterSaleInvNo(String Num) {
		driver.findElement(SaleInvNo).sendKeys(Num);
	}
	public void EnterInvoiceDate(String date) {
		driver.findElement(invoiceDate).sendKeys(date);
	}

	public void SelectCustName() {
		driver.findElement(CustName).click();
		WebElement ss = driver.findElement(CustName);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void SelectPayTerms() {
		driver.findElement(Payterms).click();
		WebElement ss = driver.findElement(Payterms);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterNarration(String name) {
		driver.findElement(Narration).sendKeys(name);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void EnterRetnQanty(String num) {
		driver.findElement(RetnQanty).sendKeys(num);
	}
	public void EnterNetWt(String num) {
		driver.findElement(NetWt).sendKeys(num);
	}
	public void SelectBank() {
		driver.findElement(BankAc).click();
		WebElement ss = driver.findElement(BankAc);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnFetchGst() {
		driver.findElement(FetchGst).click();
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
