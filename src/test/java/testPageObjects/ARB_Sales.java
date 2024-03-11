package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ARB_Sales {


	WebDriver driver;
	
	public  ARB_Sales(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By sales=By.xpath("//div[contains(text(),'Sales')]");
	By ARbSales=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[3]/div[5]/div[2]");
	By AddBtn=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By SalesDate=By.xpath("//input[@type='date']");
	By CustOrOmc=By.xpath("//div[@class='flex aic gap10']//div[3]//select[1]");
	By Payterms=By.xpath("//div[contains(@class,'Modal_centered__qwdvX')]//div[4]//select[1]");
	By StaffName=By.xpath("//div[contains(@class,'flex aic gap10')]//div[1]//div[1]//select[1]");
	By VehicleNo=By.xpath("//div[contains(@class,'flex aic gap10')]//div[2]//div[1]//select[1]");
	By Proddrop= By.xpath("//td[1]//div[1]//select[1]");
	By Dicont=By.xpath("//input[contains(@placeholder,'DISCOUNT ON UNIT PRICE')]");
	By Qanty=By.xpath("//input[@placeholder='Quantity']");
	By BankAcount=By.xpath("//td[6]//div[1]//select[1]");
	By FetchPrice=By.xpath("//div[normalize-space()='FETCH PRICE']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'btn-info1')][normalize-space()='ADD']");
	By Previw_Save=By.xpath("//div[normalize-space()='PREVIEW DATA AND SAVE']");
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonArbSales() {
		driver.findElement(ARbSales).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterSalesDate(String date) {
		driver.findElement(SalesDate).sendKeys(date);
	}

	public void SelectCustName() {
		driver.findElement(CustOrOmc).click();
		WebElement ss = driver.findElement(CustOrOmc);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}

	public void SelectPayterms() {
		driver.findElement(Payterms).click();
		WebElement ss = driver.findElement(Payterms);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectStaff() {
		driver.findElement(StaffName).click();
		WebElement ss = driver.findElement(StaffName);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void Selectvehicle() {
		driver.findElement(VehicleNo).click();
		WebElement ss = driver.findElement(VehicleNo);
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
	
	public void SelectBankfromlist() {
		driver.findElement(BankAcount).click();
		WebElement ss = driver.findElement(BankAcount);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void ClickOnFetchPrice() {
		driver.findElement(FetchPrice).click();
	}
	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	public void ClickonSave() {
		driver.findElement(Previw_Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
}
