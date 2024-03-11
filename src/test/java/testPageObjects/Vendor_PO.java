package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Vendor_PO {



	WebDriver driver;
	
	public  Vendor_PO(WebDriver d) {
		driver=d;
	}
	
	By Transactions=By.xpath("//div[contains(text(),'Transactions')]");
	By Purchases=By.xpath("//div[@class='list-title fs14'][normalize-space()='Purchases']");
	By VendorePo=By.xpath("//div[contains(text(),'Vendor PO')]");
	By AddBtn=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[1]/div[3]/div[1]");
	By PoNo=By.xpath("//input[contains(@placeholder,'PO NUMBER')]");
	By InvDate=By.xpath("//div[@class='flex aic gap10']//div[2]//div[2]//input[1]");
	By VendNmeDrp=By.xpath("//body/div[@id='root']/div[contains(@class,'layout-main')]/div[contains(@class,'layout-body')]/div[contains(@class,'layout-outlet')]/div[contains(@class,'container')]/div[contains(@class,'Modal_centered__qwdvX')]/div[contains(@class,'Modal_modal__EqaZW')]/div[contains(@class,'Modal_modalContent__rRYZG')]/div/div[contains(@class,'flex aic gap10')]/div/select[1]");
	By QuoteNo=By.xpath("//input[contains(@placeholder,'QUOTATION NUMBER')]");
	By QuoteDate=By.xpath("//div[5]//div[2]//input[1]");
	By RevCharge=By.xpath("//div[contains(@class,'flex aic gap10 credit-limit')]//div//div//select[contains(@class,'drop-select')]");
	By Narration=By.xpath("//input[contains(@placeholder,'NARRATION')]");
	By Proddrop= By.xpath("//div[@class='tableScroll']//table//tr//td//div//select[@class='drop-select']");
	By Qunty=By.xpath("//input[contains(@placeholder,'QUANTITY')]");
	By OtherCharges=By.xpath("//input[@placeholder='0.00']");
	By ValidUpto=By.xpath("//div[@class='tableScroll']//input[@type='date']");
	By Calculate=By.xpath("//div[normalize-space()='CALCULATE']");
	By AddRow=By.xpath("//div[contains(@class,'flex aic gap10')]//div[contains(@role,'button')][normalize-space()='ADD']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	
	public void ClickonTransactions() {
		driver.findElement(Transactions).click();
	}

	public void ClickonPurchases() {
		driver.findElement(Purchases).click();
	}

	public void ClickonVendorPO() {
		driver.findElement(VendorePo).click();
	}
	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}
	public void EnterPONo(String num) {
		driver.findElement(PoNo).sendKeys(num);
	}
	public void EnterPODate(String date) {
		driver.findElement(InvDate).sendKeys(date);
	}
	public void EnterVendName() {
		driver.findElement(VendNmeDrp).click();
		WebElement ss = driver.findElement(VendNmeDrp);
		Select s = new Select(ss);
		s.selectByIndex(0);
	}
	public void EnterQuoteNo(String num) {
		driver.findElement(QuoteNo).sendKeys(num);
	}
	public void EnterQuoteDate(String date) {
		driver.findElement(QuoteDate).sendKeys(date);
	}
	public void SelectRevCharge() {
		driver.findElement(RevCharge).click();
		WebElement ss = driver.findElement(RevCharge);
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
		s.selectByIndex(1);
	}
	public void EnterQanty(String num) {
		driver.findElement(Qunty).sendKeys(num);
	}
	public void EnterOtherCharge(String num) {
		driver.findElement(OtherCharges).sendKeys(num);
	}
	public void ValidUpto(String Date) {
		driver.findElement(ValidUpto).sendKeys(Date);
	}
	public void ClickOnCalculate() {
		driver.findElement(Calculate).click();
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
}
