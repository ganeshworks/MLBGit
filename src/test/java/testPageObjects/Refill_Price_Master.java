package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Refill_Price_Master {

	WebDriver driver;

	public Refill_Price_Master(WebDriver d) {
		driver = d;
	}

	By MasterClick = By.xpath("//div[contains(text(),'Master Data')]");
	By PriceMaster = By.xpath("//div[contains(text(),'Price Master')]");
	By RefillPrice = By.xpath("//div[contains(text(),'Refill Price')]");
	By EnterPin = By.xpath("//input[contains(@placeholder,'Enter Pin Here')]");
	By SubmitPin = By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn = By.xpath("//div[contains(@class,'flex aic jcsb gap10')]//div[1]");
	By ProdList = By.xpath("//select[contains(@class,'drop-select')]");
	By RspSet = By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[2]/div/table/tr[2]/td[2]/div/div[2]/input");
	By OfrPrice = By.xpath("//input[@placeholder='OFFER PRICE']");
	By EffDate = By.xpath("//input[@type='date']");
	By Calclte = By.xpath("//div[normalize-space()='CALCULATE']");
	By Save = By.xpath("//div[normalize-space()='SAVE']");

	By View = By.xpath("//div[contains(@class,'grid')]//div[3]//div[4]//div[1]//div[1]");
	By lister = By.xpath("//div[contains(@class,'Modal_modalContent__rRYZG')]");

	// For 2nd Add

	By ProdList2 = By.xpath("//tr[3]//td[1]//div[1]//select[1]");
	By RspSet2 = By.xpath("//tr[3]//td[2]//div[1]//div[2]//input[1]");
	By OfrPrice2 = By.xpath("//tr[3]//td[6]//div[1]//div[2]//input[1]");
	By EffDate2 = By.xpath("//tr[3]//td[7]//div[1]//div[2]//input[1]");

	// for 3rd add

	By ProdList3 = By.xpath("//tr[4]//td[1]//div[1]//select[1]");
	By RspSet3 = By.xpath("//tr[4]//td[2]//div[1]//div[2]//input[1]");
	By OfrPrice3 = By.xpath("//tr[4]//td[6]//div[1]//div[2]//input[1]");
	By EffDate3 = By.xpath("//tr[4]//td[7]//div[1]//div[2]//input[1]");

	// for 4th add

	By ProdList4 = By.xpath("//tr[5]//td[1]//div[1]//select[1]");
	By RspSet4 = By.xpath("//tr[5]//td[2]//div[1]//div[2]//input[1]");
	By OfrPrice4 = By.xpath("//tr[5]//td[6]//div[1]//div[2]//input[1]");
	By EffDate4 = By.xpath("//tr[5]//td[7]//div[1]//div[2]//input[1]");

	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}

	public void ClickonPricemaster() {
		driver.findElement(PriceMaster).click();
	}

	public void ClickonRefillPrice() {
		driver.findElement(RefillPrice).click();
	}

	public void EnterSecretPin(String num) {
		driver.findElement(EnterPin).sendKeys(num);
	}

	public void ClickonSubmitPin() {
		driver.findElement(SubmitPin).click();
	}

	public void ClickOnAdd() {
		driver.findElement(AddBtn).click();
	}

	public void ProductListSelect() {
		driver.findElement(ProdList).click();
		WebElement ss = driver.findElement(ProdList);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void ProductListSelect2() {
		driver.findElement(ProdList2).click();
		WebElement ss = driver.findElement(ProdList2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void ProductListSelect3() {
		driver.findElement(ProdList3).click();
		WebElement ss = driver.findElement(ProdList3);
		Select s = new Select(ss);
		s.selectByIndex(3);
	}
	public void ProductListSelect4() {
		driver.findElement(ProdList4).click();
		WebElement ss = driver.findElement(ProdList4);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}

	public void EnterRSP(String num) {
		driver.findElement(RspSet).sendKeys(num);
	}
	public void EnterRSP2(String num) {
		driver.findElement(RspSet2).sendKeys(num);
	}
	public void EnterRSP3(String num) {
		driver.findElement(RspSet3).sendKeys(num);
	}
	public void EnterRSP4(String num) {
		driver.findElement(RspSet4).sendKeys(num);
	}
	public void EnterOfrPrice(String num) {
		driver.findElement(OfrPrice).sendKeys(num);
	}
	public void EnterOfrPrice2(String num) {
		driver.findElement(OfrPrice2).sendKeys(num);
	}
	public void EnterOfrPrice3(String num) {
		driver.findElement(OfrPrice3).sendKeys(num);
	}
	public void EnterOfrPrice4(String num) {
		driver.findElement(OfrPrice4).sendKeys(num);
	}
	public void EnterDate(String num) {
		driver.findElement(EffDate).sendKeys(num);
	}
	public void EnterDate2(String num) {
		driver.findElement(EffDate2).sendKeys(num);
	}
	public void EnterDate3(String num) {
		driver.findElement(EffDate3).sendKeys(num);
	}
	public void EnterDate4(String num) {
		driver.findElement(EffDate4).sendKeys(num);
	}

	public void ClickOnCalculate() {
		driver.findElement(Calclte).click();
	}

	public void ClickOnSave() {
		driver.findElement(Save).click();
	}

	public void ClickOnView() {
		driver.findElement(View).click();
	}

}
