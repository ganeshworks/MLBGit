package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BLPG_PriceMaster {

	WebDriver driver;
	
	public  BLPG_PriceMaster(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By PriceMaster=By.xpath("//div[contains(text(),'Price Master')]");
	By RefillPrice=By.xpath("//div[contains(text(),'BLPG Price')]");
	By EnterPin=By.xpath("//input[contains(@placeholder,'Enter Pin Here')]");
	By SubmitPin=By.xpath("//div[contains(text(),'SUBMIT')]");
	By AddBtn=By.xpath("//div[@class='flex aic jcsb gap10']//div[1]");
	By ProdList=By.xpath("//select[contains(@class,'drop-select')]");
	By RspSet=By.xpath("//input[@placeholder='RSP']");
	By OfrPrice=By.xpath("//input[@placeholder='OFFER PRICE']");
	By EffDate=By.xpath("//input[@type='date']");
	By Calclte=By.xpath("//div[normalize-space()='CALCULATE']");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	
	By View=By.xpath("//div[contains(@class,'view-btn')]");
	By CloseView=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[6]/div/div[1]/button");
	
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
		Select s=new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterRSP(String num) {
		driver.findElement(RspSet).sendKeys(num);
	}
	
	public void EnterOfrPrice(String num) {
		driver.findElement(OfrPrice).sendKeys(num);
	}
	public void EnterDate(String num) {
		driver.findElement(EffDate).sendKeys(num);
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
	public void ClickOnCloseWindow() {
		driver.findElement(CloseView).click();
	}
}
