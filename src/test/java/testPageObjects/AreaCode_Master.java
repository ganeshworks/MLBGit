package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AreaCode_Master {

	WebDriver driver;
	
	public  AreaCode_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By ProductClick=By.xpath("//div[contains(text(),'Product Master')]");
	By AreaCodeClick=By.xpath("//div[contains(text(),'Area Code Master')]");
	By AddButn=By.xpath("//div[contains(@class,'btn btn-success')]");
	By EnterPin=By.xpath("//input[contains(@placeholder,'PIN CODE')]");
	By EnterAreacode=By.xpath("//input[@placeholder='AREA CODE']");
	By EnterAreaName=By.xpath("//input[@placeholder='AREA NAME']");
	By EnterDistance=By.xpath("//input[@placeholder='DISTANCE (KM)']");
	By EnterCharges=By.xpath("//input[@placeholder='TRANSPORT CHARGES']");
	By EnterDate=By.xpath("//input[@type='date']");
	By SaveButn=By.xpath("//div[normalize-space()='SAVE']");
	By Delele=By.xpath("//div[contains(@class,'layout-outlet')]//div[2]//div[1]//table[1]//tr[2]//td[7]");
	By ConfrmDelete=By.xpath("//div[normalize-space()='Delete']");
	
	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonProductmaster() {
		driver.findElement(ProductClick).click();
	}
	public void ClickOnAreaCodeMaster() {
		driver.findElement(AreaCodeClick).click();
	} 
	public void ClickOnAdd() {
		driver.findElement(AddButn).click();
	} 
	public void EnterPincode(String num) {
		driver.findElement(EnterPin).sendKeys(num);
	} 
	public void EnterAreacode(String namenum) {
		driver.findElement(EnterAreacode).sendKeys(namenum);
	} 
	public void EnterAreaNames(String name) {
		driver.findElement(EnterAreaName).sendKeys(name);
	} 
	public void EnterOnewayDistance(String num) {
		driver.findElement(EnterDistance).sendKeys(num);
	}
	public void EnterTansCharges(String num) {
		driver.findElement(EnterCharges).sendKeys(num);
	} 
	public void SetDate(String date) {
		driver.findElement(EnterDate).sendKeys(date);
	}
	public void ClickOnSaveButton() {
		driver.findElement(SaveButn).click();
	}
	public void ClickOnDeleteButton() {
		driver.findElement(Delele).click();
	}
	
	public void ClickOnConfrmDeleteButton() {
		driver.findElement(ConfrmDelete).click();
	}
	
	
	
	
	
	
	
	
	
}
