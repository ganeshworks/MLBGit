package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cylinder_Purchases {

	WebDriver driver;
	
	public  Cylinder_Purchases(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases=By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By CylPurchase=By.xpath("//div[contains(text(),'Cylinder Purchases')]");
	By AddBtn=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By OmcType=By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By RefNo=By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate=By.xpath("//div[@class='layout-body']//div[3]//div[2]//input[1]");
	By StockDate=By.xpath("//div[4]//div[2]//input[1]");
	By Proddrop= By.xpath("//td[1]//div[1]//select[1]");
	By OneTwoLoad=By.xpath("//td[3]//div[1]//select[1]");
	By UnitRate=By.xpath("//input[@placeholder='UNIT RATE']");
	By Qunty=By.xpath("//input[@placeholder='QUANTITY']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By TruckNo=By.xpath("//input[contains(@placeholder,'TRUCK NUMBER')]");
	By DriverName=By.xpath("//input[@placeholder='DRIVER NAME']");
	By GodwnDrop=By.xpath("//td[12]//div[1]//select[1]");
	By RecevdBy=By.xpath("//td[13]//div[1]//select[1]");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonCylPurc() {
		driver.findElement(CylPurchase).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void SelectOmcfromlist() throws Exception {
		driver.findElement(OmcType).click();
		WebElement ss = driver.findElement(OmcType);
		Select s = new Select(ss);
		Thread.sleep(2000);
		s.selectByIndex(1);
	}
	public void EnterRefNo(String num) {
		driver.findElement(RefNo).sendKeys(num);
	}
	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}
	public void EnterStckRecDate(String date) {
		driver.findElement(StockDate).sendKeys(date);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectLoadType() {
		driver.findElement(OneTwoLoad).click();
		WebElement ss = driver.findElement(OneTwoLoad);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterUnitRate(String num) {
		driver.findElement(UnitRate).sendKeys(num);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}
	public void ClickonCalculate() {
		driver.findElement(Calculate).click();
	}
	public void EnterTruck(String num) {
		driver.findElement(TruckNo).sendKeys(num);
	}
	public void EnterDrivername(String name) {
		driver.findElement(DriverName).sendKeys(name);
	}
	public void SelectGodown() {
		driver.findElement(GodwnDrop).click();
		WebElement ss = driver.findElement(GodwnDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectRecdBy() {
		driver.findElement(RecevdBy).click();
		WebElement ss = driver.findElement(RecevdBy);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
}
