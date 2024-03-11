package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Purchase_Orders {



	WebDriver driver;
	
	public  Purchase_Orders(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By sales=By.xpath("//div[contains(text(),'Sales')]");
	By Po=By.xpath("//div[contains(text(),'Purchase Orders')]");
	By AddBtn=By.xpath("//div[@class='btn btn-success']");
	By PoNUm=By.xpath("//input[@placeholder='PO NUMBER']");
	By PoDate=By.xpath("//input[@type='date']");
	By CustName=By.xpath("//input[@placeholder='CUSTOMER NAME']");
	By StaffName=By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By Footnts=By.xpath("//input[@placeholder='FOOT NOTES']");
	By SaleType=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	By ProdCat= By.xpath("//td[1]//div[1]//select[1]");
	By Proddrop= By.xpath("//td[2]//div[1]//select[1]");
	By Dicont=By.xpath("//input[@placeholder='DISCOUNT ON UNIT PRICE']");
	By Qanty=By.xpath("//input[@placeholder='QUANTITY']");
	By fetchGst=By.xpath("//div[normalize-space()='FETCH GST']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']"); 
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonSales() {
		driver.findElement(sales).click();
	}

	public void ClickonPO() {
		driver.findElement(Po).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterPoNum(String num) {
		driver.findElement(PoNUm).sendKeys(num);
	}
	
	public void EnterPODate(String date) {
		driver.findElement(PoDate).sendKeys(date);
	}
	public void EnterCustName(String name) {
		driver.findElement(CustName).sendKeys(name);
	}
	
	public void SelectStafffromlist() {
		driver.findElement(StaffName).click();
		WebElement ss = driver.findElement(StaffName);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterFootnotes(String name) {
		driver.findElement(Footnts).sendKeys(name);
	}
	public void ClickonSaleType() {
		driver.findElement(SaleType).click();
	}
	public void SelectProdCatfromlist() {
		driver.findElement(ProdCat).click();
		WebElement ss = driver.findElement(ProdCat);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void Enterdisc(String num) {
		driver.findElement(Dicont).sendKeys(num);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qanty).sendKeys(num);
	}
	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	public void ClickOnFetchGst() {
		driver.findElement(fetchGst).click();
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
}
