package testPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cust_Vendor_Master {

	WebDriver driver;
	
	public  Cust_Vendor_Master(WebDriver d) {
		driver=d;
	}
	
	By MasterClick=By.xpath("//div[contains(text(),'Master Data')]");
	By CustVendor=By.xpath("//div[contains(text(),'Cust/Vend Master')]");
	By AddBtn=By.xpath("//div[contains(@class,'flex aic jcsb gap10')]//div[1]");
	By partyType=By.xpath("//div[contains(@class,'credit-limit')]//div[1]//div[1]//select[1]");
	By GstReg=By.xpath("//div[contains(@class,'Modal_modalContent__rRYZG')]//div[2]//div[1]//select[1]");
	By Gst=By.xpath("//input[@placeholder='GSTIN']");
	By Pan=By.xpath("//input[@placeholder='PAN']");
	By Partyname=By.xpath("//input[@placeholder='Party Name']");
	By Less10cr=By.xpath("//div[contains(text(),'<10 Crores')]");
	By Great10Cr=By.xpath("//div[contains(text(),'>10 Crores')]");
	By opBalance=By.xpath("//input[@placeholder='0.0']");
	By Address=By.xpath("//div[contains(@class,'credit-limit')]//div//input[contains(@placeholder,'ADDRESS')]");
	By Statedrp=By.xpath("//div[10]//div[1]//select[1]");
	By District=By.xpath("//div[11]//div[1]//select[1]");
	By Location=By.xpath("//div[13]//div[1]//select[1]");
	By pincode=By.xpath("//div[contains(@class,'credit-limit')]//div//input[contains(@placeholder,'PINCODE')]");
	By Email=By.xpath("//input[@placeholder='EMAIL']");
	By Contact=By.xpath("//input[@placeholder='CONTACT NO']");
	By CheckYes=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[1]");
	By CheckNo=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[2]/div[2]");
	
	By UnitName=By.xpath("//input[contains(@placeholder,'UNIT NAME')]");
	By Address2=By.xpath("//div[contains(@class,'tableScroll')]//input[contains(@placeholder,'ADDRESS')]");
	By State2=By.xpath("//td[3]//div[1]//select[1]");
	By District2=By.xpath("//td[4]//div[1]//select[1]");
	By Location2=By.xpath("//td[6]//div[1]//select[1]");
	By pincode2=By.xpath("//div[contains(@class,'tableScroll')]//input[contains(@placeholder,'PINCODE')]");
	By AddRow=By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div[2]/div/div[4]/div/div[2]/div/div[4]/div[1]");
	By Save=By.xpath("//div[normalize-space()='SAVE']");
	By DownloadExcel=By.xpath("//div[normalize-space()='DOWNLOAD EXCEL']");
	By uploadExcel=By.xpath("//div[normalize-space()='UPLOAD EXCEL']");


	public void ClickonMasterData() {
		driver.findElement(MasterClick).click();
	}
	public void ClickonCustVendmaster() {
		driver.findElement(CustVendor).click();
	}
	public void ClickonAddButton() {
		driver.findElement(AddBtn).click();
	}
	public void Selectparttypefromlist() throws Exception {
		driver.findElement(partyType).click();
		WebElement ss = driver.findElement(partyType);
		Select s = new Select(ss);
		s.selectByIndex(2);
		
	}
	public void SelectGstfromlist() {
		driver.findElement(GstReg).click();
		WebElement ss = driver.findElement(GstReg);
		Select s = new Select(ss);
		s.selectByIndex(1);
	}
	public void EnterGst(String name) {
		driver.findElement(Gst).sendKeys(name);
	}
	public void EnterPan(String name) {
		driver.findElement(Pan).sendKeys(name);
	}
	public void EnterPartyname(String name) {
		driver.findElement(Partyname).sendKeys(name);
	}
	public void EnterOpBalance(String num) {
		driver.findElement(opBalance).sendKeys(num);
	}
	public void ClickLess10cr() {
		driver.findElement(Less10cr).click();
	}
	public void Clickgreat10cr() {
		driver.findElement(Great10Cr).click();
	}
	public void EnterAddress(String name) {
		driver.findElement(Address).sendKeys(name);
	}
	public void Selectstatefromlist() {
		driver.findElement(Statedrp).click();
		WebElement ss = driver.findElement(Statedrp);
		Select s = new Select(ss);
		s.selectByIndex(36);
	}
	public void SelectDistctfromlist() throws Exception {
		driver.findElement(District).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District);
		Select s = new Select(ss);
		s.selectByIndex(5);
	}
	public void EnterLocation() {
		driver.findElement(Location).click();
		WebElement ss = driver.findElement(Location);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterPincode(String num) {
		driver.findElement(pincode).sendKeys(num);
	}
	public void Enteremail(String name) {
		driver.findElement(Email).sendKeys(name);
	}
	public void EnterMobile(String num) {
		driver.findElement(Contact).sendKeys(num);
	}
	public void Entercheck() {
		driver.findElement(CheckYes).click();;
	}
	public void EnterUnitname(String name) {
		driver.findElement(UnitName).sendKeys(name);
	}
	public void EnterBillAddress(String name) {
		driver.findElement(Address2).sendKeys(name);
	}
	public void SelectBillstatefromlist() {
		driver.findElement(State2).click();
		WebElement ss = driver.findElement(State2);
		Select s = new Select(ss);
		s.selectByIndex(36);
	}
	public void SelectBillDistctfromlist() throws Exception {
		driver.findElement(District2).click();
		Thread.sleep(5000);
		WebElement ss = driver.findElement(District2);
		Select s = new Select(ss);
		s.selectByIndex(4);
	}
	public void EnterBillLocation() {
		driver.findElement(Location2).click();
		WebElement ss = driver.findElement(Location2);
		Select s = new Select(ss);
		s.selectByIndex(2);
	}
	public void EnterBillPincode(String num) {
		driver.findElement(pincode2).sendKeys(num);
	}
	public void ClickonSave() {
		driver.findElement(Save).click();
	}
	public void ClickonAddRow() {
		driver.findElement(AddRow).click();
	}
	
	
	
	
}

















