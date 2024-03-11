package transactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ARB_Purchase {


	WebDriver driver;
	
	public  ARB_Purchase(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases=By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By ArbPurchase=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/section/div[2]/div[2]");
	By AddBtn=By.xpath("//div[@class='btn btn-success']");
	By InvNo=By.xpath("//input[@placeholder='INV REF NO']");
	By InvDate=By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//div[2]//input[1]");
	By StockDate=By.xpath("//div[@class='flex aic gap10']//div[3]//div[2]//input[1]");
	By Venddrop= By.xpath("//div[@class='flex aic gap10']//div//select[@class='drop-select']");
	By RevCharge=By.xpath("//div[@class='flex aic gap10 credit-limit']//div[1]//div[1]//select[1]");
	By PoDrop=By.xpath("//div[@class='Modal_modalContent__rRYZG']//div[2]//div[1]//select[1]");
	By PODate=By.xpath("//div[@class='flex aic gap10 credit-limit']//div//input[@type='date']");
	By Proddrop= By.xpath("//td[1]//div[1]//select[1]");
	By fetchGst=By.xpath("//div[normalize-space()='FETCH GST']");
	By UnitRate=By.xpath("//input[@placeholder='UNIT RATE']");
	By Qunty=By.xpath("//input[@placeholder='QUANTITY']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By TruckNo=By.xpath("//input[contains(@placeholder,'TRUCK NUMBER')]");
	By DriverName=By.xpath("//input[@placeholder='DRIVER NAME']");
	By RecevdBy=By.xpath("//td[13]//div[1]//select[1]");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonArbPurch() {
		driver.findElement(ArbPurchase).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterInvNo(String num) {
		driver.findElement(InvNo).sendKeys(num);
	}
	public void EnterInvDate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}
	public void EnterStckRecDate(String date) {
		driver.findElement(StockDate).sendKeys(date);
	}
	public void SelectVendorfromlist() {
		driver.findElement(Venddrop).click();
		WebElement ss = driver.findElement(Venddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectRevCharge() {
		driver.findElement(RevCharge).click();
		WebElement ss = driver.findElement(RevCharge);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void SelectPODrop() {
		driver.findElement(PoDrop).click();
		WebElement ss = driver.findElement(PoDrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterPODate(String date) {
		driver.findElement(PODate).sendKeys(date);
	}
	public void SelectProdfromlist() {
		driver.findElement(Proddrop).click();
		WebElement ss = driver.findElement(Proddrop);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ClickOnFetchGst() {
		driver.findElement(fetchGst).click();
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
