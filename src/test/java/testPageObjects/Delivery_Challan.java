package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Delivery_Challan {



	WebDriver driver;
	
	public  Delivery_Challan(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By sales=By.xpath("//div[contains(text(),'Sales')]");
	By DelChallan=By.xpath("//section//div[6]");
	By AddBtn=By.xpath("//div[@class='btn btn-success']");
	By DcDate=By.xpath("//input[@type='date']");
	By CustName=By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//select[1]");
	By StaffName=By.xpath("//div[@class='layout-body']//div[3]//select[1]");
	By VehicleNo=By.xpath("//div[@class='flex aic gap10']//div[4]//select[1]");
	By InvoiceNo=By.xpath("//input[@placeholder='INVOICE NUMBER']");
	By DeliMode=By.xpath("//input[@placeholder='DELIVERY MODE']");
	By DeliveryInstr=By.xpath("//input[@placeholder='DELIVERY INSTRUCTIONS']");
	By Proddrop= By.xpath("//tr[2]//td[1]//div[1]//select[1]");
	By UnitPrice=By.xpath("//tr[2]//td[3]//div[1]//div[1]//input[1]");
	By Qanty=By.xpath("//tr[2]//td[4]//div[1]//div[1]//input[1]");
	By FetchValue=By.xpath("//div[normalize-space()='FETCH VALUE']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonDc() {
		driver.findElement(DelChallan).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterDcDate(String date) {
		driver.findElement(DcDate).sendKeys(date);
	}

	public void SelectCustName() {
		driver.findElement(CustName).click();
		WebElement ss = driver.findElement(CustName);
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
	public void EnterInvNo(String Num) {
		driver.findElement(InvoiceNo).sendKeys(Num);
	}
	public void EnterDcMode(String date) {
		driver.findElement(DeliMode).sendKeys(date);
	}
	public void EnterDcInst(String name) {
		driver.findElement(DeliveryInstr).sendKeys(name);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void EnterUnitPrice(String num) {
		driver.findElement(UnitPrice).sendKeys(num);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}
	
	public void ClickOnFetchValue() {
		driver.findElement(FetchValue).click();
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
